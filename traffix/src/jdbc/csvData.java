/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author 
 */
public class csvData {
        
    public static void main(String[] args) {
        Connection con = connectTrafficDB.getConnection();
        Statement stmt = null;

        try {
            FileInputStream fstream = new FileInputStream("./dft_rawcount_local_authority_id_146.csv");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            ArrayList list = new ArrayList();
            ArrayList IdChecker = new ArrayList();
            int count = 0;
            while ((strLine = br.readLine()) != null) {
                list.add(strLine);
                count++;
            }
            list.remove(0);
            Iterator itr;
            for (itr = list.iterator(); itr.hasNext();) {
                String str = itr.next().toString();
                String[] splitSt = str.split(",");
                
                
                /*if (!IdChecker.contains(splitSt[5])) {
                    IdChecker.add(splitSt[5]);
                    int region_id = Integer.parseInt(splitSt[5]);
                    String region_name = splitSt[6];
                    String sqlString = "INSERT INTO Region (region_id, region_name) VALUES (" + region_id + ",'" + region_name + "');";
                    System.out.println("sqlString : "+ sqlString);
                    con.setAutoCommit(false);
                    stmt = con.createStatement();

                    stmt.executeUpdate(sqlString);
                    stmt.close();
                    con.commit();

                } else {
                    System.out.println("Duplicate record with pk :" + splitSt[5]);
                }
                
                if (!IdChecker.contains(splitSt[7])) {
                    IdChecker.add(splitSt[7]);
                    int local_authority_id = Integer.parseInt(splitSt[7]);
                    String local_authority_name = splitSt[8];
                    int region_id = Integer.parseInt(splitSt[5]);
                    String sqlString = "INSERT INTO Local_Authority (local_authority_id, local_authority_name, region_id) VALUES (" + local_authority_id + ",'" + local_authority_name + "'," + region_id + ");";
                    System.out.println("sqlString : "+ sqlString);
                    con.setAutoCommit(false);
                    stmt = con.createStatement();

                    stmt.executeUpdate(sqlString);
                    stmt.close();
                    con.commit();

                } else {
                    System.out.println("Duplicate record with pk :" + splitSt[7]);
                }
                
                if (!IdChecker.contains(splitSt[9])) {
                    IdChecker.add(splitSt[9]);
                    String road_name = splitSt[9];
                    String road_type = splitSt[10];
                    int local_authority_id = Integer.parseInt(splitSt[7]);
                    String sqlString = "INSERT INTO Road (road_name, road_type, local_authority_id) VALUES ('" + road_name + "','" + road_type + "'," + local_authority_id + ");";
                    System.out.println("sqlString : "+ sqlString);
                    con.setAutoCommit(false);
                    stmt = con.createStatement();

                    stmt.executeUpdate(sqlString);
                    stmt.close();
                    con.commit();

                } else {
                    System.out.println("Duplicate record with pk :" + splitSt[9]);
                }*/
                
                if (!IdChecker.contains(splitSt[0])) {
                    IdChecker.add(splitSt[0]);
                    int count_point_id = Integer.parseInt(splitSt[0]);
                    String start_junction_road_name = splitSt[11];
                    String end_junction_road_name = splitSt[12];
                    int easting = Integer.parseInt(splitSt[13]);
                    int northing = Integer.parseInt(splitSt[14]);
                    String latitude = splitSt[15];
                    String longitude = splitSt[16];
                    Double d_km = Double.valueOf(splitSt[17]);
                    BigDecimal link_length_km = BigDecimal.valueOf(d_km);
                    Double d_m = Double.valueOf(splitSt[18]);
                    BigDecimal link_length_miles = BigDecimal.valueOf(d_m);
                    String road_name = splitSt[9];
                    String sqlString = "INSERT INTO Count_Point (count_point_id, start_junction_road_name, end_junction_road_name, easting, northing, latitude, longitude, link_length_km, link_length_miles, road_name) VALUES ("+count_point_id+", '" +start_junction_road_name+ "', '"+end_junction_road_name+"',"+easting+", "+northing+", '"+latitude+"', '"+longitude+"', "+link_length_km+", "+link_length_miles+", '"+road_name+"');";
                    System.out.println("sqlString : "+ sqlString);
                    con.setAutoCommit(false);
                    stmt = con.createStatement();

                    stmt.executeUpdate(sqlString);
                    stmt.close();
                    con.commit();

                } else {
                    System.out.println("Duplicate record with pk :" + splitSt[0]);
                }
               
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
