/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlbhtt;

import connectDB.Connect;
import dao.Dao_NhaCungCap;
import entity.NhaCungCap;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DMX
 */
public class ManHinh_NCC_QuanLy extends javax.swing.JPanel {
    private DefaultTableModel modelNhaCungCap;    
    private Dao_NhaCungCap daoNhaCungCap;
    private Connect connect;
    private boolean kiemTraHoaDongThem = false;
    private boolean kiemTraHoaDongSua = false;
    /**
     * Creates new form quanly
     */
    public ManHinh_NCC_QuanLy() throws SQLException {
        daoNhaCungCap = new Dao_NhaCungCap();
        connect = new Connect();
        connect.connect();
        initComponents();
        tbl_NhaCungCap.setDefaultEditor(Object.class, null); //Không cho chỉnh sửa cột
        tbl_NhaCungCap.getTableHeader().setReorderingAllowed(false); //Không cho di chuyển cột
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
        pnl_NCC_QuanLy = new javax.swing.JPanel();
        lbl_TieuDe = new javax.swing.JLabel();
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
        btn_XoaTrang = new javax.swing.JButton();

        setBackground(new java.awt.Color(199, 210, 213));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        scr_DanhSachNCC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tbl_NhaCungCap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        tbl_NhaCungCap.setRowHeight(35);
        tbl_NhaCungCap.setShowGrid(true);
        tbl_NhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NhaCungCapMouseClicked(evt);
            }
        });
        scr_DanhSachNCC.setViewportView(tbl_NhaCungCap);

        lbl_TieuDe.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        lbl_TieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TieuDe.setText("QUẢN LÝ NHÀ CUNG CẤP");
        lbl_TieuDe.setMaximumSize(new java.awt.Dimension(32767, 32767));
        lbl_TieuDe.setPreferredSize(new java.awt.Dimension(181, 40));

        javax.swing.GroupLayout pnl_NCC_QuanLyLayout = new javax.swing.GroupLayout(pnl_NCC_QuanLy);
        pnl_NCC_QuanLy.setLayout(pnl_NCC_QuanLyLayout);
        pnl_NCC_QuanLyLayout.setHorizontalGroup(
            pnl_NCC_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NCC_QuanLyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_NCC_QuanLyLayout.setVerticalGroup(
            pnl_NCC_QuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_DanhSachNCCLayout = new javax.swing.GroupLayout(pnl_DanhSachNCC);
        pnl_DanhSachNCC.setLayout(pnl_DanhSachNCCLayout);
        pnl_DanhSachNCCLayout.setHorizontalGroup(
            pnl_DanhSachNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachNCC)
            .addComponent(pnl_NCC_QuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_DanhSachNCCLayout.setVerticalGroup(
            pnl_DanhSachNCCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DanhSachNCCLayout.createSequentialGroup()
                .addComponent(pnl_NCC_QuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scr_DanhSachNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
        );

        pnl_ThongTin.setBackground(new java.awt.Color(199, 210, 213));
        pnl_ThongTin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhà cung cấp", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txt_TenNCC.setEditable(false);
        txt_TenNCC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_TenNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenNCCActionPerformed(evt);
            }
        });

        txt_MaNCC.setEditable(false);
        txt_MaNCC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_MaNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaNCCActionPerformed(evt);
            }
        });

        lbl_MaNCC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_MaNCC.setText("Mã nhà cung cấp");

        lbl_TenNCC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TenNCC.setText("Tên nhà cung cấp");

        lbl_DiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_DiaChi.setText("Địa chỉ");

        lbl_SoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_SoDienThoai.setText("Số điện thoại");

        lbl_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Email.setText("Email");

        txt_SoDienThoai.setEditable(false);
        txt_SoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_SoDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoDienThoaiActionPerformed(evt);
            }
        });

        txt_Email.setEditable(false);
        txt_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });

        txt_DiaChi.setEditable(false);
        txt_DiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnl_ThongTinLayout = new javax.swing.GroupLayout(pnl_ThongTin);
        pnl_ThongTin.setLayout(pnl_ThongTinLayout);
        pnl_ThongTinLayout.setHorizontalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_MaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_MaNCC)
                    .addComponent(lbl_TenNCC))
                .addGap(50, 50, 50)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txt_MaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pnl_NutChucNang.setBackground(new java.awt.Color(199, 210, 213));
        pnl_NutChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btn_Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/icons8-add-30.png"))); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.setBorder(null);
        btn_Them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ThemMouseExited(evt);
            }
        });
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_CapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/icons8-update-30.png"))); // NOI18N
        btn_CapNhat.setText("Cập nhật");
        btn_CapNhat.setBorder(null);
        btn_CapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_CapNhatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_CapNhatMouseExited(evt);
            }
        });
        btn_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CapNhatActionPerformed(evt);
            }
        });

        btn_Luu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/icons8-save-30.png"))); // NOI18N
        btn_Luu.setText("Lưu");
        btn_Luu.setBorder(null);
        btn_Luu.setEnabled(false);
        btn_Luu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LuuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LuuMouseExited(evt);
            }
        });
        btn_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuActionPerformed(evt);
            }
        });

        btn_XoaTrang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/icons8-delete-document-30.png"))); // NOI18N
        btn_XoaTrang.setText("Xóa trắng");
        btn_XoaTrang.setBorder(null);
        btn_XoaTrang.setMinimumSize(new java.awt.Dimension(20, 30));
        btn_XoaTrang.setPreferredSize(new java.awt.Dimension(20, 30));
        btn_XoaTrang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_XoaTrangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_XoaTrangMouseExited(evt);
            }
        });
        btn_XoaTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaTrangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_NutChucNangLayout = new javax.swing.GroupLayout(pnl_NutChucNang);
        pnl_NutChucNang.setLayout(pnl_NutChucNangLayout);
        pnl_NutChucNangLayout.setHorizontalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Luu, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(btn_CapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_XoaTrang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
        );
        pnl_NutChucNangLayout.setVerticalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btn_XoaTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatActionPerformed
        if(btn_CapNhat.getText().equalsIgnoreCase("Cập nhật")) {
            btn_CapNhat.setText("Hủy");
            btn_Them.setEnabled(false);
            btn_XoaTrang.setEnabled(false);
            btn_Luu.setEnabled(true);
            kiemTraHoaDongSua= true;
            kiemTraHoatDongTextNhap(true);
            xoaTrangTxt();
        } else if(btn_CapNhat.getText().equalsIgnoreCase("Hủy")) {
            btn_CapNhat.setText("Cập nhật");
            huyThaoTac();
        }
    }//GEN-LAST:event_btn_CapNhatActionPerformed

    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        if(kiemTraHoaDongThem) {
            xuLyThemNhaCungCap();
        } else if(kiemTraHoaDongSua){
            xuLyCapNhatNhaCungCap();
        }
    }//GEN-LAST:event_btn_LuuActionPerformed

    private void txt_SoDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoDienThoaiActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailActionPerformed

    private void btn_XoaTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaTrangActionPerformed
        xoaTrangTxt();
    }//GEN-LAST:event_btn_XoaTrangActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        
        if(btn_Them.getText().equalsIgnoreCase("Thêm")) {
            btn_Them.setText("Hủy");
            btn_CapNhat.setEnabled(false);
            btn_XoaTrang.setEnabled(false);
            btn_Luu.setEnabled(true);
            kiemTraHoaDongThem = true;
            kiemTraHoatDongTextNhap(true);
            xoaTrangTxt();
        } else if(btn_Them.getText().equalsIgnoreCase("Hủy")) {
            btn_Them.setText("Thêm");
            huyThaoTac();
        }
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

    private void btn_ThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemMouseEntered
        if(btn_Them.isEnabled()){
            btn_Them.setBackground(new Color(0x9EDDFF));
            btn_Them.setForeground(new Color(0x141E46));
        }
    }//GEN-LAST:event_btn_ThemMouseEntered

    private void btn_ThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemMouseExited
        if(btn_Them.isEnabled()){
            btn_Them.setBackground(UIManager.getColor("Menu.background"));
            btn_Them.setForeground(UIManager.getColor("Menu.foreground"));
        }
    }//GEN-LAST:event_btn_ThemMouseExited

    private void btn_XoaTrangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XoaTrangMouseEntered
         if(btn_XoaTrang.isEnabled()) {
            btn_XoaTrang.setBackground(new Color(0x9EDDFF));
            btn_XoaTrang.setForeground(new Color(0x141E46));
        }
    }//GEN-LAST:event_btn_XoaTrangMouseEntered

    private void btn_XoaTrangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XoaTrangMouseExited
        if(btn_XoaTrang.isEnabled()) {
            btn_XoaTrang.setBackground(UIManager.getColor("Menu.background"));
            btn_XoaTrang.setForeground(UIManager.getColor("Menu.foreground"));
        }
    }//GEN-LAST:event_btn_XoaTrangMouseExited

    private void btn_CapNhatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CapNhatMouseEntered
        if(btn_CapNhat.isEnabled()) {
            btn_CapNhat.setBackground(new Color(0x9EDDFF));
            btn_CapNhat.setForeground(new Color(0x141E46));
        }
    }//GEN-LAST:event_btn_CapNhatMouseEntered

    private void btn_CapNhatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CapNhatMouseExited
        if(btn_CapNhat.isEnabled()) {
            btn_CapNhat.setBackground(UIManager.getColor("Menu.background"));
            btn_CapNhat.setForeground(UIManager.getColor("Menu.foreground"));
        }
    }//GEN-LAST:event_btn_CapNhatMouseExited

    private void btn_LuuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LuuMouseEntered
        if(btn_Luu.isEnabled()) {
            btn_Luu.setBackground(new Color(0x9EDDFF));
            btn_Luu.setForeground(new Color(0x141E46));
        }
    }//GEN-LAST:event_btn_LuuMouseEntered

    private void btn_LuuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LuuMouseExited
        if(btn_Luu.isEnabled()) {
            btn_Luu.setBackground(UIManager.getColor("Menu.background"));
            btn_Luu.setForeground(UIManager.getColor("Menu.foreground"));
        }
    }//GEN-LAST:event_btn_LuuMouseExited

    /**
     * Kiem tra hoat dong cua cac JtextField
     */
    public void kiemTraHoatDongTextNhap(boolean kiemTra) {
        txt_TenNCC.setEditable(kiemTra);
        txt_DiaChi.setEditable(kiemTra);
        txt_Email.setEditable(kiemTra);
        txt_SoDienThoai.setEditable(kiemTra);
    }
    
    
    /**
     * Huy thao tac hoat dong cua componet
     */
    public void huyThaoTac() {
        kiemTraHoaDongThem = false;
        kiemTraHoaDongSua = false;
        btn_Them.setEnabled(true);
        btn_CapNhat.setEnabled(true);
        btn_XoaTrang.setEnabled(true);
        btn_Luu.setEnabled(false);
        kiemTraHoatDongTextNhap(false);
        xoaTrangTxt();
    }
    
    /**
     * Xóa trắng các Jtext filed
     */
    public void xoaTrangTxt() {
        txt_TenNCC.setText("");
        txt_DiaChi.setText("");
        txt_SoDienThoai.setText("");
        txt_Email.setText("");
        txt_MaNCC.setText("");
        tbl_NhaCungCap.clearSelection();
    }
    
    /**
     * Regex đầu vào khi thêm hoặc sửa dữ liệu nhà cung cấp
     */
    public boolean rangBuocDuLieuNhap() {
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
            txt_SoDienThoai.requestFocus();
            return false;
        }
        
        if(!email.matches(regexEmail)){
            JOptionPane.showMessageDialog(null, "Email không hợp lệ!");            
            txt_Email.requestFocus();
            return false;
        }
                       
        if(tenNhaCungCap.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "Thông tin tên Nhà Cung Cấp không chứa số!");
            txt_TenNCC.requestFocus();
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
         if(!rangBuocDuLieuNhap()){
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
                 xoaTrangTxt();
             }
         } else {
             JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng cần xóa!");
         }
     }

     /**
      * Xử lý cập nhật Nhà Cung Cấp
      */
     public void xuLyCapNhatNhaCungCap() {
         if(!rangBuocDuLieuNhap()){
             return;
         }
         
         String maNhaCungCap = txt_MaNCC.getText();
         String tenNhaCungCap = txt_TenNCC.getText();
         String soDienThoai = txt_SoDienThoai.getText();
         String diaChi = txt_DiaChi.getText();
         String email = txt_Email.getText();
         
         NhaCungCap ncc = new NhaCungCap(maNhaCungCap,tenNhaCungCap, diaChi,soDienThoai , email);
         int row = tbl_NhaCungCap.getSelectedRow();
         if(row!=-1) {
            daoNhaCungCap.capNhatNhaCungCap(ncc);
             for (int i = 0; i < tbl_NhaCungCap.getRowCount(); i++) {
                 String maNCC_Update = tbl_NhaCungCap.getValueAt(row, 0).toString();
                 if(maNCC_Update.equalsIgnoreCase(maNhaCungCap)) {
                     tbl_NhaCungCap.setValueAt(tenNhaCungCap, row, 1);
                     tbl_NhaCungCap.setValueAt(soDienThoai, row, 2);
                     tbl_NhaCungCap.setValueAt(email, row, 3);
                     tbl_NhaCungCap.setValueAt(diaChi, row, 4);
                 }
                 
            }
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            xoaTrangTxt();
         } else {
             JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng cần cập nhật!");
         }            
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_Luu;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_XoaTrang;
    private javax.swing.JLabel lbl_DiaChi;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_MaNCC;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_TenNCC;
    private javax.swing.JLabel lbl_TieuDe;
    private javax.swing.JPanel pnl_DanhSachNCC;
    private javax.swing.JPanel pnl_NCC_QuanLy;
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
