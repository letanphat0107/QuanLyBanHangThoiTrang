/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import connectDB.Connect;
import entity.PhanLoai;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 *
 * @author phant
 */
public class Dao_PhanLoai {
    
    public ArrayList<PhanLoai> getAllPhanLoai() {
        ArrayList<PhanLoai> listPhanLoai = new ArrayList<>();
        Connect.getInstance();
        Connection con = Connect.getConnection();
        String url = "Select * from PhanLoai";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(url);
            while (rs.next()) {                
                listPhanLoai.add(new PhanLoai(rs.getString(1), rs.getString(2)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listPhanLoai;
    }
    
    public PhanLoai getDLPhanLoaiSPTheoMa(String maPL) {
        Connect.getInstance();
        Connection con = Connect.getConnection();
        PreparedStatement prestmt = null;
        String url = "select * from PhanLoai where maPhanLoai = ?";
        
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, maPL);
            ResultSet rs = prestmt.executeQuery();
            while (rs.next()) {                
                PhanLoai pl = new PhanLoai();
                pl.setMaPhanLoai(rs.getString(1));
                pl.setLoaiSanPham(rs.getString(2));
                return pl;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
