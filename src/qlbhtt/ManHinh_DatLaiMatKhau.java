/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlbhtt;

import connectDB.Connect;
import dao.Dao_TaiKhoan;
import entity.NhanVien;
import entity.TaiKhoan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author phant
 */
public class ManHinh_DatLaiMatKhau extends javax.swing.JFrame {

    private Dao_TaiKhoan dao_TaiKhoan;
    private final TaiKhoan taiKhoan = ManHinh_TimTaiKhoan.taiKhoan;
    private Connect connect;
    private boolean ngonNgu = Login.ngonNgu;

    /**
     * Creates new form ManHinh_DatLaiMatKhau
     */
    public ManHinh_DatLaiMatKhau() throws SQLException {
        dao_TaiKhoan = new Dao_TaiKhoan();
        connect = new Connect();
        connect.connect();
        initComponents();
        setLocationRelativeTo(null);
        if (!ngonNgu) {
            chuyenDoiNN();
        }
    }

    public void chuyenDoiNN() {
        lbl_MatKhau.setText("New Password:");
        lbl_XacNhanMK.setText("Verify Password:");
        lbl_TieuDe.setText("RESET PASSWORD");
        btn_Huy.setText("Cancel");
        btn_XacNhan.setText("Verify");
    }

    /**
     * Xử lý đổi mật khẩu
     */
    public void xuLyDoiMatKhau() {
        String xacNhanMK = txt_XacNhanMK.getText();
        String matKhau = txt_MatKhau.getText();
        if (matKhau.equals(xacNhanMK)) {
            dao_TaiKhoan.datLaiMatKhau(taiKhoan, matKhau);
            JOptionPane.showMessageDialog(this, "Đăt lại mật khẩu thành công!");
            try {
                new Login().setVisible(true);
                this.setVisible(false);

            } catch (SQLException ex) {
                Logger.getLogger(ManHinh_DatLaiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Mật khẩu không trùng khớp!");
            txt_XacNhanMK.requestFocus();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_pnlChinh = new javax.swing.JPanel();
        lbl_XacNhanMK = new javax.swing.JLabel();
        lbl_MatKhau = new javax.swing.JLabel();
        txt_MatKhau = new javax.swing.JTextField();
        txt_XacNhanMK = new javax.swing.JTextField();
        lbl_TieuDe = new javax.swing.JLabel();
        btn_Huy = new javax.swing.JButton();
        btn_XacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_pnlChinh.setBackground(new java.awt.Color(208, 212, 202));

        lbl_XacNhanMK.setBackground(new java.awt.Color(208, 212, 202));
        lbl_XacNhanMK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_XacNhanMK.setText("Xác nhận lại:");

        lbl_MatKhau.setBackground(new java.awt.Color(208, 212, 202));
        lbl_MatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_MatKhau.setText("Mật khẩu:");

        txt_MatKhau.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        txt_XacNhanMK.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        lbl_TieuDe.setBackground(new java.awt.Color(208, 212, 202));
        lbl_TieuDe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_TieuDe.setText("ĐẶT LẠI MẬT KHẨU");

        btn_Huy.setBackground(new java.awt.Color(255, 153, 153));
        btn_Huy.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_Huy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/icons8-cancel-30.png"))); // NOI18N
        btn_Huy.setText("Hủy");
        btn_Huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HuyActionPerformed(evt);
            }
        });

        btn_XacNhan.setBackground(new java.awt.Color(58, 193, 80));
        btn_XacNhan.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_XacNhan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/icons8-verify-30.png"))); // NOI18N
        btn_XacNhan.setText("Xác nhận");
        btn_XacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_pnlChinhLayout = new javax.swing.GroupLayout(pnl_pnlChinh);
        pnl_pnlChinh.setLayout(pnl_pnlChinhLayout);
        pnl_pnlChinhLayout.setHorizontalGroup(
            pnl_pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_pnlChinhLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_TieuDe)
                .addGap(147, 147, 147))
            .addGroup(pnl_pnlChinhLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnl_pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_pnlChinhLayout.createSequentialGroup()
                        .addComponent(btn_Huy)
                        .addGap(26, 26, 26)
                        .addComponent(btn_XacNhan))
                    .addGroup(pnl_pnlChinhLayout.createSequentialGroup()
                        .addGroup(pnl_pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_XacNhanMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_MatKhau))
                        .addGap(20, 20, 20)
                        .addGroup(pnl_pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_XacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnl_pnlChinhLayout.setVerticalGroup(
            pnl_pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pnlChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TieuDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(pnl_pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnl_pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_XacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_XacNhanMK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_pnlChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_XacNhan)
                    .addComponent(btn_Huy))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_pnlChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_pnlChinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_HuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HuyActionPerformed

        try {
            new Login().setVisible(true);
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(ManHinh_DatLaiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btn_HuyActionPerformed

    private void btn_XacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XacNhanActionPerformed
        xuLyDoiMatKhau();

    }//GEN-LAST:event_btn_XacNhanActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ManHinh_DatLaiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ManHinh_DatLaiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ManHinh_DatLaiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ManHinh_DatLaiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManHinh_DatLaiMatKhau().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Huy;
    private javax.swing.JButton btn_XacNhan;
    private javax.swing.JLabel lbl_MatKhau;
    private javax.swing.JLabel lbl_TieuDe;
    private javax.swing.JLabel lbl_XacNhanMK;
    private javax.swing.JPanel pnl_pnlChinh;
    private javax.swing.JTextField txt_MatKhau;
    private javax.swing.JTextField txt_XacNhanMK;
    // End of variables declaration//GEN-END:variables
}
