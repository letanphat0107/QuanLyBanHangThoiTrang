/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlbhtt;

/**
 *
 * @author DMX
 */
public class ManHinh_NV_ThongKeThongTinKhachHang extends javax.swing.JPanel {

    /**
     * Creates new form quanly
     */
    public ManHinh_NV_ThongKeThongTinKhachHang() {
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

        pnl_DanhSachThongKe = new javax.swing.JPanel();
        scr_DanhSachThongKe = new javax.swing.JScrollPane();
        tbl_ThongKe = new javax.swing.JTable();
        pnl_ThongTin = new javax.swing.JPanel();
        lbl_TenKH = new javax.swing.JLabel();
        txt_TenKH = new javax.swing.JTextField();
        pnl_TongKHDaMua = new javax.swing.JPanel();
        lbl_TongKHDaMua = new javax.swing.JLabel();
        txt_TongSanPhamBan = new javax.swing.JTextField();
        lbl_MaKH = new javax.swing.JLabel();
        txt_MaKH = new javax.swing.JTextField();
        lbl_SoDienThoai = new javax.swing.JLabel();
        txt_SoDienThoai = new javax.swing.JTextField();
        lbl_SoLuongSPMua = new javax.swing.JLabel();
        txt_SoLuongSPMua = new javax.swing.JTextField();
        txt_ThanhTien = new javax.swing.JTextField();
        lbl_ThanhTien = new javax.swing.JLabel();
        pnl_NutChucNang = new javax.swing.JPanel();
        btn_Top5KH = new javax.swing.JButton();
        btn_XuatThongKe = new javax.swing.JButton();
        btn_LamMoi = new javax.swing.JButton();

        setBackground(new java.awt.Color(199, 210, 213));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        tbl_ThongKe.setBackground(new java.awt.Color(255, 255, 255));
        tbl_ThongKe.setForeground(new java.awt.Color(0, 0, 0));
        tbl_ThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"KH0001", "Nguyễn Văn B", "0367494954", "9", "600000"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {"", null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Họ tên", "SDT", "Số lượng sản phẩm đã mua", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_ThongKe.setRowHeight(28);
        tbl_ThongKe.setShowGrid(true);
        scr_DanhSachThongKe.setViewportView(tbl_ThongKe);

        javax.swing.GroupLayout pnl_DanhSachThongKeLayout = new javax.swing.GroupLayout(pnl_DanhSachThongKe);
        pnl_DanhSachThongKe.setLayout(pnl_DanhSachThongKeLayout);
        pnl_DanhSachThongKeLayout.setHorizontalGroup(
            pnl_DanhSachThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        pnl_DanhSachThongKeLayout.setVerticalGroup(
            pnl_DanhSachThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        pnl_ThongTin.setBackground(new java.awt.Color(199, 210, 213));
        pnl_ThongTin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lbl_TenKH.setForeground(new java.awt.Color(0, 0, 0));
        lbl_TenKH.setText("Tên khách hàng");

        txt_TenKH.setBackground(new java.awt.Color(255, 255, 255));
        txt_TenKH.setForeground(new java.awt.Color(0, 0, 0));
        txt_TenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenKHActionPerformed(evt);
            }
        });

        pnl_TongKHDaMua.setBackground(new java.awt.Color(255, 255, 255));
        pnl_TongKHDaMua.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lbl_TongKHDaMua.setForeground(new java.awt.Color(0, 0, 0));
        lbl_TongKHDaMua.setText("Tổng khách hàng đã mua");

        txt_TongSanPhamBan.setBackground(new java.awt.Color(255, 255, 255));
        txt_TongSanPhamBan.setForeground(new java.awt.Color(0, 0, 0));
        txt_TongSanPhamBan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_TongSanPhamBan.setText("0");
        txt_TongSanPhamBan.setBorder(null);
        txt_TongSanPhamBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TongSanPhamBanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_TongKHDaMuaLayout = new javax.swing.GroupLayout(pnl_TongKHDaMua);
        pnl_TongKHDaMua.setLayout(pnl_TongKHDaMuaLayout);
        pnl_TongKHDaMuaLayout.setHorizontalGroup(
            pnl_TongKHDaMuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TongKHDaMuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TongKHDaMua)
                .addContainerGap(9, Short.MAX_VALUE))
            .addComponent(txt_TongSanPhamBan)
        );
        pnl_TongKHDaMuaLayout.setVerticalGroup(
            pnl_TongKHDaMuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TongKHDaMuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TongKHDaMua)
                .addGap(26, 26, 26)
                .addComponent(txt_TongSanPhamBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        lbl_MaKH.setForeground(new java.awt.Color(0, 0, 0));
        lbl_MaKH.setText("Mã khách hàng");

        txt_MaKH.setBackground(new java.awt.Color(255, 255, 255));
        txt_MaKH.setForeground(new java.awt.Color(0, 0, 0));
        txt_MaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaKHActionPerformed(evt);
            }
        });

        lbl_SoDienThoai.setForeground(new java.awt.Color(0, 0, 0));
        lbl_SoDienThoai.setText("SDT");

        txt_SoDienThoai.setBackground(new java.awt.Color(255, 255, 255));
        txt_SoDienThoai.setForeground(new java.awt.Color(0, 0, 0));
        txt_SoDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoDienThoaiActionPerformed(evt);
            }
        });

        lbl_SoLuongSPMua.setForeground(new java.awt.Color(0, 0, 0));
        lbl_SoLuongSPMua.setText("Số lượng sản phẩm đã mua");

        txt_SoLuongSPMua.setBackground(new java.awt.Color(255, 255, 255));
        txt_SoLuongSPMua.setForeground(new java.awt.Color(0, 0, 0));
        txt_SoLuongSPMua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoLuongSPMuaActionPerformed(evt);
            }
        });

        txt_ThanhTien.setBackground(new java.awt.Color(255, 255, 255));
        txt_ThanhTien.setForeground(new java.awt.Color(0, 0, 0));
        txt_ThanhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ThanhTienActionPerformed(evt);
            }
        });

        lbl_ThanhTien.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ThanhTien.setText("Thành tiền");

        javax.swing.GroupLayout pnl_ThongTinLayout = new javax.swing.GroupLayout(pnl_ThongTin);
        pnl_ThongTin.setLayout(pnl_ThongTinLayout);
        pnl_ThongTinLayout.setHorizontalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pnl_TongKHDaMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_SoLuongSPMua, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SoLuongSPMua, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_ThongTinLayout.setVerticalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addComponent(pnl_TongKHDaMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                            .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                    .addComponent(lbl_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_SoLuongSPMua, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_SoLuongSPMua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                            .addComponent(lbl_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
        );

        pnl_NutChucNang.setBackground(new java.awt.Color(199, 210, 213));

        btn_Top5KH.setBackground(new java.awt.Color(255, 255, 255));
        btn_Top5KH.setForeground(new java.awt.Color(0, 0, 0));
        btn_Top5KH.setText("Top 5 KH");
        btn_Top5KH.setBorder(null);
        btn_Top5KH.setMinimumSize(new java.awt.Dimension(107, 18));
        btn_Top5KH.setPreferredSize(new java.awt.Dimension(107, 18));

        btn_XuatThongKe.setBackground(new java.awt.Color(255, 255, 255));
        btn_XuatThongKe.setForeground(new java.awt.Color(0, 0, 0));
        btn_XuatThongKe.setText("Xuất thống kê");
        btn_XuatThongKe.setBorder(null);
        btn_XuatThongKe.setMinimumSize(new java.awt.Dimension(107, 18));
        btn_XuatThongKe.setPreferredSize(new java.awt.Dimension(107, 18));

        btn_LamMoi.setBackground(new java.awt.Color(255, 255, 255));
        btn_LamMoi.setForeground(new java.awt.Color(0, 0, 0));
        btn_LamMoi.setText("Làm mới");
        btn_LamMoi.setBorder(null);
        btn_LamMoi.setMinimumSize(new java.awt.Dimension(107, 18));
        btn_LamMoi.setPreferredSize(new java.awt.Dimension(107, 18));

        javax.swing.GroupLayout pnl_NutChucNangLayout = new javax.swing.GroupLayout(pnl_NutChucNang);
        pnl_NutChucNang.setLayout(pnl_NutChucNangLayout);
        pnl_NutChucNangLayout.setHorizontalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_XuatThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Top5KH, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnl_NutChucNangLayout.setVerticalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_Top5KH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_XuatThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_LamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnl_DanhSachThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_NutChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_DanhSachThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pnl_NutChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenKHActionPerformed

    private void txt_TongSanPhamBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TongSanPhamBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TongSanPhamBanActionPerformed

    private void txt_MaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaKHActionPerformed

    private void txt_SoDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoDienThoaiActionPerformed

    private void txt_SoLuongSPMuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoLuongSPMuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoLuongSPMuaActionPerformed

    private void txt_ThanhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ThanhTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ThanhTienActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Top5KH;
    private javax.swing.JButton btn_XuatThongKe;
    private javax.swing.JLabel lbl_MaKH;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_SoLuongSPMua;
    private javax.swing.JLabel lbl_TenKH;
    private javax.swing.JLabel lbl_ThanhTien;
    private javax.swing.JLabel lbl_TongKHDaMua;
    private javax.swing.JPanel pnl_DanhSachThongKe;
    private javax.swing.JPanel pnl_NutChucNang;
    private javax.swing.JPanel pnl_ThongTin;
    private javax.swing.JPanel pnl_TongKHDaMua;
    private javax.swing.JScrollPane scr_DanhSachThongKe;
    private javax.swing.JTable tbl_ThongKe;
    private javax.swing.JTextField txt_MaKH;
    private javax.swing.JTextField txt_SoDienThoai;
    private javax.swing.JTextField txt_SoLuongSPMua;
    private javax.swing.JTextField txt_TenKH;
    private javax.swing.JTextField txt_ThanhTien;
    private javax.swing.JTextField txt_TongSanPhamBan;
    // End of variables declaration//GEN-END:variables
}
