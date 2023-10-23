/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlbhtt;

import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author DMX
 */
public class ManHinh_NV_ThongKeDoanhThu extends javax.swing.JPanel {

    /**
     * Creates new form quanly
     */
    public ManHinh_NV_ThongKeDoanhThu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_DanhSachSanPham = new javax.swing.JPanel();
        scr_DanhSachSanPham = new javax.swing.JScrollPane();
        tbl_SanPham = new javax.swing.JTable();
        pnl_ThongTin = new javax.swing.JPanel();
        lbl_PhanLoai = new javax.swing.JLabel();
        lbl_KichThuoc = new javax.swing.JLabel();
        lbl_MauSac = new javax.swing.JLabel();
        lbl_TuNgay = new javax.swing.JLabel();
        dch_TuNgay = new com.toedter.calendar.JDateChooser();
        pnl_TongSanPham = new javax.swing.JPanel();
        lbl_TongSanPhamBan = new javax.swing.JLabel();
        txt_TongSanPhamBan = new javax.swing.JTextField();
        cmb_PhanLoai = new javax.swing.JComboBox<>();
        cmb_MauSac = new javax.swing.JComboBox<>();
        cmb_KichThuoc = new javax.swing.JComboBox<>();
        pnl_TongDoanhThu = new javax.swing.JPanel();
        lbl_TongDoanhThu = new javax.swing.JLabel();
        txt_TongDoanhThu = new javax.swing.JTextField();
        lbl_DenNgay = new javax.swing.JLabel();
        dch_DenNgay = new com.toedter.calendar.JDateChooser();
        chk_TatCa = new javax.swing.JCheckBox();
        pnl_NutChucNang = new javax.swing.JPanel();
        btn_XuatThongKe = new javax.swing.JButton();

        setBackground(new java.awt.Color(199, 210, 213));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        scr_DanhSachSanPham.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tbl_SanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_SanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SP0001", "Áo thun", "Áo", "250000", "275000", "L", "Trắng", "Cotton", "CT TNHH Hades", "10", "500000", "12"},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Phân loại", "Giá bán ", "Giá nhập", "Kích cỡ", "Màu sắc", "Chất liệu", "Nhà cung cấp", "Số lượng tồn", "Số lượng đã bán", "Tỷ lệ doanh thu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_SanPham.setRowHeight(35);
        tbl_SanPham.setShowGrid(true);
        scr_DanhSachSanPham.setViewportView(tbl_SanPham);
        if (tbl_SanPham.getColumnModel().getColumnCount() > 0) {
            tbl_SanPham.getColumnModel().getColumn(11).setMinWidth(100);
        }

        javax.swing.GroupLayout pnl_DanhSachSanPhamLayout = new javax.swing.GroupLayout(pnl_DanhSachSanPham);
        pnl_DanhSachSanPham.setLayout(pnl_DanhSachSanPhamLayout);
        pnl_DanhSachSanPhamLayout.setHorizontalGroup(
            pnl_DanhSachSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachSanPham)
        );
        pnl_DanhSachSanPhamLayout.setVerticalGroup(
            pnl_DanhSachSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        pnl_ThongTin.setBackground(new java.awt.Color(199, 210, 213));
        pnl_ThongTin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lbl_PhanLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_PhanLoai.setText("Phân loại");

        lbl_KichThuoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_KichThuoc.setText("Kích thước");

        lbl_MauSac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_MauSac.setText("Màu sắc");

        lbl_TuNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TuNgay.setText("Từ ngày:");

        dch_TuNgay.setMinimumSize(new java.awt.Dimension(64, 22));
        dch_TuNgay.setPreferredSize(new java.awt.Dimension(64, 22));

        pnl_TongSanPham.setBackground(new java.awt.Color(255, 255, 255));
        pnl_TongSanPham.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lbl_TongSanPhamBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TongSanPhamBan.setText("Tổng sản phẩm bán được");

        txt_TongSanPhamBan.setEditable(false);
        txt_TongSanPhamBan.setBackground(new java.awt.Color(255, 255, 255));
        txt_TongSanPhamBan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_TongSanPhamBan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_TongSanPhamBan.setText("0");
        txt_TongSanPhamBan.setBorder(null);

        javax.swing.GroupLayout pnl_TongSanPhamLayout = new javax.swing.GroupLayout(pnl_TongSanPham);
        pnl_TongSanPham.setLayout(pnl_TongSanPhamLayout);
        pnl_TongSanPhamLayout.setHorizontalGroup(
            pnl_TongSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TongSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_TongSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_TongSanPhamLayout.createSequentialGroup()
                        .addComponent(lbl_TongSanPhamBan)
                        .addGap(0, 17, Short.MAX_VALUE))
                    .addComponent(txt_TongSanPhamBan, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnl_TongSanPhamLayout.setVerticalGroup(
            pnl_TongSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TongSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TongSanPhamBan)
                .addGap(43, 43, 43)
                .addComponent(txt_TongSanPhamBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        cmb_PhanLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_PhanLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));

        cmb_MauSac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_MauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));

        cmb_KichThuoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_KichThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));

        pnl_TongDoanhThu.setBackground(new java.awt.Color(255, 255, 255));
        pnl_TongDoanhThu.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lbl_TongDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TongDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TongDoanhThu.setText("Tổng doanh thu");

        txt_TongDoanhThu.setEditable(false);
        txt_TongDoanhThu.setBackground(new java.awt.Color(255, 255, 255));
        txt_TongDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_TongDoanhThu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_TongDoanhThu.setText("0");
        txt_TongDoanhThu.setBorder(null);
        txt_TongDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TongDoanhThuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_TongDoanhThuLayout = new javax.swing.GroupLayout(pnl_TongDoanhThu);
        pnl_TongDoanhThu.setLayout(pnl_TongDoanhThuLayout);
        pnl_TongDoanhThuLayout.setHorizontalGroup(
            pnl_TongDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TongDoanhThuLayout.createSequentialGroup()
                .addGroup(pnl_TongDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_TongDoanhThuLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(txt_TongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_TongDoanhThuLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbl_TongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnl_TongDoanhThuLayout.setVerticalGroup(
            pnl_TongDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TongDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TongDoanhThu)
                .addGap(41, 41, 41)
                .addComponent(txt_TongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        lbl_DenNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_DenNgay.setText("Đến ngày:");

        dch_DenNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dch_DenNgay.setMinimumSize(new java.awt.Dimension(64, 22));
        dch_DenNgay.setPreferredSize(new java.awt.Dimension(64, 22));

        chk_TatCa.setBackground(new java.awt.Color(199, 210, 213));
        chk_TatCa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chk_TatCa.setText("Tất cả");

        javax.swing.GroupLayout pnl_ThongTinLayout = new javax.swing.GroupLayout(pnl_ThongTin);
        pnl_ThongTin.setLayout(pnl_ThongTinLayout);
        pnl_ThongTinLayout.setHorizontalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(pnl_TongSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(pnl_TongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addComponent(lbl_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chk_TatCa))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ThongTinLayout.createSequentialGroup()
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmb_MauSac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_TuNgay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_DenNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)))
                            .addComponent(lbl_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dch_TuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dch_DenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        pnl_ThongTinLayout.setVerticalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cmb_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_TuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dch_TuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cmb_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_DenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(dch_DenNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chk_TatCa))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(pnl_TongSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(pnl_TongDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pnl_NutChucNang.setBackground(new java.awt.Color(199, 210, 213));

        btn_XuatThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/icons8-analytics-30.png"))); // NOI18N
        btn_XuatThongKe.setText("Xuất thống kê");
        btn_XuatThongKe.setBorder(null);
        btn_XuatThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_XuatThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_XuatThongKeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnl_NutChucNangLayout = new javax.swing.GroupLayout(pnl_NutChucNang);
        pnl_NutChucNang.setLayout(pnl_NutChucNangLayout);
        pnl_NutChucNangLayout.setHorizontalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_XuatThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );
        pnl_NutChucNangLayout.setVerticalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_XuatThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnl_DanhSachSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_NutChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_DanhSachSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pnl_NutChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TongDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TongDoanhThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TongDoanhThuActionPerformed

    private void btn_XuatThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XuatThongKeMouseEntered
        
        btn_XuatThongKe.setBackground(new Color(0x9EDDFF));
       btn_XuatThongKe.setForeground(new Color(0x141E46));
    }//GEN-LAST:event_btn_XuatThongKeMouseEntered

    private void btn_XuatThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XuatThongKeMouseExited
        
        btn_XuatThongKe.setBackground(UIManager.getColor("Menu.background"));
        btn_XuatThongKe.setForeground(UIManager.getColor("Menu.foreground"));
    }//GEN-LAST:event_btn_XuatThongKeMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_XuatThongKe;
    private javax.swing.JCheckBox chk_TatCa;
    private javax.swing.JComboBox<String> cmb_KichThuoc;
    private javax.swing.JComboBox<String> cmb_MauSac;
    private javax.swing.JComboBox<String> cmb_PhanLoai;
    private com.toedter.calendar.JDateChooser dch_DenNgay;
    private com.toedter.calendar.JDateChooser dch_TuNgay;
    private javax.swing.JLabel lbl_DenNgay;
    private javax.swing.JLabel lbl_KichThuoc;
    private javax.swing.JLabel lbl_MauSac;
    private javax.swing.JLabel lbl_PhanLoai;
    private javax.swing.JLabel lbl_TongDoanhThu;
    private javax.swing.JLabel lbl_TongSanPhamBan;
    private javax.swing.JLabel lbl_TuNgay;
    private javax.swing.JPanel pnl_DanhSachSanPham;
    private javax.swing.JPanel pnl_NutChucNang;
    private javax.swing.JPanel pnl_ThongTin;
    private javax.swing.JPanel pnl_TongDoanhThu;
    private javax.swing.JPanel pnl_TongSanPham;
    private javax.swing.JScrollPane scr_DanhSachSanPham;
    private javax.swing.JTable tbl_SanPham;
    private javax.swing.JTextField txt_TongDoanhThu;
    private javax.swing.JTextField txt_TongSanPhamBan;
    // End of variables declaration//GEN-END:variables
}
