/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Connect;
import entity.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author phant
 */
public class Dao_NhanVien {
    public ArrayList<NhanVien> getAllNhanVien() {
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        Connect.getInstance();
        Connection con = Connect.getConnection();
        String url = "Select * from NhanVien";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(url);
            while(rs.next()) {
                listNhanVien.add(new NhanVien(rs.getString(1),rs.getString(2) , rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
                        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }  
        return listNhanVien;
    }
    
    /**
     * Thêm dữ liệu Nhân Viên vào database 
     * @param nv 
     */
    public void themNhanVien(NhanVien nv) {
        Connection con = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "insert into NhanVien values(?, ?, ?, ?, ?, ?, ?)";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, nv.getMaNV());
            prestmt.setString(2, nv.getHoTen());
            prestmt.setString(3, nv.getChuVu());
            prestmt.setString(4, nv.getEmail());
            prestmt.setString(5, nv.getSdt());
            prestmt.setString(6, nv.getDiaChi());
            prestmt.setString(7, nv.getGioiTinh());
            prestmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                 prestmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Xóa dữ liệu Nhân viên trên database
     * @param manv 
     */
    public void xoaNhanVien(String manv) {
        Connection con  = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "delete from NhanVien where maNV = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, manv);
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
     * Cập nhật thông tin nhân viên 
     * @param nv 
     */
    public void capNhatNhanVien(NhanVien nv) {
        Connection con  = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "update NhanVien set hoTen = ?, chucVu = ?, email = ?, sdt = ?, diaChi = ?, gioiTinh = ? where maNV = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, nv.getHoTen());
            prestmt.setString(2, nv.getChuVu());
            prestmt.setString(3, nv.getEmail());
            prestmt.setString(4, nv.getSdt());
            prestmt.setString(5, nv.getDiaChi());
            prestmt.setString(6, nv.getGioiTinh());
            prestmt.setString(7, nv.getMaNV());
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
     * Tìm kiếm nhà cung cấp 
     */
    public ArrayList<NhanVien> timKiemNhaCungCap(String maNV, String tenNV, String sdt, String email, String chucVu, String diaChi) {
        ArrayList<NhanVien> listNhanVienTim = new ArrayList<>();
        Connection con = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "Select * from NhanVien where maNV like ? and hoTen like ? and sdt like ? and email like ? and chucVu like ? and diaChi like ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, "%"+maNV+"%");
            prestmt.setString(2, "%"+tenNV+"%");
            prestmt.setString(3, "%"+sdt+"%");
            prestmt.setString(4, "%"+email+"%");
            prestmt.setString(5, "%"+chucVu+"%");
            prestmt.setString(6, "%"+diaChi+"%");
            ResultSet rs = prestmt.executeQuery();
            while(rs.next()){
               listNhanVienTim.add(new NhanVien(rs.getString(1),rs.getString(2) , rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                prestmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listNhanVienTim;
    }
}
