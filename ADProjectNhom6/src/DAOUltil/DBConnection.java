/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOUltil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DBConnection {

    private static Connection conn = null;
    public static String port = "3306";
    public static String hostName = "localhost";
    public static String sqlInstanceName = "BTANH2020";
    public static String database = "adass6";
    public static String userName = "root";
    public static String password = "2281998";

    // Kết nối vào SQLServer.
    // (Sử dụng thư viện điều khiển SQLJDBC)
    public static Connection getMySQLConnection()
            throws SQLException, ClassNotFoundException {
        if (conn == null) {
            return getMySQLConnection(hostName, port,
                    database,userName,password);
        } else {
            return conn;
        }
    }

//    // Trường hợp sử dụng SQLServer.
//    // Và thư viện SQLJDBC.
//    public static Connection getSQLServerConnection(String hostName,
//            String sqlInstanceName, String database) throws ClassNotFoundException, SQLException {
//        if (conn == null) {
//            // Khai báo class Driver cho DB SQLServer
//            // Việc này cần thiết với Java 5
//            // Java6 tự động tìm kiếm Driver thích hợp.
//            // Nếu bạn dùng Java6, thì ko cần dòng này cũng được.
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            // Cấu trúc URL Connection dành cho SQLServer
//            // Ví dụ:
//            // jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=simplehr
//            String connectionURL
//                    = "jdbc:mysql://"+hostName+":"+port+"/"+database;
//
//            conn = DriverManager.getConnection(connectionURL);
//        }
//
//        return conn;
//    }

    public static Connection getMySQLConnection(String hostName,String port,
             String database, String userName,
            String password) throws ClassNotFoundException, SQLException {
        if(conn == null){
            // Khai báo class Driver cho DB SQLServer
            // Việc này cần thiết với Java 5
            // Java6 tự động tìm kiếm Driver thích hợp.
            // Nếu bạn dùng Java6, thì ko cần dòng này cũng được.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Cấu trúc URL Connection dành cho SQLServer
            // Ví dụ:
            // jdbc:sqlserver://ServerIp:1433/SQLEXPRESS;databaseName=simplehr
            String connectionURL= "jdbc:mysql://"+hostName+":"+port+"/"+database;
            conn = (Connection)DriverManager.getConnection(connectionURL, userName,
                    password);
        }
        return conn;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println(DBConnection.getMySQLConnection());
    }

}
