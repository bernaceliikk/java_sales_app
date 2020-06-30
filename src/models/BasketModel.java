
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import props.Basket;
import useutils.DB;
import useutils.Util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;


public class BasketModel {
    
    public List<Basket> bls = new ArrayList<>();
    
    public int basketInsert(int bpid) {
        int statu = -1;
        try {
            DB db = new DB();
            String query = "insert into basket values ( null, ?, 1, ?, now() )";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, bpid);
            pre.setInt(2, Util.us.getUid());
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("basketInsert error : " + e);
        }
        return statu;
    }
    
    
    public void basketResult() {
        bls.clear();
        try {
            DB db = new DB();
            String query = "SELECT b.bid, p.prid, p.curType,  p.prstock, p.prtitle, p.prprice, u.uname, b.bdate from basket as b inner JOIN product as p on b.bpid = p.prid  INNER JOIN user as u ON b.bprid = u.uid  where b.bstatu = 1  and b.bprid = ?";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, Util.us.getUid());
            ResultSet rs = pre.executeQuery();
            while(rs.next()) {
                Basket bs = new Basket();
                bs.setBid(rs.getInt("bid"));
                bs.setBpid(rs.getInt("prid"));
                bs.setPrstock(rs.getInt("prstock"));
                bs.setPrtitle(rs.getString("prtitle"));
                bs.setPrprice(rs.getDouble("prprice"));
                bs.setUname(rs.getString("uname"));
                bs.setBdate(rs.getString("bdate"));
                bs.setCurType(rs.getInt("curType"));
                bls.add(bs);
            }
            db.close();
        } catch (Exception e) {
            System.err.println("basketResult error : " + e);
        }
    }
        
     
    public DefaultTableModel basketTableModel() {
        DefaultTableModel dtm = new DefaultTableModel();
        
        dtm.addColumn("bid");
        dtm.addColumn("prtitle");
        dtm.addColumn("prprice");
        dtm.addColumn("uname");
        dtm.addColumn("bdate");
        
        for ( Basket item : bls ) {
            if (item.getCurType() > 0) {
                double tPrice = fncCurTypeConvert(item.getCurType(), item.getPrprice() );
                item.setPrprice(tPrice);
            }
            Object[] row = { item.getBid(), item.getPrtitle(), item.getPrprice(), item.getUname(), item.getBdate() };
            dtm.addRow(row);
        }

        return dtm;
    }
    
    
    public double fncCurTypeConvert( int type, double  price) {
        String title = "";
        double totalPrice = 0;
        if (type == 1) {
            title = "ABD DOLARI";
        }
        if (type == 2) {
            title = "EURO";
        }
        
        try {
            String url = "https://www.tcmb.gov.tr/kurlar/today.xml";
            String data = Jsoup.connect(url).timeout(30000).ignoreContentType(true).get().toString();
            Document doc = Jsoup.parse(data, "", Parser.xmlParser());
            Elements elmnts = doc.getElementsByTag("Currency");
            
            for ( Element item : elmnts ) {
                String Isim = item.getElementsByTag("Isim").text();
                if (Isim.equals(title)) {
                    String ForexBuying = item.getElementsByTag("BanknoteSelling").text();
                    double f = Double.parseDouble(ForexBuying);
                    totalPrice = f * price;
                    break;
                }
            }
            
        } catch (Exception e) {
            System.err.println("Connection Error : " + e);
        }
        
        return totalPrice;
    }
    
    
    
    public int deleteBasketItems( List<Integer> ids ) {
        int statu = -1;
        try {
            
            String q = "(";
            for(int i : ids) {
                q += ""+i+",";
            }
            q += ")";
            q = q.replace(",)", ")");
            
            DB db = new DB();
            String query = "delete from basket where bid in "+q+" ";
            PreparedStatement pre = db.fncPre(query);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("deleteBasketItems error : " + e);
        }
        return statu;
    }
    
    
    public int salesBasket () {
        int statu = -1;
        
        try {
            DB db = new DB();
            String query = "update basket set bstatu = 0 where bprid = ?";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, Util.us.getUid());
            statu = pre.executeUpdate();
            if (statu > 0) {
                // stok düş
                for (Basket bl : bls) {
                    int stok = bl.getPrstock() - 1;
                    String queryUp = "update product set prstock = ? where prid = ?";
                    PreparedStatement preu = db.fncPre(queryUp);
                    preu.setInt(1, stok);
                    preu.setInt(2, bl.getBpid());
                    preu.executeUpdate();
                }
            }
            db.close();
        } catch (Exception e) {
            System.err.println("salesBasket error : " + e);
        }
        return statu;
    }
    
        
}
