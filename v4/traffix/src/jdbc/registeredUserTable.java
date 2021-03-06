/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
/**
 *
 * @author Group D
 * @author Vasil Dzhakov
 * @author Ille Buturas
 */
public class registeredUserTable {

    public static Connection con = connectUsersDB.getConnection();

//    public static void main(String[] args) {
//        //TESTING
//        //insert("KeithAdmin", "Yes", "Keith", "Smith", "Keith@gmail.com", "123456");
//        //showAll();
//    }
    
    //insert new user to the Users database
    public static void insert(String username,String adminFlag,String firstName,String lastName,String email,String password) {
        Connection con = connectUsersDB.getConnection();
        Statement stmt = null;
        
        //SQL to add values in table
        String sqlString = ("INSERT OR IGNORE INTO Users(username,adminFlag,firstName,lastName,email,password) "
                + "VALUES ('" + username + "','" + adminFlag + "','" + firstName + "','" + lastName + "','" + email + "','" + password + "' );");
        try {
            con.setAutoCommit(false);
            stmt = con.createStatement();
            stmt.executeUpdate(sqlString);
            stmt.close();
            con.commit();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    System.err.println("SQLException: " + e.getMessage());
                }
            }
        }
    }
    
    //get email from Users database
    public static ResultSet get(String email) {
        Connection conn = connectUsersDB.getConnection();
        String sql = "SELECT * FROM Users WHERE email = '" + email + "'";
        ResultSet result = null;
        try {
            Statement statement = conn.createStatement();
            result = statement.executeQuery(sql);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error while getting from Users table" + e.getMessage());
        } finally {
            return result;
        }
    }
    
    //get username from Users database
    public static ResultSet getUsername(String username) {
        Connection conn = connectUsersDB.getConnection();
        String sql = "SELECT * FROM Users WHERE username = '" + username + "'";
        ResultSet result = null;
        try {
            Statement statement = conn.createStatement();
            result = statement.executeQuery(sql);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error while getting from Users table" + e.getMessage());
        } finally {
            return result;
        }
    }
    
    //get Password from Users database
    public static ResultSet getPassword(String password) {
        Connection conn = connectUsersDB.getConnection();
        String sql = "SELECT * FROM Users WHERE password = '" + password + "'";
        ResultSet result = null;
        try {
            Statement statement = conn.createStatement();
            result = statement.executeQuery(sql);
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error while getting from Users table" + e.getMessage());
        } finally {
            return result;
        }
    }

    //show all users in database FOR TESTING
    
//    public static void showAll() {
//        Connection con = connectUsersDB.getConnection();
//        Statement stmt = null;
//        try {
//            stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery("Select * from Users");
//
//            int n = 0;
//            while (rs.next()) {
//                int numColumns = rs.getMetaData().getColumnCount();
//                n++;
//                for (int i = 1; i <= numColumns; i++) {
//                    System.out.print(" " + rs.getObject(i));
//                }
//
//                System.out.println("");
//            }
//
//            rs.close();
//        } catch (SQLException ex) {
//            System.err.println("SQLException: " + ex.getMessage());
//        } finally {
//            if (stmt != null) {
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    System.err.println("SQLException: " + e.getMessage());
//                }
//            }
//            if (con != null) {
//                try {
//                    con.close();
//                } catch (SQLException e) {
//                    System.err.println("SQLException: " + e.getMessage());
//                }
//            }
//        }
//
//    }
    
}
