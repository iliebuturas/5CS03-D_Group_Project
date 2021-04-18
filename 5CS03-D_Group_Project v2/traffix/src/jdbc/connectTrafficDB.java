/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 
 */
public class connectTrafficDB {

    public static Connection getConnection() {

        try {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:traffic_data.db";
            Connection conn = DriverManager.getConnection(url);
            return conn;
        } catch (Exception e) {
            return null;
        }
    }

}
