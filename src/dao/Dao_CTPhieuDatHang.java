/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Connect;
import entity.CTPhieuDatHang;
import entity.PhieuDatHang;
import entity.KhachHang;
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
public class Dao_CTPhieuDatHang {
    private Dao_SanPham dao_SanPham = new dao.Dao_SanPham();
    private Dao_PhieuDatHang dao_PhieuDatHang = new Dao_PhieuDatHang();
    
    /**
     * Lấy Chi tiết phieu dat hang theo mã phieu dat hang
     * @param maHD
     * @return 
     */
    public ArrayList<CTPhieuDatHang> getAllCTPhieuDatHang(String maPhieuDatHang) {
              
        ArrayList<CTPhieuDatHang> listCTPhieuDatHang = new ArrayList<>();
        Connect.getInstance();
        Connection con = Connect.getConnection();
        String url ="select * from CTPhieuDatHang where maPhieuDatHang = ?";
        try {
            PreparedStatement prestmt = con.prepareStatement(url);
            prestmt.setString(1, maPhieuDatHang);
            ResultSet rs = prestmt.executeQuery();
            while(rs.next()){
                String maSP = rs.getString(2);
                SanPham sanPham = dao_SanPham.getSanPhamTheoMa(maSP);
                
                PhieuDatHang pdt = dao_PhieuDatHang.getPDTTheoMa(maPhieuDatHang);
                listCTPhieuDatHang.add(new CTPhieuDatHang(sanPham, pdt, rs.getInt(3)));
                        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listCTPhieuDatHang;
    }
    
    public void themCTPDT(CTPhieuDatHang ctpdt) {
        Connection con  = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "insert into CTPhieuDatHang values(?, ?, ?)";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, ctpdt.getPhieuDatHang().getMaPhieuDat());
            prestmt.setString(2, ctpdt.getSanPham().getMaSP());
            prestmt.setInt(3, ctpdt.getSoLuong());
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