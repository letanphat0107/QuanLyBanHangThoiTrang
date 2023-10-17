package dao;

import connectDB.Connect;
import entity.NhaCungCap;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phant
 */
public class Dao_NhaCungCap {
    /**
     * Phương thức lấy dữ liệu của Nhà Cung Câp từ database
     * @return listNhaCungCap
     */    
    public ArrayList<NhaCungCap> getAllNhaCungCap() {
        ArrayList<NhaCungCap> listNhaCungCap = new ArrayList<>();
        Connect.getInstance();
        Connection con = Connect.getConnection();
        String url = "Select * from NhaCungCap";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(url);
            while (rs.next()) {                
                listNhaCungCap.add(new NhaCungCap(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listNhaCungCap;
    }
    
    /**
     * Thêm dữ liệu Nhà Cung Cấp vào database
     * @param ncc 
     */
    public void themNhaCungCap(NhaCungCap ncc) {
        Connection con  = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "insert into NhaCungCap values(?, ?, ?, ?, ?)";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, ncc.getMaNCC());
            prestmt.setString(2, ncc.getTenNCC());
            prestmt.setString(3, ncc.getDiaChi());
            prestmt.setString(4, ncc.getSdt());
            prestmt.setString(5, ncc.getEmail());
            prestmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                prestmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Xóa dữ liệu Nhà Cung Cấp trên database
     * @param ncc 
     */
    public void xoaNhaCungCap(String maNCC) {
        Connection con  = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "delete from NhaCungCap where maNCC = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, maNCC);
            prestmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                prestmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Cập nhật dữ liệu Nhà Cung Cấp trên database
     * @param ncc 
     */
    public void capNhatNhaCungCap(NhaCungCap ncc) {
        Connection con  = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "update NhaCungCap set tenNCC = ?, diaChi = ?, sdt = ?, email = ? where maNCC = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, ncc.getTenNCC());
            prestmt.setString(2, ncc.getDiaChi());
            prestmt.setString(3, ncc.getSdt());
            prestmt.setString(4, ncc.getEmail());
            prestmt.setString(5, ncc.getMaNCC());
            prestmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                prestmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
