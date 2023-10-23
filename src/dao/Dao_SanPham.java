/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import connectDB.Connect;
import entity.ChatLieu;
import entity.KichThuoc;
import entity.MauSac;
import entity.NhaCungCap;
import entity.PhanLoai;
import entity.SanPham;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author DMX
 */
public class Dao_SanPham {
    /**
     * 
     * @return listSanPham
     */    
    public ArrayList<SanPham> getAllSanPham() {
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        ChatLieu chatLieu;
        KichThuoc kichThuoc;
        MauSac mauSac;
        PhanLoai phanLoai;
        NhaCungCap nhaCungCap;
        Connect.getInstance();
        Connection con = Connect.getConnection();
        String url = "SELECT SanPham.maSP, SanPham.tenSP, SanPham.soLuong, SanPham.giaBan, SanPham.giaNhap, SanPham.hinhAnh,ChatLieu.maChatLieu, ChatLieu.tenChatLieu, KichThuoc.maKichThuoc, KichThuoc.tenKichThuoc, MauSac.maMauSac, MauSac.tenMauSac, PhanLoai.maPhanLoai, PhanLoai.tenPhanLoai, NhaCungCap.maNCC, NhaCungCap.tenNCC, NhaCungCap.diaChi, NhaCungCap.sdt, NhaCungCap.email FROM SanPham JOIN ChatLieu ON SanPham.maChatLieu = ChatLieu.maChatLieu JOIN KichThuoc ON SanPham.maKichThuoc = KichThuoc.maKichThuoc JOIN MauSac ON SanPham.maMauSac = MauSac.maMauSac JOIN PhanLoai ON SanPham.maPhanLoai = PhanLoai.maPhanLoai JOIN NhaCungCap ON SanPham.maNhaCungCap = NhaCungCap.maNCC;";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(url);
            while (rs.next()) {
                chatLieu = new ChatLieu(rs.getString(7), rs.getString(8));
                kichThuoc = new KichThuoc(rs.getString(9), rs.getString(10));
                mauSac = new MauSac(rs.getString(11), rs.getString(12));
                phanLoai = new PhanLoai(rs.getString(13), rs.getString(14));
                nhaCungCap = new NhaCungCap(rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19));
                listSanPham.add(new SanPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getString(6),
                chatLieu, kichThuoc, mauSac, phanLoai, nhaCungCap));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listSanPham;
    }
    
    public void themSanPham(SanPham sp) {
        Connection con  = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "insert into SanPham values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, sp.getMaSP());
            prestmt.setString(2, sp.getTenSP());
            prestmt.setInt(3, sp.getSoLuong());
            prestmt.setDouble(4, sp.getGiaBan());
            prestmt.setDouble(5, sp.getGiaNhap());
            prestmt.setString(6, sp.getHinhAnh());
            prestmt.setString(7, sp.getChatLieu().getMaChatLieu());
            prestmt.setString(8, sp.getKichThuoc().getMaKichThuoc());
            prestmt.setString(9, sp.getMauSac().getMaMauSac());
            prestmt.setString(10, sp.getPhanLoai().getMaPhanLoai());
            prestmt.setString(11, sp.getNhaCungCap().getMaNCC());
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
    
    public void xoaSanPham(String maSanPham) {
        Connection con  = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "delete from SanPham where maSP = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, maSanPham);
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
    
    public void capNhatSanPham(SanPham sp) {
        Connection con  = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "update SanPham set tenSP = ?, soLuong = ?, giaBan = ?, giaNhap = ?, hinhAnh = ?,"
                + " maChatLieu = ?, maKichThuoc = ?, maMauSac = ?, maPhanLoai = ? where maSP = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, sp.getTenSP());
            prestmt.setInt(2, sp.getSoLuong());
            prestmt.setDouble(3, sp.getGiaBan());
            prestmt.setDouble(4, sp.getGiaNhap());
            prestmt.setString(5, sp.getHinhAnh());
            prestmt.setString(6, sp.getChatLieu().getMaChatLieu());
            prestmt.setString(7, sp.getKichThuoc().getMaKichThuoc());
            prestmt.setString(8, sp.getMauSac().getMaMauSac());
            prestmt.setString(9, sp.getPhanLoai().getMaPhanLoai());
            prestmt.setString(10, sp.getNhaCungCap().getMaNCC());
            prestmt.setString(11, sp.getMaSP());
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
    
    public SanPham getSanPhamTheoMa(String maSP) {
        Connect.getInstance();
        Connection con = Connect.getConnection();
        PreparedStatement statement = null;
        SanPham sanPham;
        ChatLieu chatLieu;
        KichThuoc kichThuoc;
        MauSac mauSac;
        PhanLoai phanLoai;
        NhaCungCap nhaCungCap;
        try {
            String sql = "Select SanPham.maSP, SanPham.tenSP, SanPham.soLuong, SanPham.giaBan, SanPham.giaNhap, SanPham.hinhAnh,ChatLieu.maChatLieu,\n" +
"       ChatLieu.tenChatLieu, KichThuoc.maKichThuoc, KichThuoc.tenKichThuoc, MauSac.maMauSac, MauSac.tenMauSac, PhanLoai.maPhanLoai,\n" +
"	   PhanLoai.tenPhanLoai, NhaCungCap.maNCC, NhaCungCap.tenNCC, NhaCungCap.diaChi, NhaCungCap.sdt, NhaCungCap.email from SanPham JOIN ChatLieu ON SanPham.maChatLieu = ChatLieu.maChatLieu JOIN KichThuoc ON SanPham.maKichThuoc = KichThuoc.maKichThuoc JOIN MauSac ON SanPham.maMauSac = MauSac.maMauSac JOIN PhanLoai ON SanPham.maPhanLoai = PhanLoai.maPhanLoai JOIN NhaCungCap ON SanPham.maNhaCungCap = NhaCungCap.maNCC where SanPham.maSP = ? ";
            statement = con.prepareStatement(sql);
            statement.setString(1, maSP);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                chatLieu = new ChatLieu(rs.getString(7), rs.getString(8));
                kichThuoc = new KichThuoc(rs.getString(9), rs.getString(10));
                mauSac = new MauSac(rs.getString(11), rs.getString(12));
                phanLoai = new PhanLoai(rs.getString(13), rs.getString(14));
                nhaCungCap = new NhaCungCap(rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), rs.getString(19));
                sanPham = new SanPham(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5), rs.getString(6),
                chatLieu, kichThuoc, mauSac, phanLoai, nhaCungCap);
                return sanPham;
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        } finally {
            try {
                statement.close();
            } catch (Exception e2) {
                // TODO: handle exception
                e2.printStackTrace();
            }
        }
        return null;
    }
}
