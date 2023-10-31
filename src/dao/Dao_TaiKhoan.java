/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Connect;
import entity.NhanVien;
import entity.TaiKhoan;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author phant
 */
public class Dao_TaiKhoan {
    private Dao_NhanVien daoNhanVien;
    public ArrayList<TaiKhoan> getAllTaiKhoan() {
        daoNhanVien = new Dao_NhanVien();
        ArrayList<TaiKhoan> listTK= new ArrayList<>();
        Connect.getInstance();
        Connection con = Connect.getConnection();
        String url = "select * from TaiKhoan";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(url);
            while (rs.next()) {                
                String maNV = rs.getString(4);
                NhanVien nhanVien = daoNhanVien.getNhanVienTheoMa(maNV);
                
                listTK.add(new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3), nhanVien, rs.getBoolean(5)));                        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listTK;
    }
    
    public ArrayList<TaiKhoan> getAllTaiKhoanConHoatDong() {
        daoNhanVien = new Dao_NhanVien();
        ArrayList<TaiKhoan> listTK= new ArrayList<>();
        Connect.getInstance();
        Connection con = Connect.getConnection();
        String url = "select * from TaiKhoan where trangThai = 1";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(url);
            while (rs.next()) {                
                String maNV = rs.getString(4);
                NhanVien nhanVien = daoNhanVien.getNhanVienTheoMa(maNV);
                
                listTK.add(new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3), nhanVien, rs.getBoolean(5)));                        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listTK;
    }
    
    /**
     * Thêm tài khoản
     * @param taiKhoan 
     */
    public void themTaiKhoan(TaiKhoan taiKhoan) {
        Connection con = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "insert into TaiKhoan values(?, ?, ?, ?,?)";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, taiKhoan.getTenTaiKhoan());
            prestmt.setString(2, taiKhoan.getMatKhau());
            prestmt.setString(3, taiKhoan.getPhanQuyen());
            prestmt.setString(4, taiKhoan.getNhanVien().getMaNV());
            prestmt.setBoolean(5, taiKhoan.isTrangThai());
            prestmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            try {
                 prestmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     *  set cho trạng thái là nghỉ làm, không xóa hẳn trong CSDL
     * @param maNhanVien 
     */
    public void xoaTaiKhoan(String maNhanVien) {
        Connection con = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "update TaiKhoan set trangThai = 0 where maNV = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, maNhanVien);            
            prestmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            try {
                 prestmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     *  set cho trạng thái là hoạt động
     * @param maNhanVien 
     */
    public void capNhatTaiKhoan(String maNhanVien) {
        Connection con = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "update TaiKhoan set trangThai = 1 where maNV = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, maNhanVien);            
            prestmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            try {
                 prestmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Đổi mật khẩu tài khoản
     * @param taiKhoan 
     */
    public void doiMatKhauTaiKhoan(TaiKhoan taiKhoan) {
       Connection con = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "update TaiKhoan set matKhau = ? where tenTaiKhoan = ?";
        try {
            prestmt = con.prepareStatement(url);
            
            prestmt.setString(1, taiKhoan.getMatKhau());
            prestmt.setString(2, taiKhoan.getTenTaiKhoan());
            prestmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            try {
                 prestmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    /**
     * Kiểm tra tài khoản đăng nhập
     * @param tenTaiKhoan
     * @param matKhau
     * @return 
     */
    public TaiKhoan dangNhapTaiKhoan(String tenTaiKhoan, String matKhau) {
        daoNhanVien = new Dao_NhanVien();
        
        Connection con = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "select * from TaiKhoan where tenTaiKhoan = ? and matKhau = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, tenTaiKhoan);
            prestmt.setString(2, matKhau);
            ResultSet rs = prestmt.executeQuery();
            while(rs.next()) {
                String maNV = rs.getString(4);                
                NhanVien nhanVien = daoNhanVien.getNhanVienTheoMa(maNV);
                
                TaiKhoan taiKhoan = new TaiKhoan(rs.getString(1), rs.getString(2), rs.getString(3), nhanVien, rs.getBoolean(5));
                return taiKhoan;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
