/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import connectDB.Connect;
import entity.MauSac;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author phant
 */
public class Dao_MauSac {
    
    public ArrayList<MauSac> getAllMauSac() {
        ArrayList<MauSac> listMauSac = new ArrayList<>();
        Connect.getInstance();
        Connection con = Connect.getConnection();
        String url = "select * from MauSac";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(url);
            while (rs.next()) {                
                listMauSac.add(new MauSac(rs.getString(1), rs.getString(2)));                        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMauSac;
    }
    
    public MauSac getDLMauSacTheoMa(String maMS) {
        Connect.getInstance();
        Connection con = Connect.getConnection();
        PreparedStatement prestmt = null;
        String url = "select * from MauSac where maMauSac = ?";
        
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, maMS);
            ResultSet rs = prestmt.executeQuery();
            while (rs.next()) {                
                MauSac ms = new MauSac();
                ms.setMaMauSac(rs.getString(1));
                ms.setMauSac(rs.getString(2));
                return ms;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public MauSac getMauSacTheoTen(String tenMauSac){
        Connect.getInstance();
        Connection con = Connect.getConnection();
        
        try {
            String sql = "select * from MauSac where tenMauSac = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, tenMauSac);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                MauSac mauSac = new MauSac(rs.getString(1), rs.getString(2));
                return mauSac;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
