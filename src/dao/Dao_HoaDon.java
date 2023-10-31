/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.HoaDon;
import connectDB.Connect;
import entity.KhachHang;
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
public class Dao_HoaDon {
    private Dao_KhachHang daoKhachHang;
    private Dao_NhanVien daoNhanVien;
    public ArrayList<HoaDon> getAllHoaDon() {
        daoKhachHang = new Dao_KhachHang();
        daoNhanVien = new Dao_NhanVien();
        
         ArrayList<HoaDon> listHoaDon = new ArrayList<>();
         Connect.getInstance();
         Connection con = Connect.getConnection();
         String url = "select * from HoaDon";
         try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(url);
            while(rs.next()) {
                String maKH = rs.getString(2);
                KhachHang khachHang = daoKhachHang.getKhachHangTheoMa(maKH);
                
                String maNV = rs.getString(3);
                NhanVien nhanVien = daoNhanVien.getNhanVienTheoMa(maNV);
                listHoaDon.add(new HoaDon(rs.getString(1), khachHang, nhanVien, rs.getDate(4)));
            } 
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return listHoaDon;
    }
    
    /**
     * Tính tổng tiền của 1 hóa đơn
     * @param maHD
     * @return 
     */
    public double  tongTienHoaDon(String maHD) {
        Connection con =  Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "select hd.maHD, SUM( cthd.soLuong*sp.giaBan) as tongTien from HoaDon hd \n" +
                                        "   JOIN  CTHD cthd ON hd.maHD = cthd.maHD \n" +
                                        "   JOIN SanPham sp ON cthd.maSP = sp.maSP\n" +
                    "where hd.maHD = ?\n" +
                    "group by hd.maHD";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, maHD);
            ResultSet rs = prestmt.executeQuery();
            while(rs.next()){
                double tongTien = rs.getDouble(2);
                return tongTien;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    /**
     * Lấy thông tin hóa đơn theo mã
     */
    public HoaDon getHoaDonTheoMa(String maHD) {
        daoKhachHang = new Dao_KhachHang();
        daoNhanVien = new Dao_NhanVien();
        Connection con =  Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "Select * from HoaDon where maHD =?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, maHD);
            ResultSet rs = prestmt.executeQuery();
            while(rs.next()){
                String maKH = rs.getString(2);
                KhachHang khachHang = daoKhachHang.getKhachHangTheoMa(maKH);
                
                String maNV = rs.getString(3);
                NhanVien nhanVien = daoNhanVien.getNhanVienTheoMa(maNV);
                HoaDon hd = new HoaDon(rs.getString(1), khachHang, nhanVien, rs.getDate(4));
                return hd;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    /**
     * Lấy danh sách hóa đơn theo ngày
     * @return 
     */
    public ArrayList<HoaDon> getAllHoaDonTheoNgay(String tuNgay, String denNgay) {
        daoKhachHang = new Dao_KhachHang();
        daoNhanVien = new Dao_NhanVien();
        
         ArrayList<HoaDon> listHoaDon = new ArrayList<>();
         Connect.getInstance();
         Connection con = Connect.getConnection();
         String url = "select * from HoaDon where ngayLap >= ? and ngayLap <= ?";
         try {
            PreparedStatement prestmt = con.prepareStatement(url);
            prestmt.setString(1, tuNgay);
            prestmt.setString(2, denNgay);
            ResultSet rs = prestmt.executeQuery();
            while(rs.next()) {
                String maKH = rs.getString(2);
                KhachHang khachHang = daoKhachHang.getKhachHangTheoMa(maKH);
                
                String maNV = rs.getString(3);
                NhanVien nhanVien = daoNhanVien.getNhanVienTheoMa(maNV);
                listHoaDon.add(new HoaDon(rs.getString(1), khachHang, nhanVien, rs.getDate(4)));
            } 
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return listHoaDon;
    }
    
    /**
     * Tạo tự động mã
     * @return 
     */
    public String taoMaHoaDon() {
        Connection con = Connect.getInstance().getConnection();
        String url = "select top 1 maHD from HoaDon order by maHD desc";
        
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(url);
            if(rs.next()) {
                String maHD = rs.getString(1);
                int so = Integer.parseInt(maHD.substring(4));
                so++;
                String maHDMoi = so + "";
                while(maHDMoi.length() < 4) {
                    maHDMoi = "0" +maHDMoi;
                    
                }
                return "HD" + maHDMoi;
            } else {
                return "HD0001";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
