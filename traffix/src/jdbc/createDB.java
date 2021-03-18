/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;


/**
 *
 * @author 
 */
public class createDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Connect();
    }
}

class Connect {

    private String urlSQLite;
    private Driver driverSQLite;
    private Connection conSQLite;

    public Connect() {
        urlSQLite = "jdbc:sqlite:traffic_data.db";
        urlSQLite = "jdbc:sqlite:users_data.db";        

        try {
            driverSQLite = new org.sqlite.JDBC();
            DriverManager.registerDriver(driverSQLite);
            System.out.println("Driver for SQLite downloaded.");
        } catch (Exception e) {
            System.out.println("Problem with download driver for SQLite: " + e.getMessage());
        }

        try {
            conSQLite = DriverManager.getConnection(urlSQLite); //Creates the database if it does not exist.
            System.out.println("Connection to SQLite is done.");
        } catch (Exception e) {
            System.out.println("Problem with connection to SQLite: " + e.getMessage());
        }

        try {
            if (!conSQLite.isClosed()) {
                conSQLite.close();
                System.out.println("Connection to SQLite closed.");
            }
        } catch (Exception e) {
            System.out.println("Problem with close connection of SQLite");
        }

    }

}

