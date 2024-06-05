/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlysinhvien.data;

import util.ENV;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Harmoury
 */
public class ConnectDB {
    public static Connection con;
    public static Statement stmt;

    public static void initialize() {
        try {
            System.out.println("Connecting to database");
            String host = ENV.get("DB_HOST");
            String port = ENV.get("DB_PORT");
            String dbname = ENV.get("DB_NAME");
            String username = ENV.get("DB_USER");
            String password = ENV.get("DB_PASS");
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectDB.con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + dbname, username, password);
            System.out.println("CON" + con.toString());
            ConnectDB.stmt = con.createStatement();
            System.out.println("STMT" + stmt.toString());
            if (stmt != null) {
                System.out.println("Connected to database");
            }
        } catch (Exception ex) {
            System.out.println("ERR in ConnectDB.java: " + ex);
        }
    }

}
