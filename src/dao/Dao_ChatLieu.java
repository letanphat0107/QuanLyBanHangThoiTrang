/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Connect;
import entity.ChatLieu;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author phant
 */
public class Dao_ChatLieu {
    
    public ArrayList<ChatLieu> getAllChatLieu() {
        ArrayList<ChatLieu> listChatLieu = new ArrayList<>();
        Connect.getInstance();
        Connection con = Connect.getConnection();
        String url = "select * from ChatLieu";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(url);
            while (rs.next()) {                
                listChatLieu.add(new ChatLieu(rs.getString(1), rs.getString(2)));                        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listChatLieu;
    }
    
    public void themDLChatLieu(ChatLieu chatLieu) {
        Connection con = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "insert into ChatLieu values (?, ?)";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, chatLieu.getMaChatLieu());
            prestmt.setString(2, chatLieu.getChatLieu());
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
     * Xóa dữ liệu Chất Liệu trên database
     * @param chatLieu 
     */
    public void xoaDLChatLieu(String maChatLieu) {
        Connection con  = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "delete from ChatLieu where maChatLieu = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, maChatLieu);
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
     * Cập nhật dữ liệu Chất Liệu trên database
     * @param chatLieu 
     */
    public void catNhatDLChatLieu(ChatLieu chatLieu) {
        Connection con  = Connect.getInstance().getConnection();
        PreparedStatement prestmt = null;
        String url = "Update ChatLieu set tenChatLieu = ? where maChatLieu = ?";
        try {
            prestmt = con.prepareStatement(url);
            prestmt.setString(1, chatLieu.getChatLieu());
            prestmt.setString(2, chatLieu.getMaChatLieu());
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
     * Tìm dữ liệu Chất Liệu theo mã trên database
     * @param chatLieu 
     */
    public ChatLieu getDLChatLieuTheoMa(String id){
        Connect.getInstance();
        Connection con = Connect.getConnection();
        
        try {
            String sql = "select * from ChatLieu where maChatLieu = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                ChatLieu chatLieu = new ChatLieu();
                chatLieu.setMaChatLieu(rs.getString(1));
                chatLieu.setChatLieu(rs.getString(2));
                return chatLieu;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public ChatLieu getChatLieuTheoTen(String tenChatLieu){
        Connect.getInstance();
        Connection con = Connect.getConnection();
        
        try {
            String sql = "select * from ChatLieu where tenChatLieu = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, tenChatLieu);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                ChatLieu chatLieu = new ChatLieu();
                chatLieu.setMaChatLieu(rs.getString(1));
                chatLieu.setChatLieu(rs.getString(2));
                return chatLieu;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
