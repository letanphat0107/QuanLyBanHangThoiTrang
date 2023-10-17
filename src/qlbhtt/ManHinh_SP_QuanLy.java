/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlbhtt;

/**
 *
 * @author DMX
 */
public class ManHinh_SP_QuanLy extends javax.swing.JPanel {

    /**
     * Creates new form quanly
     */
    public ManHinh_SP_QuanLy() {
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
        txt_TenSP = new javax.swing.JTextField();
        txt_MaSP = new javax.swing.JTextField();
        lbl_MaSP = new javax.swing.JLabel();
        lbl_PhanLoai = new javax.swing.JLabel();
        lbl_TenSP = new javax.swing.JLabel();
        lbl_NCC = new javax.swing.JLabel();
        lbl_GiaBan = new javax.swing.JLabel();
        lbl_giaNhap = new javax.swing.JLabel();
        lbl_KichThuoc = new javax.swing.JLabel();
        lbl_MauSac = new javax.swing.JLabel();
        lbl_ChatLieu = new javax.swing.JLabel();
        lbl_SoLuong = new javax.swing.JLabel();
        txt_GiaNhap = new javax.swing.JTextField();
        txt_GiaBan = new javax.swing.JTextField();
        txt_SoLuong = new javax.swing.JTextField();
        pnl_HinhAnhSP = new javax.swing.JPanel();
        cmb_ChatLieu = new javax.swing.JComboBox<>();
        cmb_PhanLoai = new javax.swing.JComboBox<>();
        cmb_MauSac = new javax.swing.JComboBox<>();
        cmb_KichThuoc = new javax.swing.JComboBox<>();
        cmb_NCC = new javax.swing.JComboBox<>();
        pnl_NutChucNang = new javax.swing.JPanel();
        btn_Them = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_CapNhat = new javax.swing.JButton();
        btn_Luu = new javax.swing.JButton();

        setBackground(new java.awt.Color(199, 210, 213));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        tbl_SanPham.setBackground(new java.awt.Color(255, 255, 255));
        tbl_SanPham.setForeground(new java.awt.Color(0, 0, 0));
        tbl_SanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SP0001", "Áo thun", "Áo", "250000", "275000", "L", "Trắng", "Cotton", "CT TNHH Hades", "10"},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {"", null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Phân loại", "Giá bán ", "Giá nhập", "Kích cỡ", "Màu sắc", "Chất liệu", "Nhà cung cấp", "Số lượng tồn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_SanPham.setShowGrid(true);
        scr_DanhSachSanPham.setViewportView(tbl_SanPham);

        javax.swing.GroupLayout pnl_DanhSachSanPhamLayout = new javax.swing.GroupLayout(pnl_DanhSachSanPham);
        pnl_DanhSachSanPham.setLayout(pnl_DanhSachSanPhamLayout);
        pnl_DanhSachSanPhamLayout.setHorizontalGroup(
            pnl_DanhSachSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachSanPham)
        );
        pnl_DanhSachSanPhamLayout.setVerticalGroup(
            pnl_DanhSachSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
        );

        pnl_ThongTin.setBackground(new java.awt.Color(199, 210, 213));
        pnl_ThongTin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txt_TenSP.setBackground(new java.awt.Color(255, 255, 255));
        txt_TenSP.setForeground(new java.awt.Color(0, 0, 0));
        txt_TenSP.setText("Áo thun");
        txt_TenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenSPActionPerformed(evt);
            }
        });

        txt_MaSP.setBackground(new java.awt.Color(255, 255, 255));
        txt_MaSP.setForeground(new java.awt.Color(0, 0, 0));
        txt_MaSP.setText("SP001");
        txt_MaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaSPActionPerformed(evt);
            }
        });

        lbl_MaSP.setForeground(new java.awt.Color(0, 0, 0));
        lbl_MaSP.setText("Mã sản phẩm");

        lbl_PhanLoai.setForeground(new java.awt.Color(0, 0, 0));
        lbl_PhanLoai.setText("Phân loại");

        lbl_TenSP.setForeground(new java.awt.Color(0, 0, 0));
        lbl_TenSP.setText("Tên sản phẩm");

        lbl_NCC.setForeground(new java.awt.Color(0, 0, 0));
        lbl_NCC.setText("Nhà cung cấp");

        lbl_GiaBan.setForeground(new java.awt.Color(0, 0, 0));
        lbl_GiaBan.setText("Giá bán");

        lbl_giaNhap.setForeground(new java.awt.Color(0, 0, 0));
        lbl_giaNhap.setText("Giá nhập");

        lbl_KichThuoc.setForeground(new java.awt.Color(0, 0, 0));
        lbl_KichThuoc.setText("Kích thước");

        lbl_MauSac.setForeground(new java.awt.Color(0, 0, 0));
        lbl_MauSac.setText("Màu sắc");

        lbl_ChatLieu.setForeground(new java.awt.Color(0, 0, 0));
        lbl_ChatLieu.setText("Chất liệu");

        lbl_SoLuong.setForeground(new java.awt.Color(0, 0, 0));
        lbl_SoLuong.setText("Số lượng");

        txt_GiaNhap.setBackground(new java.awt.Color(255, 255, 255));
        txt_GiaNhap.setForeground(new java.awt.Color(0, 0, 0));
        txt_GiaNhap.setText("275000");
        txt_GiaNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GiaNhapActionPerformed(evt);
            }
        });

        txt_GiaBan.setBackground(new java.awt.Color(255, 255, 255));
        txt_GiaBan.setForeground(new java.awt.Color(0, 0, 0));
        txt_GiaBan.setText("250000");
        txt_GiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GiaBanActionPerformed(evt);
            }
        });

        txt_SoLuong.setBackground(new java.awt.Color(255, 255, 255));
        txt_SoLuong.setForeground(new java.awt.Color(0, 0, 0));
        txt_SoLuong.setText("10");
        txt_SoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SoLuongActionPerformed(evt);
            }
        });

        pnl_HinhAnhSP.setBackground(new java.awt.Color(255, 255, 255));
        pnl_HinhAnhSP.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout pnl_HinhAnhSPLayout = new javax.swing.GroupLayout(pnl_HinhAnhSP);
        pnl_HinhAnhSP.setLayout(pnl_HinhAnhSPLayout);
        pnl_HinhAnhSPLayout.setHorizontalGroup(
            pnl_HinhAnhSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_HinhAnhSPLayout.setVerticalGroup(
            pnl_HinhAnhSPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );

        cmb_ChatLieu.setBackground(new java.awt.Color(255, 255, 255));
        cmb_ChatLieu.setForeground(new java.awt.Color(0, 0, 0));
        cmb_ChatLieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cotton" }));

        cmb_PhanLoai.setBackground(new java.awt.Color(255, 255, 255));
        cmb_PhanLoai.setForeground(new java.awt.Color(0, 0, 0));
        cmb_PhanLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áo" }));

        cmb_MauSac.setBackground(new java.awt.Color(255, 255, 255));
        cmb_MauSac.setForeground(new java.awt.Color(0, 0, 0));
        cmb_MauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trắng" }));

        cmb_KichThuoc.setBackground(new java.awt.Color(255, 255, 255));
        cmb_KichThuoc.setForeground(new java.awt.Color(0, 0, 0));
        cmb_KichThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L" }));

        cmb_NCC.setBackground(new java.awt.Color(255, 255, 255));
        cmb_NCC.setForeground(new java.awt.Color(0, 0, 0));
        cmb_NCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CT THHH Hades" }));

        javax.swing.GroupLayout pnl_ThongTinLayout = new javax.swing.GroupLayout(pnl_ThongTin);
        pnl_ThongTin.setLayout(pnl_ThongTinLayout);
        pnl_ThongTinLayout.setHorizontalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbl_MaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_MaSP)
                        .addComponent(cmb_PhanLoai, 0, 150, Short.MAX_VALUE))
                    .addComponent(txt_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_ChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_GiaBan, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(lbl_GiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_giaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_GiaNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(cmb_KichThuoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_SoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(lbl_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnl_HinhAnhSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(cmb_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        pnl_ThongTinLayout.setVerticalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_MaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_NCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_giaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_GiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_GiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_GiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_ChatLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl_HinhAnhSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnl_NutChucNang.setBackground(new java.awt.Color(199, 210, 213));

        btn_Them.setBackground(new java.awt.Color(255, 255, 255));
        btn_Them.setForeground(new java.awt.Color(0, 0, 0));
        btn_Them.setText("Thêm");
        btn_Them.setBorder(null);

        btn_Xoa.setBackground(new java.awt.Color(255, 255, 255));
        btn_Xoa.setForeground(new java.awt.Color(0, 0, 0));
        btn_Xoa.setText("Xóa");
        btn_Xoa.setBorder(null);
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_CapNhat.setBackground(new java.awt.Color(255, 255, 255));
        btn_CapNhat.setForeground(new java.awt.Color(0, 0, 0));
        btn_CapNhat.setText("Cập nhật");
        btn_CapNhat.setBorder(null);
        btn_CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CapNhatActionPerformed(evt);
            }
        });

        btn_Luu.setBackground(new java.awt.Color(255, 255, 255));
        btn_Luu.setForeground(new java.awt.Color(0, 0, 0));
        btn_Luu.setText("Lưu");
        btn_Luu.setBorder(null);
        btn_Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LuuActionPerformed(evt);
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
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Luu, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnl_NutChucNangLayout.setVerticalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Luu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnl_DanhSachSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(pnl_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txt_TenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenSPActionPerformed

    private void txt_MaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaSPActionPerformed

    private void txt_GiaNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GiaNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GiaNhapActionPerformed

    private void txt_GiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GiaBanActionPerformed

    private void txt_SoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoLuongActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CapNhatActionPerformed

    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_LuuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_Luu;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JComboBox<String> cmb_ChatLieu;
    private javax.swing.JComboBox<String> cmb_KichThuoc;
    private javax.swing.JComboBox<String> cmb_MauSac;
    private javax.swing.JComboBox<String> cmb_NCC;
    private javax.swing.JComboBox<String> cmb_PhanLoai;
    private javax.swing.JLabel lbl_ChatLieu;
    private javax.swing.JLabel lbl_GiaBan;
    private javax.swing.JLabel lbl_KichThuoc;
    private javax.swing.JLabel lbl_MaSP;
    private javax.swing.JLabel lbl_MauSac;
    private javax.swing.JLabel lbl_NCC;
    private javax.swing.JLabel lbl_PhanLoai;
    private javax.swing.JLabel lbl_SoLuong;
    private javax.swing.JLabel lbl_TenSP;
    private javax.swing.JLabel lbl_giaNhap;
    private javax.swing.JPanel pnl_DanhSachSanPham;
    private javax.swing.JPanel pnl_HinhAnhSP;
    private javax.swing.JPanel pnl_NutChucNang;
    private javax.swing.JPanel pnl_ThongTin;
    private javax.swing.JScrollPane scr_DanhSachSanPham;
    private javax.swing.JTable tbl_SanPham;
    private javax.swing.JTextField txt_GiaBan;
    private javax.swing.JTextField txt_GiaNhap;
    private javax.swing.JTextField txt_MaSP;
    private javax.swing.JTextField txt_SoLuong;
    private javax.swing.JTextField txt_TenSP;
    // End of variables declaration//GEN-END:variables
}
