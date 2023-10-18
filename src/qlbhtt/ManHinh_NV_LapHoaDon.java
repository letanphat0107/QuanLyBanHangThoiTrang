/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlbhtt;

/**
 *
 * @author DMX
 */
public class ManHinh_NV_LapHoaDon extends javax.swing.JPanel {

    /**
     * Creates new form quanly
     */
    public ManHinh_NV_LapHoaDon() {
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
        pnl_DieuChinhGioHang = new javax.swing.JPanel();
        lbl_NhapSoLuong = new javax.swing.JLabel();
        lbl_TongTienGioHang = new javax.swing.JLabel();
        txt_SoLuongNhap = new javax.swing.JTextField();
        btn_Them = new javax.swing.JButton();
        btn_Giam = new javax.swing.JButton();
        txt_TongTienGioHang = new javax.swing.JTextField();
        lbl_DonViGia = new javax.swing.JLabel();
        pnl_GioHang = new javax.swing.JPanel();
        scr_GioHang = new javax.swing.JScrollPane();
        tbl_GioHang = new javax.swing.JTable();
        pnl_ThongTin = new javax.swing.JPanel();
        txt_TenSP = new javax.swing.JTextField();
        txt_MaSP = new javax.swing.JTextField();
        lbl_MaSP = new javax.swing.JLabel();
        lbl_PhanLoai = new javax.swing.JLabel();
        lbl_TenSP = new javax.swing.JLabel();
        lbl_KichThuoc = new javax.swing.JLabel();
        pnl_HinhAnhSanPham = new javax.swing.JPanel();
        lbl_HinhAnhSanPham = new javax.swing.JLabel();
        cmb_PhanLoai = new javax.swing.JComboBox<>();
        cmb_KichThuoc = new javax.swing.JComboBox<>();
        lbl_MauSac = new javax.swing.JLabel();
        lbl_GiaBan = new javax.swing.JLabel();
        cmb_MauSac = new javax.swing.JComboBox<>();
        txt_GiaBan = new javax.swing.JTextField();
        pnl_KhuVucTTKhachHang = new javax.swing.JPanel();
        lbl_TenKH = new javax.swing.JLabel();
        txt_TenKH = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lbl_SoDienThoai = new javax.swing.JLabel();
        txt_SoDienThoai = new javax.swing.JTextField();
        btn_ThemKhachHang = new javax.swing.JButton();
        pnl_NutChucNang = new javax.swing.JPanel();
        btn_LapHoaDon = new javax.swing.JButton();

        setBackground(new java.awt.Color(199, 210, 213));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        tbl_SanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SP0001", "Áo thun", "Áo", "250000", "L", "Trắng", "Cotton", "CT TNHH Hades", "10"},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Phân loại", "Giá bán ", "Kích cỡ", "Màu sắc", "Chất liệu", "Nhà cung cấp", "Số lượng tồn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_SanPham.setShowGrid(true);
        scr_DanhSachSanPham.setViewportView(tbl_SanPham);

        pnl_DieuChinhGioHang.setBackground(new java.awt.Color(255, 255, 255));

        lbl_NhapSoLuong.setText("Nhập số lượng:");

        lbl_TongTienGioHang.setText("Tổng tiền giỏ hàng:");

        btn_Them.setBackground(new java.awt.Color(199, 210, 213));
        btn_Them.setText("Giảm");
        btn_Them.setBorder(null);

        btn_Giam.setBackground(new java.awt.Color(199, 210, 213));
        btn_Giam.setText("Thêm");
        btn_Giam.setBorder(null);

        txt_TongTienGioHang.setEditable(false);
        txt_TongTienGioHang.setText("250000");

        lbl_DonViGia.setText("vnd");

        javax.swing.GroupLayout pnl_DieuChinhGioHangLayout = new javax.swing.GroupLayout(pnl_DieuChinhGioHang);
        pnl_DieuChinhGioHang.setLayout(pnl_DieuChinhGioHangLayout);
        pnl_DieuChinhGioHangLayout.setHorizontalGroup(
            pnl_DieuChinhGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DieuChinhGioHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_NhapSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_SoLuongNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Giam, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_TongTienGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_TongTienGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_DonViGia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        pnl_DieuChinhGioHangLayout.setVerticalGroup(
            pnl_DieuChinhGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DieuChinhGioHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_DieuChinhGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NhapSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_TongTienGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_SoLuongNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TongTienGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DonViGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Giam, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnl_GioHang.setBackground(new java.awt.Color(255, 255, 255));

        tbl_GioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"SP0001", "Áo thun", "Áo", "250000", "L", "Trắng", "Cotton", "CT TNHH Hades", "1"},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Phân loại", "Giá bán ", "Kích cỡ", "Màu sắc", "Chất liệu", "Nhà cung cấp", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_GioHang.setShowGrid(true);
        scr_GioHang.setViewportView(tbl_GioHang);

        javax.swing.GroupLayout pnl_GioHangLayout = new javax.swing.GroupLayout(pnl_GioHang);
        pnl_GioHang.setLayout(pnl_GioHangLayout);
        pnl_GioHangLayout.setHorizontalGroup(
            pnl_GioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_GioHang, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        pnl_GioHangLayout.setVerticalGroup(
            pnl_GioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_GioHangLayout.createSequentialGroup()
                .addComponent(scr_GioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_DanhSachSanPhamLayout = new javax.swing.GroupLayout(pnl_DanhSachSanPham);
        pnl_DanhSachSanPham.setLayout(pnl_DanhSachSanPhamLayout);
        pnl_DanhSachSanPhamLayout.setHorizontalGroup(
            pnl_DanhSachSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(pnl_DieuChinhGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_GioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_DanhSachSanPhamLayout.setVerticalGroup(
            pnl_DanhSachSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DanhSachSanPhamLayout.createSequentialGroup()
                .addComponent(scr_DanhSachSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_DieuChinhGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl_GioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_ThongTin.setBackground(new java.awt.Color(199, 210, 213));
        pnl_ThongTin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        txt_TenSP.setText("Áo thun");
        txt_TenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenSPActionPerformed(evt);
            }
        });

        txt_MaSP.setEditable(false);
        txt_MaSP.setText("SP001");
        txt_MaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaSPActionPerformed(evt);
            }
        });

        lbl_MaSP.setText("Mã sản phẩm");

        lbl_PhanLoai.setText("Phân loại");

        lbl_TenSP.setText("Tên sản phẩm");

        lbl_KichThuoc.setText("Kích thước");

        pnl_HinhAnhSanPham.setBackground(new java.awt.Color(255, 255, 255));
        pnl_HinhAnhSanPham.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lbl_HinhAnhSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_HinhAnhSanPham.setText("Hình Ảnh");

        javax.swing.GroupLayout pnl_HinhAnhSanPhamLayout = new javax.swing.GroupLayout(pnl_HinhAnhSanPham);
        pnl_HinhAnhSanPham.setLayout(pnl_HinhAnhSanPhamLayout);
        pnl_HinhAnhSanPhamLayout.setHorizontalGroup(
            pnl_HinhAnhSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HinhAnhSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_HinhAnhSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_HinhAnhSanPhamLayout.setVerticalGroup(
            pnl_HinhAnhSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_HinhAnhSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_HinhAnhSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );

        cmb_PhanLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Áo" }));

        cmb_KichThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L" }));

        lbl_MauSac.setText("Màu sắc");

        lbl_GiaBan.setText("Giá bán");

        cmb_MauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trắng" }));

        txt_GiaBan.setEditable(false);
        txt_GiaBan.setText("SP001");
        txt_GiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_GiaBanActionPerformed(evt);
            }
        });

        pnl_KhuVucTTKhachHang.setBackground(new java.awt.Color(199, 210, 213));
        pnl_KhuVucTTKhachHang.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm khách hàng"));

        lbl_TenKH.setText("Tên khách hàng");

        txt_TenKH.setText("Nguyễn Thị A");
        txt_TenKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenKHActionPerformed(evt);
            }
        });

        jButton1.setText("Tìm Khách Hàng");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbl_SoDienThoai.setText("Số điện thoại");

        txt_SoDienThoai.setText("0367494954");

        btn_ThemKhachHang.setText("Thêm");
        btn_ThemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemKhachHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_KhuVucTTKhachHangLayout = new javax.swing.GroupLayout(pnl_KhuVucTTKhachHang);
        pnl_KhuVucTTKhachHang.setLayout(pnl_KhuVucTTKhachHangLayout);
        pnl_KhuVucTTKhachHangLayout.setHorizontalGroup(
            pnl_KhuVucTTKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhuVucTTKhachHangLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnl_KhuVucTTKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ThemKhachHang)
                .addContainerGap())
        );
        pnl_KhuVucTTKhachHangLayout.setVerticalGroup(
            pnl_KhuVucTTKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_KhuVucTTKhachHangLayout.createSequentialGroup()
                .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_KhuVucTTKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

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
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmb_KichThuoc, 0, 144, Short.MAX_VALUE)
                    .addComponent(lbl_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_MauSac, 0, 144, Short.MAX_VALUE)
                    .addComponent(txt_GiaBan))
                .addGap(48, 48, 48)
                .addComponent(pnl_HinhAnhSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_KhuVucTTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnl_ThongTinLayout.setVerticalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pnl_HinhAnhSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                            .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(lbl_MaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ThongTinLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lbl_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_MaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_KichThuoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_TenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(6, 6, 6)
                            .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_GiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmb_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_GiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(pnl_KhuVucTTKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnl_NutChucNang.setBackground(new java.awt.Color(199, 210, 213));

        btn_LapHoaDon.setText("Lập hóa đơn");
        btn_LapHoaDon.setBorder(null);

        javax.swing.GroupLayout pnl_NutChucNangLayout = new javax.swing.GroupLayout(pnl_NutChucNang);
        pnl_NutChucNang.setLayout(pnl_NutChucNangLayout);
        pnl_NutChucNangLayout.setHorizontalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_LapHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnl_NutChucNangLayout.setVerticalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btn_LapHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void txt_GiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_GiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_GiaBanActionPerformed

    private void txt_TenKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenKHActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_ThemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ThemKhachHangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Giam;
    private javax.swing.JButton btn_LapHoaDon;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_ThemKhachHang;
    private javax.swing.JComboBox<String> cmb_KichThuoc;
    private javax.swing.JComboBox<String> cmb_MauSac;
    private javax.swing.JComboBox<String> cmb_PhanLoai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbl_DonViGia;
    private javax.swing.JLabel lbl_GiaBan;
    private javax.swing.JLabel lbl_HinhAnhSanPham;
    private javax.swing.JLabel lbl_KichThuoc;
    private javax.swing.JLabel lbl_MaSP;
    private javax.swing.JLabel lbl_MauSac;
    private javax.swing.JLabel lbl_NhapSoLuong;
    private javax.swing.JLabel lbl_PhanLoai;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_TenKH;
    private javax.swing.JLabel lbl_TenSP;
    private javax.swing.JLabel lbl_TongTienGioHang;
    private javax.swing.JPanel pnl_DanhSachSanPham;
    private javax.swing.JPanel pnl_DieuChinhGioHang;
    private javax.swing.JPanel pnl_GioHang;
    private javax.swing.JPanel pnl_HinhAnhSanPham;
    private javax.swing.JPanel pnl_KhuVucTTKhachHang;
    private javax.swing.JPanel pnl_NutChucNang;
    private javax.swing.JPanel pnl_ThongTin;
    private javax.swing.JScrollPane scr_DanhSachSanPham;
    private javax.swing.JScrollPane scr_GioHang;
    private javax.swing.JTable tbl_GioHang;
    private javax.swing.JTable tbl_SanPham;
    private javax.swing.JTextField txt_GiaBan;
    private javax.swing.JTextField txt_MaSP;
    private javax.swing.JTextField txt_SoDienThoai;
    private javax.swing.JTextField txt_SoLuongNhap;
    private javax.swing.JTextField txt_TenKH;
    private javax.swing.JTextField txt_TenSP;
    private javax.swing.JTextField txt_TongTienGioHang;
    // End of variables declaration//GEN-END:variables
}
