/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import entity.KhachHang;
import connectDB.Connect;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.PreparedStatement;



/**
 *
 * @author ACER
 */
public class Dao_KhachHang {
    public ArrayList<KhachHang> getAllKhachHang(){
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        Connect.getInstance();
        Connection con=Connect.getConnection();
        try {
            String sql= "Select * from KhachHang";
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next()){
                String maKH=rs.getString(1);
                String hoTen=rs.getString(2);
                String gioiTinh=rs.getString(3);
                String email=rs.getString(4);
                String SDT=rs.getString(5);
               KhachHang kh=new KhachHang(maKH, hoTen, gioiTinh,email, SDT);
               listKhachHang.add(kh);
             }
        } catch (SQLException e) {
        }
        return listKhachHang;
    }
   public void themKhachHang(KhachHang kh){
       Connect.getInstance();
       Connection con=Connect.getConnection();
       String sql = "insert into KhachHang values (?, ?, ?, ?, ?)";
       PreparedStatement stm =null;
       try {
           
            stm = con.prepareCall(sql);
            stm.setString(1, kh.getMaKH());
            stm.setString(2, kh.getHoTen());
            stm.setString(3, kh.getSdt());
            stm.setString(4, kh.getEmail());
            stm.setString(5, kh.getGioiTinh());
            stm.executeUpdate();
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
            try {
                stm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
  
   }
   public int capNhatKhachHang(KhachHang kh){
       int kq=0;
       Connect.getInstance();
       Connection con=Connect.getConnection();
       String sql = "update KhachHang set hoTen = ?,"+" sdt = ?,"+" email = ?,"+" gioiTinh = ?"+" where maKH = ?";
       PreparedStatement stm =null;
       try {
            stm = con.prepareCall(sql);
            
            stm.setString(1, kh.getHoTen());
            stm.setString(2, kh.getSdt());
            stm.setString(3, kh.getEmail());
            stm.setString(4, kh.getGioiTinh());
            stm.setString(5, kh.getMaKH());
            kq=stm.executeUpdate();
       } catch (SQLException e) {
           e.printStackTrace();
       } finally {
            try {
                stm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       return kq;
              
   }
     public ArrayList<KhachHang> timKiemKhachHang(String maKhachHang,String tenKhachHang,String soDienThoai, String email){
       ArrayList<KhachHang> listKhachHang =new ArrayList<>(); 
       Connect.getInstance();
       Connection con=Connect.getConnection();
       String sql = "select * from KhachHang where maKH like ? and hoten like ? and sdt like ? and email like ?";
       PreparedStatement stm =null;
       try {
            stm=con.prepareStatement(sql);
            stm.setString(1, "%" + maKhachHang + "%");
            stm.setString(2, "%" + tenKhachHang + "%");
            stm.setString(3, "%" + soDienThoai + "%");
            stm.setString(4, "%" + email + "%");
            ResultSet rs=stm.executeQuery();
            while (rs.next()){
                KhachHang kh=new KhachHang();
                kh.setMaKH(rs.getString(1));
                kh.setHoTen(rs.getString(2));
                kh.setGioiTinh(rs.getString(3));
                kh.setEmail(rs.getString(4));
                kh.setSdt(rs.getString(5));
                listKhachHang.add(kh);
             }
        }catch (SQLException e) {
           e.printStackTrace();
       } finally {
            try {
                stm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listKhachHang;
   }
      
}
