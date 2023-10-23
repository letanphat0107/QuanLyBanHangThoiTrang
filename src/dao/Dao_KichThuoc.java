/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.Connect;
import entity.KichThuoc;
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
public class Dao_KichThuoc {
    public ArrayList<KichThuoc> getAllKichThuoc() {
        ArrayList<KichThuoc> listKichThuoc = new ArrayList<>();
        Connect.getInstance();
        Connection con = Connect.getConnection();
        String url = "Select * from KichThuoc";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(url);
            while (rs.next()) {                
                listKichThuoc.add(new KichThuoc(rs.getString(1), rs.getString(2)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listKichThuoc;
    }
}
