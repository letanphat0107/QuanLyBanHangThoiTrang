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
public class ManHinh_NCC_QuanLy extends javax.swing.JPanel {
    private DefaultTableModel modelNhaCungCap;    
    private Dao_NhaCungCap daoNhaCungCap;
    private Connect connect;
    /**
     * Creates new form quanly
     */
    public ManHinh_NCC_QuanLy() throws SQLException {
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
        btn_Them = new javax.swing.JButton();
        btn_CapNhat = new javax.swing.JButton();
        btn_Luu = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();

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
        tbl_NhaCungCap.setShowGrid(true);
        tbl_NhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NhaCungCapMouseClicked(evt);
            }
        });
        scr_DanhSachNCC.setViewportView(tbl_NhaCungCap);

        javax.swing.GroupLayout pnl_DanhSachNCCLayout = new javax.swing.GroupLayout(pnl_DanhSachNCC);
        pnl_DanhSachNCC.setLayout(pnl_DanhSachNCCLayout);
        pnl_DanhSachNCCLayout.setHorizontalGroup(
            pnl_DanhSachNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        pnl_DanhSachNCCLayout.setVerticalGroup(
            pnl_DanhSachNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );

        pnl_ThongTin.setBackground(new java.awt.Color(199, 210, 213));
        pnl_ThongTin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txt_TenNCC.setText("Nguyen Van A");
        txt_TenNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenNCCActionPerformed(evt);
            }
        });

        txt_MaNCC.setText("KH0001");
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

        txt_SoDienThoai.setText("0367494915");
        txt_SoDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoDienThoaiActionPerformed(evt);
            }
        });

        txt_Email.setText("vana@gmail.com");
        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
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
                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_ThongTinLayout.setVerticalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_MaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btn_Them.setBackground(new java.awt.Color(199, 210, 213));
        btn_Them.setText("Thêm");
        btn_Them.setBorder(null);
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_CapNhat.setBackground(new java.awt.Color(199, 210, 213));
        btn_CapNhat.setText("Cập nhật");
        btn_CapNhat.setBorder(null);
        btn_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CapNhatActionPerformed(evt);
            }
        });

        btn_Luu.setBackground(new java.awt.Color(199, 210, 213));
        btn_Luu.setText("Lưu");
        btn_Luu.setBorder(null);
        btn_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuActionPerformed(evt);
            }
        });

        btn_Xoa.setBackground(new java.awt.Color(199, 210, 213));
        btn_Xoa.setText("Xóa");
        btn_Xoa.setBorder(null);
        btn_Xoa.setMinimumSize(new java.awt.Dimension(20, 30));
        btn_Xoa.setPreferredSize(new java.awt.Dimension(20, 30));
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_NutChucNangLayout = new javax.swing.GroupLayout(pnl_NutChucNang);
        pnl_NutChucNang.setLayout(pnl_NutChucNangLayout);
        pnl_NutChucNangLayout.setHorizontalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_CapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Luu, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnl_NutChucNangLayout.setVerticalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Luu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CapNhatActionPerformed

    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LuuActionPerformed

    private void txt_SoDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoDienThoaiActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        xuLyXoaNhaCungCap();
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        
        xuLyThemNhaCungCap();
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void tbl_NhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NhaCungCapMouseClicked
        int row =  tbl_NhaCungCap.getSelectedRow();
       if(row!=-1) {
           txt_MaNCC.setText(tbl_NhaCungCap.getValueAt(row, 0).toString());
           txt_TenNCC.setText(tbl_NhaCungCap.getValueAt(row, 1).toString());
           txt_SoDienThoai.setText(tbl_NhaCungCap.getValueAt(row, 2).toString());
           txt_Email.setText(tbl_NhaCungCap.getValueAt(row, 3).toString());
           txt_DiaChi.setText(tbl_NhaCungCap.getValueAt(row, 4).toString());           
       }
    }//GEN-LAST:event_tbl_NhaCungCapMouseClicked

    /**
     * Xóa trắng các Jtext filed
     */
    public void xoaTrangTxt() {
        txt_TenNCC.setText("");
        txt_DiaChi.setText("");
        txt_SoDienThoai.setText("");
        txt_Email.setText("");
    }
    
    /**
     * Regex đầu vào khi thêm hoặc sửa dữ liệu nhà cung cấp
     */
    public boolean isValidInput() {
        //tạo regex cho các textfield
        String regexSoDienThoai = "^[0-9]{10}$"; //-> 0123456789
        String regexEmail = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$"; // -> abc@abc.abc

        //lấy giá trị từ các textfield
        String tenNhaCungCap = txt_TenNCC.getText();
        String sdt = txt_SoDienThoai.getText();
        String email = txt_Email.getText();
        String diaChi = txt_DiaChi.getText();

        //kiểm tra các giá trị với regex
        if(txt_TenNCC.getText().equals("") || txt_DiaChi.getText().equals("") || txt_SoDienThoai.getText().equals("") || txt_Email.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin!");
            return false;
        }
        
        if(!sdt.matches(regexSoDienThoai)){
            JOptionPane.showMessageDialog(null, "Số điện thoại đủ 10 số!");
            return false;
        }
        
        if(!email.matches(regexEmail)){
            JOptionPane.showMessageDialog(null, "Email không hợp lệ!");
            return false;
        }
        return true;
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
      * Xử lý thêm Nhà Cung Cấp
      */
     public void xuLyThemNhaCungCap() {
         if(!isValidInput()){
             return;
         }
         
         String maNhaCungCap = txt_MaNCC.getText();
         String tenNhaCungCap = txt_TenNCC.getText();
         String soDienThoai = txt_SoDienThoai.getText();
         String diaChi = txt_DiaChi.getText();
         String email = txt_Email.getText();
         
         NhaCungCap ncc = new NhaCungCap(tenNhaCungCap, diaChi,soDienThoai , email);
         daoNhaCungCap.themNhaCungCap(ncc);
         
         modelNhaCungCap = (DefaultTableModel) tbl_NhaCungCap.getModel();
         Object[] object = new Object[5];
            object[0] = ncc.getMaNCC();
            object[1] = ncc.getTenNCC();
            object[2] = ncc.getSdt();
            object[3] = ncc.getEmail();
            object[4] = ncc.getDiaChi();
        modelNhaCungCap.addRow(object);
        xoaTrangTxt();
         JOptionPane.showMessageDialog(this, "Thêm thành công");
     }

     /**
      * Xử lý xóa Nhà Cung Cấp
      */
     public void xuLyXoaNhaCungCap() {
         int row = tbl_NhaCungCap.getSelectedRow();
         if(row!=-1) {
             if(JOptionPane.showConfirmDialog(this, "Bạn có chắc là xóa dòng này không?", "Cảnh Báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                 String maNhaCungCap = txt_MaNCC.getText();
                 daoNhaCungCap.xoaNhaCungCap(maNhaCungCap);
                 modelNhaCungCap.removeRow(row);
                 JOptionPane.showMessageDialog(this, "Xóa thành công");
             }
         }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_Luu;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Xoa;
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
