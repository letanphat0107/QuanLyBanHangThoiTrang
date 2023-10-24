/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Connect;
import entity.KichThuoc;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author phant
 */
public class Dao_KichThuoc {
    
    public ArrayList<KichThuoc> getAllKichThuoc() {
        ArrayList<KichThuoc> listKichThuoc = new ArrayList<>();
        Connect.getInstance();
        Connection con = Connect.getConnection();
        String url = "select * from KichThuoc";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(url);
            while (rs.next()) {                
                listKichThuoc.add(new KichThuoc(rs.getString(1), rs.getString(2)));                        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listKichThuoc;
    }
    
    public KichThuoc getDLKichThuocTheoMa(String maKT) {
        Connect.getInstance();
        Connection con = Connect.getConnection();
        PreparedStatement prestmt = null;
        String url = "select * from KichThuoc where maKichThuoc = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, maKT);
            ResultSet rs = prestmt.executeQuery();
            while (rs.next()) {                
                KichThuoc kt = new KichThuoc();
                kt.setMaKichThuoc(rs.getString(1));
                kt.setKichThuoc(rs.getString(2));
                return kt;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return null;
    } 
}
