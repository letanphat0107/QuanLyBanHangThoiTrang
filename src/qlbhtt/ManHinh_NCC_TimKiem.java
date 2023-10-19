/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlbhtt;

import connectDB.Connect;
import dao.Dao_NhaCungCap;
import entity.NhaCungCap;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DMX
 */
public class ManHinh_NCC_TimKiem extends javax.swing.JPanel {
    private DefaultTableModel modelNhaCungCap;    
    private Dao_NhaCungCap daoNhaCungCap;
    private Connect connect;
    /**
     * Creates new form quanly
     */
    public ManHinh_NCC_TimKiem() throws SQLException {
        daoNhaCungCap = new Dao_NhaCungCap();
        connect = new Connect();
        connect.connect();
        initComponents();
        
//      Lần đầu chạy chương trình, load dữ liệu vào bảng
        docDuLieuNhaCungCap();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_DanhSachNCC = new javax.swing.JPanel();
        scr_DanhSachNCC = new javax.swing.JScrollPane();
        tbl_NhaCungCap = new javax.swing.JTable();
        pnl_ThongTin = new javax.swing.JPanel();
        txt_TenNCC = new javax.swing.JTextField();
        txt_MaNCC = new javax.swing.JTextField();
        lbl_MaNCC = new javax.swing.JLabel();
        lbl_TenNCC = new javax.swing.JLabel();
        lbl_DiaChi = new javax.swing.JLabel();
        lbl_SoDienThoai = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        txt_SoDienThoai = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_DiaChi = new javax.swing.JTextField();
        pnl_NutChucNang = new javax.swing.JPanel();
        btn_TimKiem = new javax.swing.JButton();

        setBackground(new java.awt.Color(199, 210, 213));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        tbl_NhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà cung cấp", "Tên nhà cung cấp", "SDT", "Email", "Địa chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_NhaCungCap.setRowHeight(28);
        tbl_NhaCungCap.setShowGrid(true);
        scr_DanhSachNCC.setViewportView(tbl_NhaCungCap);

        javax.swing.GroupLayout pnl_DanhSachNCCLayout = new javax.swing.GroupLayout(pnl_DanhSachNCC);
        pnl_DanhSachNCC.setLayout(pnl_DanhSachNCCLayout);
        pnl_DanhSachNCCLayout.setHorizontalGroup(
            pnl_DanhSachNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        pnl_DanhSachNCCLayout.setVerticalGroup(
            pnl_DanhSachNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        pnl_ThongTin.setBackground(new java.awt.Color(199, 210, 213));
        pnl_ThongTin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txt_TenNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenNCCActionPerformed(evt);
            }
        });

        txt_MaNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaNCCActionPerformed(evt);
            }
        });

        lbl_MaNCC.setText("Mã nhà cung cấp");

        lbl_TenNCC.setText("Tên nhà cung cấp");

        lbl_DiaChi.setText("Địa chỉ");

        lbl_SoDienThoai.setText("Số điện thoại");

        lbl_Email.setText("Email");

        txt_SoDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoDienThoaiActionPerformed(evt);
            }
        });

        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });

        txt_DiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DiaChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ThongTinLayout = new javax.swing.GroupLayout(pnl_ThongTin);
        pnl_ThongTin.setLayout(pnl_ThongTinLayout);
        pnl_ThongTinLayout.setHorizontalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_MaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        pnl_ThongTinLayout.setVerticalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_MaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pnl_NutChucNang.setBackground(new java.awt.Color(199, 210, 213));

        btn_TimKiem.setText("Tìm kiếm");
        btn_TimKiem.setBorder(null);
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_NutChucNangLayout = new javax.swing.GroupLayout(pnl_NutChucNang);
        pnl_NutChucNang.setLayout(pnl_NutChucNangLayout);
        pnl_NutChucNangLayout.setHorizontalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnl_NutChucNangLayout.setVerticalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnl_DanhSachNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_NutChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_DanhSachNCC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pnl_NutChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TenNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenNCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenNCCActionPerformed

    private void txt_MaNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaNCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaNCCActionPerformed

    private void txt_SoDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoDienThoaiActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailActionPerformed

    private void txt_DiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DiaChiActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        xuLyTimKiemNhaCungCap();
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    /**
     * Xóa trắng các Jtext filed
     */
    public void xoaTrangTxt() {
        txt_TenNCC.setText("");
        txt_DiaChi.setText("");
        txt_SoDienThoai.setText("");
        txt_Email.setText("");
        txt_MaNCC.setText("");
    }
    
    /**
     * Xóa các dòng trong table 
     */    
    public void xoaDongBang() {
        modelNhaCungCap = (DefaultTableModel) tbl_NhaCungCap.getModel();
        modelNhaCungCap.setRowCount(0);                
    }
    
    /**
     * Load dữ liệu vào bảng
     */
    public void docDuLieuNhaCungCap() {
        modelNhaCungCap = (DefaultTableModel) tbl_NhaCungCap.getModel();
        for(NhaCungCap ncc: daoNhaCungCap.getAllNhaCungCap()) {
            Object[] object = new Object[5];
            object[0] = ncc.getMaNCC();
            object[1] = ncc.getTenNCC();
            object[2] = ncc.getSdt();
            object[3] = ncc.getEmail();
            object[4] = ncc.getDiaChi();
            modelNhaCungCap.addRow(object);
        }
    }

    /**
     * Xử lý tìm kiếm nhà cung cấp theo các tiêu chí
     */
    public void xuLyTimKiemNhaCungCap() {
        String tuKhoaMaNCC = txt_MaNCC.getText();
        String tuKhoaTenNCC = txt_TenNCC.getText();
        String tuKhoaSdt = txt_SoDienThoai.getText();
        String tuKhoaEmail = txt_Email.getText();
        
        NhaCungCap ncc = daoNhaCungCap.timKiemNhaCungCap(tuKhoaMaNCC, tuKhoaTenNCC, tuKhoaSdt, tuKhoaEmail);
        modelNhaCungCap = (DefaultTableModel) tbl_NhaCungCap.getModel();
         if(ncc!=null) {
            xoaDongBang();
            Object[] object = new Object[5];
            object[0] = ncc.getMaNCC();
            object[1] = ncc.getTenNCC();
            object[2] = ncc.getSdt();
            object[3] = ncc.getEmail();
            object[4] = ncc.getDiaChi();
            modelNhaCungCap.addRow(object);
            JOptionPane.showMessageDialog(this, "Tìm thấy");
            
         } else {
            JOptionPane.showMessageDialog(this, "Không tìm thấy");            
         }
         xoaTrangTxt();
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JLabel lbl_DiaChi;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_MaNCC;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_TenNCC;
    private javax.swing.JPanel pnl_DanhSachNCC;
    private javax.swing.JPanel pnl_NutChucNang;
    private javax.swing.JPanel pnl_ThongTin;
    private javax.swing.JScrollPane scr_DanhSachNCC;
    private javax.swing.JTable tbl_NhaCungCap;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_MaNCC;
    private javax.swing.JTextField txt_SoDienThoai;
    private javax.swing.JTextField txt_TenNCC;
    // End of variables declaration//GEN-END:variables
}
