/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Connect;
import entity.CTHD;
import entity.HoaDon;
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
public class Dao_CTHD {
    private Dao_SanPham dao_SanPham = new dao.Dao_SanPham();
    private Dao_KhachHang dao_KhachHang = new Dao_KhachHang();
    private Dao_HoaDon dao_HoaDon = new Dao_HoaDon();
    private Dao_PhanLoai dao_PhanLoai = new Dao_PhanLoai();
    private Dao_ChatLieu dao_ChatLieu = new Dao_ChatLieu();
    private Dao_KichThuoc dao_KichThuoc = new Dao_KichThuoc();
    private Dao_MauSac dao_MauSac = new Dao_MauSac();
    private Dao_NhaCungCap dao_NhaCungCap = new Dao_NhaCungCap();
    
    /**
     * Lấy Chi tiết hóa đơn theo mã hóa đơn
     * @param maHD
     * @return 
     */
    public ArrayList<CTHD> getAllCTHD(String maHD) {
              
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
                SanPham sanPham = dao_SanPham.getSanPhamTheoMa(maSP);
                
                HoaDon hoaDon = dao_HoaDon.getHoaDonTheoMa(maHD);
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
      
    
    /** 
     * Lấy tổng doanh thu
     * @return 
     */
    public double getTongDoanhThu() {
        Connect.getConnection();
        Connection conn = Connect.getConnection();
        String sql = "SELECT  SUM(cthd.soLuong*sp.giaBan) as DoanhThu\n"
                + "FROM            CTHD cthd join SanPham sp on sp.maSP=cthd.maSP";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                return rs.getDouble(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    
//   ====================THỐNG KÊ DOANH THU==================
    //so luong ban duoc cua tung san pham
    public int getSoLuongSanPhamBanDuoc(String maSP) {
        Connect.getConnection();
        Connection conn = Connect.getConnection();
        PreparedStatement pre=null;
        String sql = "select cthd.soLuong as soLuongBanDuoc from HoaDon hd join CTHD cthd on hd.maHD=cthd.maHD\n" +
"						join SanPham sp on cthd.maSP=sp.maSP\n" +
"						join PhanLoai pl on pl.maPhanLoai=sp.maPhanLoai \n" +
"						join KichThuoc kc on kc.maKichThuoc=sp.maKichThuoc\n" +
"						join MauSac ms on ms.maMauSac=sp.maMauSac\n" +
"						join ChatLieu cl on cl.maChatLieu=sp.maChatLieu\n" +
"						join NhaCungCap ncc on ncc.maNCC=sp.maNhaCungCap\n" +
"		where cthd.maSP=?\n" +
"			group by cthd.maSP,sp.tenSP,pl.tenPhanLoai,sp.giaBan,sp.giaNhap,kc.tenKichThuoc,ms.tenMauSac,cl.tenChatLieu,ncc.tenNCC,cthd.soLuong";
        try {
             pre = conn.prepareStatement(sql);
             pre.setString(1, maSP);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
//doanh thu theo tung san pham ban duoc
    public double getDoanhThuSanPhamBanDuoc(String maSP) {
        Connect.getConnection();
        Connection conn = Connect.getConnection();
        PreparedStatement pre=null;
        String sql = "select sum(cthd.soLuong*sp.giaBan) as doanhThu from HoaDon hd join CTHD cthd on hd.maHD=cthd.maHD\n" +
"						join SanPham sp on cthd.maSP=sp.maSP\n" +
"						join PhanLoai pl on pl.maPhanLoai=sp.maPhanLoai \n" +
"						join KichThuoc kc on kc.maKichThuoc=sp.maKichThuoc\n" +
"						join MauSac ms on ms.maMauSac=sp.maMauSac\n" +
"						join ChatLieu cl on cl.maChatLieu=sp.maChatLieu\n" +
"						join NhaCungCap ncc on ncc.maNCC=sp.maNhaCungCap\n" +
"		where cthd.maSP=?\n" +
"			group by cthd.maSP,sp.tenSP,pl.tenPhanLoai,sp.giaBan,sp.giaNhap,kc.tenKichThuoc,ms.tenMauSac,cl.tenChatLieu,ncc.tenNCC,cthd.soLuong";
        try {
             pre = conn.prepareStatement(sql);
             pre.setString(1, maSP);
            ResultSet rs = pre.executeQuery();
            while (rs.next()) {
                return rs.getDouble(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
