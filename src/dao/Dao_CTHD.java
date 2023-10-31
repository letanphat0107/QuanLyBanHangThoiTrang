/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Connect;
import entity.CTHD;
import entity.HoaDon;
import entity.SanPham;
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
public class Dao_CTHD {
    private Dao_SanPham daoSanPham;
    private Dao_HoaDon daoHoaDon;
    
    /**
     * Lấy Chi tiết hóa đơn theo mã hóa đơn
     * @param maHD
     * @return 
     */
    public ArrayList<CTHD> getAllCTHD(String maHD) {
        daoSanPham = new Dao_SanPham();
        daoHoaDon = new Dao_HoaDon();
              
        ArrayList<CTHD> listCTHD = new ArrayList<>();
        Connect.getInstance();
        Connection con = Connect.getConnection();
        String url ="select * from CTHD where maHD = ?";
        try {
            PreparedStatement prestmt = con.prepareStatement(url);
            prestmt.setString(1, maHD);
            ResultSet rs = prestmt.executeQuery();
            while(rs.next()){
                String maSP = rs.getString(2);
                SanPham sanPham = daoSanPham.getSanPhamTheoMa(maSP);
                
                HoaDon hoaDon = daoHoaDon.getHoaDonTheoMa(maHD);
                listCTHD.add(new CTHD(sanPham, hoaDon, rs.getInt(3)));
                        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCTHD;
    }
    
    /**
     * Tính tổng tiền của 1 sản phẩm ứng với hóa đơn
     * @param maHD
     * @return 
     */
    public double  tinhThanhTienSanPham(String maHD, String maSP) {
        Connection con =  Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "select hd.maHD, cthd.soLuong*sp.giaBan as thanhTien from HoaDon hd \n" +
                                        "   JOIN  CTHD cthd ON hd.maHD = cthd.maHD \n" +
                                        "   JOIN SanPham sp ON cthd.maSP = sp.maSP\n" +
                    "where hd.maHD = ? and cthd.maSP = ?\n"; 
                    
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, maHD);
            prestmt.setString(2, maSP);
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
}
