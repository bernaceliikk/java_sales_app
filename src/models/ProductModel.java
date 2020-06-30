/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import props.Product;
import useutils.DB;

public class ProductModel {

    List<Product> prls = new ArrayList<>();

    public int productInsert(int prcid, String prtitle, double prprice, String prbarcode, String prshelf, int prstock, String prnote, int curType) {
        int statu = -1;

        try {
            DB db = new DB();
            String query = "insert into product values ( null,?, ?, ?, ?, ?, ?,?, now(), ? )";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, prcid);
            pre.setString(2, prtitle);
            pre.setDouble(3, prprice);
            pre.setString(4, prbarcode);
            pre.setString(5, prshelf);
            pre.setInt(6, prstock);
            pre.setString(7, prnote);
            pre.setInt(8, curType);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("productInsert Error : " + e);
        }
        return statu;
    }

    public void productAllResult(String txt, int statu) {
        prls.clear();
        String query = "";
        
        String addQueryAll = "";
        String addQuerySearch = "";
        if ( statu == 0 ) {
            addQueryAll = " where prstock > 0";
            addQuerySearch = " and prstock > 0";
        }else {
            addQueryAll = " order by prstock asc";
            addQuerySearch = " order by prstock asc";
        }
        
        if (txt.equals("")) {
            query = "SELECT * FROM product " + addQueryAll;
        } else {
            query = "SELECT * FROM product WHERE (prtitle like '%" + txt + "%' or prprice like '%" + txt + "%' "
                    + "or prbarcode like '%" + txt + "%' or prshelf like '%" + txt + "%' or prstock like '%" + txt + "%' "
                    + "or prnote like '%" + txt + "%')  " + addQuerySearch ;
        }
        try {
            DB db = new DB();
            ResultSet rs = db.fncPre(query).executeQuery();
            while (rs.next()) {
                Product pro = new Product();
                pro.setPrid(rs.getInt("prid"));
                pro.setPrcid(rs.getInt("prcid"));
                pro.setPrtitle(rs.getString("prtitle"));
                pro.setPrprice(rs.getDouble("prprice"));
                pro.setPrbarcode(rs.getString("prbarcode"));
                pro.setPrshelf(rs.getString("prshelf"));
                pro.setPrstock(rs.getInt("prstock"));
                pro.setPrnote(rs.getString("prnote"));
                pro.setPrdate(rs.getString("prdate"));
                pro.setCurType(rs.getInt("curType"));
                prls.add(pro);
            }
            db.close();
        } catch (Exception e) {
            System.err.println("productAllResult error : " + e);
        }
    }

    public DefaultTableModel productTable() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("PrCid");
        dtm.addColumn("Başlık");
        dtm.addColumn("Fiyat");
        dtm.addColumn("Barkod");
        dtm.addColumn("Raf");
        dtm.addColumn("Stok");
        dtm.addColumn("Not");
        dtm.addColumn("Tarih");

        for (Product item : prls) {
            Object[] row = {item.getPrid(), item.getPrcid(), item.getPrtitle(), item.getPrprice(), item.getPrbarcode(),
                item.getPrshelf(), item.getPrstock(), item.getPrnote(), item.getPrdate()};
            dtm.addRow(row);
        }

        return dtm;
    }

    public int productUpdate(int prid, int prcid, String prtitle, double prprice, String prbarcode, String prshelf, int prstock, String prnote) {
        int statu = -1;
        try {
            DB db = new DB();
            String query = "update product set prcid = ?,  prtitle = ?, prprice = ?, prbarcode = ?, prshelf = ?, prstock = ?, prnote = ? where prid = ?";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, prcid);
            pre.setString(2, prtitle);
            pre.setDouble(3, prprice);
            pre.setString(4, prbarcode);
            pre.setString(5, prshelf);
            pre.setInt(6, prstock);
            pre.setString(7, prnote);
            pre.setInt(8, prid);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("productUpdate Error : " + e);
        }
        return statu;
    }

    public int productDelete(int prid) {

        int statu = -1;

        try {
            DB db = new DB();
            String query = "delete from product where prid =?";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, prid);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("productDelete error : " + e);
        }
        return statu;
    }

    public int stockDecrease(int quantity, int prid) {
        int statu = -1;
        int stock = 155;
        try {
            DB db = new DB();
            String query = "select * from product where prid = '" + prid + "' ";
            ResultSet rs = db.fncPre(query).executeQuery();
            while (rs.next()) {
                stock = rs.getInt("prstock");
                stock -= quantity;
            }
            db.close();
        } catch (Exception e) {
            System.err.println("stockDecrease Error : " + e);
        }
        try {
            DB db = new DB();
            String query = " update product set prstock = ? where prid = ? ";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, stock);
            pre.setInt(2, prid);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("stockDecrease Error : " + e);
        }
        return statu;
    }
    
}