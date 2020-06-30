
package useutils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB {
    
    
    private final String driver = "com.mysql.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost/sales_app";
    private final String userName = "root";
    private final String userPass = "";
    
    private Connection conn = null;
    private PreparedStatement pre = null;
    
    public DB() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, userName, userPass);
            System.out.println("Welcome");
        } catch (Exception e) {
            System.err.println("DB Connect Error : " + e);
        }
    }
    
    
    public PreparedStatement fncPre(String query) {
        try {
            pre = conn.prepareStatement(query);
        } catch (Exception e) {
            System.err.println("PreparedStatement Error : " + e);
        }
        return pre;
    }
    
    
    
    public void close() {
        try {
            pre.close();
            conn.close();
        } catch (Exception e) {
            System.err.println("Close Error : " + e);
        }
    }
    
    
    
}
