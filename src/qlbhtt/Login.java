/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlbhtt;

import connectDB.Connect;
import dao.Dao_NhanVien;
import dao.Dao_TaiKhoan;
import entity.NhanVien;
import entity.TaiKhoan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DMX
 */
public class Login extends javax.swing.JFrame {
    private Dao_TaiKhoan daoTaiKhoan;
    private Dao_NhanVien daoNhanVien;
    private Connect connect;
    private Boolean hoatDongIconShow = true;
    private Boolean hoatDongIconClose = true;
    public static NhanVien nhanVien = null;
    
    /**
     * Creates new form Login
     */
    public Login() throws SQLException {
        daoNhanVien = new Dao_NhanVien();
        daoTaiKhoan = new Dao_TaiKhoan();
        connect = new Connect();
        connect.connect();
        
        setTitle("Quản Lý Bán Quần Áo Thời Trang");
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnl_ManHinhDangNhap = new javax.swing.JPanel();
        pnl_FormDangNhap = new javax.swing.JPanel();
        txt_Username = new javax.swing.JTextField();
        btn_Login = new javax.swing.JButton();
        lbl_Password = new javax.swing.JLabel();
        lbl_Title = new javax.swing.JLabel();
        lbl_TaiKhoan = new javax.swing.JLabel();
        pwd_MatKhau = new javax.swing.JPasswordField();
        lbl_IconPWClose = new javax.swing.JLabel();
        lbl_IconUser = new javax.swing.JLabel();
        lbl_ImageLogin = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(970, 521));

        pnl_ManHinhDangNhap.setMaximumSize(new java.awt.Dimension(870, 521));
        pnl_ManHinhDangNhap.setMinimumSize(new java.awt.Dimension(870, 521));

        pnl_FormDangNhap.setBackground(new java.awt.Color(208, 212, 202));

        txt_Username.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        txt_Username.setText("Admin");
        txt_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsernameActionPerformed(evt);
            }
        });

        btn_Login.setBackground(new java.awt.Color(97, 103, 122));
        btn_Login.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btn_Login.setForeground(new java.awt.Color(242, 242, 242));
        btn_Login.setText("Đăng nhập");
        btn_Login.setBorder(null);
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        lbl_Password.setBackground(new java.awt.Color(216, 217, 218));
        lbl_Password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Password.setForeground(new java.awt.Color(97, 103, 122));
        lbl_Password.setText("Mật khẩu");

        lbl_Title.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(97, 103, 122));
        lbl_Title.setText("Đăng nhập");

        lbl_TaiKhoan.setBackground(new java.awt.Color(216, 217, 218));
        lbl_TaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_TaiKhoan.setForeground(new java.awt.Color(97, 103, 122));
        lbl_TaiKhoan.setText("Tài khoản");

        pwd_MatKhau.setText("admin");
        pwd_MatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwd_MatKhauActionPerformed(evt);
            }
        });

        lbl_IconPWClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/icons8-password-30-1.png"))); // NOI18N
        lbl_IconPWClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_IconPWCloseMouseClicked(evt);
            }
        });

        lbl_IconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/icons8-user-30.png"))); // NOI18N
        lbl_IconUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_IconUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_FormDangNhapLayout = new javax.swing.GroupLayout(pnl_FormDangNhap);
        pnl_FormDangNhap.setLayout(pnl_FormDangNhapLayout);
        pnl_FormDangNhapLayout.setHorizontalGroup(
            pnl_FormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_FormDangNhapLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl_FormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_FormDangNhapLayout.createSequentialGroup()
                        .addComponent(pwd_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_IconPWClose))
                    .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_FormDangNhapLayout.createSequentialGroup()
                        .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_IconUser))
                    .addComponent(lbl_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_FormDangNhapLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_FormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_FormDangNhapLayout.createSequentialGroup()
                        .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_FormDangNhapLayout.createSequentialGroup()
                        .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
        );
        pnl_FormDangNhapLayout.setVerticalGroup(
            pnl_FormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_FormDangNhapLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lbl_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_FormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_IconUser))
                .addGap(18, 18, 18)
                .addComponent(lbl_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_FormDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwd_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_IconPWClose))
                .addGap(39, 39, 39)
                .addComponent(btn_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        lbl_ImageLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/Login1.jpg"))); // NOI18N

        javax.swing.GroupLayout pnl_ManHinhDangNhapLayout = new javax.swing.GroupLayout(pnl_ManHinhDangNhap);
        pnl_ManHinhDangNhap.setLayout(pnl_ManHinhDangNhapLayout);
        pnl_ManHinhDangNhapLayout.setHorizontalGroup(
            pnl_ManHinhDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ManHinhDangNhapLayout.createSequentialGroup()
                .addComponent(lbl_ImageLogin)
                .addGap(0, 0, 0)
                .addComponent(pnl_FormDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        pnl_ManHinhDangNhapLayout.setVerticalGroup(
            pnl_ManHinhDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_FormDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_ImageLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_ManHinhDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_ManHinhDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsernameActionPerformed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        String user = txt_Username.getText();
        String pass = String.valueOf(pwd_MatKhau.getText());        
        TaiKhoan taiKhoan = daoTaiKhoan.dangNhapTaiKhoan(user, pass);
        
        if(taiKhoan!=null) {
            nhanVien = daoNhanVien.getNhanVienTheoMa(taiKhoan.getNhanVien().getMaNV());
            HomePage home =null;            
            try {
                home = new HomePage();
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            home.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Tài khoản hoặc mật khẩu sai!");
        }

    }//GEN-LAST:event_btn_LoginActionPerformed

    private void pwd_MatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwd_MatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwd_MatKhauActionPerformed

    private void lbl_IconPWCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_IconPWCloseMouseClicked

        if (hoatDongIconShow) {
            lbl_IconPWClose.setIcon(new ImageIcon(getClass().getResource("/imageGD/icons8-show-password-30.png")));
            pwd_MatKhau.setEchoChar((char) 0);
            hoatDongIconShow = false;
        } else if (hoatDongIconClose) {
            pwd_MatKhau.setEchoChar('*');
            lbl_IconPWClose.setIcon(new ImageIcon(getClass().getResource("/imageGD/icons8-password-30-1.png")));
            hoatDongIconShow = true;
        }
    }//GEN-LAST:event_lbl_IconPWCloseMouseClicked

    private void lbl_IconUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_IconUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_IconUserMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lbl_IconPWClose;
    private javax.swing.JLabel lbl_IconUser;
    private javax.swing.JLabel lbl_ImageLogin;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_TaiKhoan;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JPanel pnl_FormDangNhap;
    private javax.swing.JPanel pnl_ManHinhDangNhap;
    private javax.swing.JPasswordField pwd_MatKhau;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}
