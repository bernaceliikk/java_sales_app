
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import props.Category;
import useutils.DB;


public class CategoryModel {
    
    public List<Category> cls = new ArrayList<>();
    
    public int categoryInsert( String ctitle ) {
        int statu = -1;
        
        try {
            DB db = new DB();
            String query = "insert into category values ( null, ?, now() )";
            PreparedStatement pre = db.fncPre(query);
            pre.setString(1, ctitle);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("Category insert error : "+e);
        }
        
        return statu;
    }
    
    
    public void categoryAllResult() {
        cls.clear();
        try {
            DB db = new DB();
            String query = "select * from category";
            ResultSet rs = db.fncPre(query).executeQuery();
            while( rs.next() ) {
                Category c = new Category();
                c.setCid(rs.getInt("cid"));
                c.setCtitle(rs.getString("ctitle"));
                c.setCdate(rs.getString("cdate"));
                cls.add(c);
            }
            db.close();
        } catch (Exception e) {
            System.err.println("categoryAllResult Error : " + e);
        }
        
    }
    
    
    public DefaultTableModel categoryTable() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("id");
        dtm.addColumn("Title");
        dtm.addColumn("Date");
        
        for (Category item : cls) {
            Object[] row = { item.getCid(), item.getCtitle(), item.getCdate() };
            dtm.addRow(row);
        }
        return dtm;
    }
    
    
    public DefaultComboBoxModel<String> categoryCombobox() {
        DefaultComboBoxModel<String> dcm = new DefaultComboBoxModel<>();
        for (Category item : cls) {
            dcm.addElement(item.getCtitle());
        }
        return dcm;
    }
    
    
    public int categoryUpdate( int cid, String cTitle ){
        int statu = -1;
        try {
            DB db = new DB();
            String query = "update category set ctitle = ? where cid = ?";
            PreparedStatement pre = db.fncPre(query);
            pre.setString(1, cTitle);
            pre.setInt(2, cid);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("categoryUpdate error : " + e);
        }
        return statu;
    }
    
    
    public int categoryDelete( int cid ){
        int statu = -1;
        try {
            DB db = new DB();
            String query = "delete from category where cid = ?";
            PreparedStatement pre = db.fncPre(query);
            pre.setInt(1, cid);
            statu = pre.executeUpdate();
            db.close();
        } catch (Exception e) {
            System.err.println("categoryDelete error : " + e);
        }
        return statu;
    }
    
    
}
