/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlbhtt;

import connectDB.Connect;
import dao.Dao_ChatLieu;
import dao.Dao_KichThuoc;
import dao.Dao_MauSac;
import dao.Dao_NhaCungCap;
import dao.Dao_PhanLoai;
import dao.Dao_SanPham;
import entity.KichThuoc;
import entity.MauSac;
import entity.PhanLoai;
import entity.SanPham;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


/**
 *
 * @author DMX
 */
public class ManHinh_NV_ThongKeSanPham extends javax.swing.JPanel {
    private Dao_SanPham daoSanPham;
    private Dao_KichThuoc daoKichThuoc;
    private Dao_MauSac daoMauSac;
    private Dao_ChatLieu daoChatLieu;
    private Dao_PhanLoai daoPhanLoai;
    private Dao_NhaCungCap daoNhaCungCap;
    
    private Connect connect;
    private DefaultTableModel model_SP;
    /**
     * Creates new form quanly
     */
    public ManHinh_NV_ThongKeSanPham() throws SQLException {
        daoSanPham = new Dao_SanPham();
        daoKichThuoc = new Dao_KichThuoc();
        daoMauSac = new Dao_MauSac();
        daoChatLieu = new Dao_ChatLieu();
        daoPhanLoai = new Dao_PhanLoai();
        daoNhaCungCap = new Dao_NhaCungCap();
        
        connect = new Connect();
        connect.connect();
        
        initComponents();
        model_SP = (DefaultTableModel) tbl_SanPham.getModel();
        docDuLieuSanPham();
        khoiTaoGiaTriCombobox();
    }
    
    /**
     * Khởi tạo, load giá trị vào combobox
     */
    public void khoiTaoGiaTriCombobox() {
        for (KichThuoc kt : daoKichThuoc.getAllKichThuoc()) {
            cmb_KichThuoc.addItem(kt.getKichThuoc());
        }
        
        for (MauSac ms : daoMauSac.getAllMauSac()) {
            cmb_MauSac.addItem(ms.getMauSac());
        }
        
        for (PhanLoai pl : daoPhanLoai.getAllPhanLoai()) {
            cmb_PhanLoai.addItem(pl.getLoaiSanPham());
        }
    }
    
    /**
     * Đọc dữ liệu sản phẩm và load vào bảng
     */
    public void docDuLieuSanPham() {
        
        for(SanPham sp: daoSanPham.getAllSanPham()){
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String ngayNhapForMat = formatter.format(sp.getNgayNhap());
            Object[] o = new Object[11];
            o[0] = sp.getMaSP();
            o[1] = sp.getTenSP();
            o[2] = sp.getPhanLoai().getLoaiSanPham();
            o[3] = sp.getGiaBan();
            o[4] = sp.getGiaNhap();
            o[5] = ngayNhapForMat;
            o[6] = sp.getKichThuoc().getKichThuoc();
            o[7] = sp.getMauSac().getMauSac();
            o[8] = sp.getChatLieu().getChatLieu();
            o[9] = sp.getNhaCungCap().getTenNCC();
            o[10] = sp.getSoLuong();
             model_SP.addRow(o);
             
        }
    }
    
    /**
     * Tổng số lượng sản phẩm
     */
    public void thongKeTongSanPham() {
        int soLuongSP = daoSanPham.getAllSanPham().size();        
        txt_TongSanPham.setText(soLuongSP+"");
    }
    
    /**
     * Thông kê danh sách sản phẩm hết hàng trong kho
     */
    public void thongKeDsSanPhamHetHang() {
        model_SP.setRowCount(0);
        
        String phanLoai = cmb_PhanLoai.getSelectedItem().toString();
        String ktPhanLoai = cmb_PhanLoai.getSelectedItem().toString();
        if(ktPhanLoai.equalsIgnoreCase("Tất cả")){
            phanLoai = "";
        }        
        
        String mauSac = cmb_MauSac.getSelectedItem().toString();
        String ktMauSac = cmb_MauSac.getSelectedItem().toString();
        if(ktMauSac.equalsIgnoreCase("Tất cả")){
            mauSac = "";
        }
        
        String kichThuoc = cmb_KichThuoc.getSelectedItem().toString();
        String ktKichThuoc = cmb_KichThuoc.getSelectedItem().toString();
        if(ktKichThuoc.equalsIgnoreCase("Tất cả")){
            kichThuoc = "";
        }
        
        ArrayList<SanPham> listSanPham = daoSanPham.getAllSanPhamHetHang(phanLoai, mauSac, kichThuoc);
        for(SanPham sp: listSanPham) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String ngayNhapForMat = formatter.format(sp.getNgayNhap());
            Object[] o = new Object[11];
                o[0] = sp.getMaSP();
                o[1] = sp.getTenSP();
                o[2] = sp.getPhanLoai().getLoaiSanPham();
                o[3] = sp.getGiaBan();
                o[4] = sp.getGiaNhap();
                o[5] = ngayNhapForMat;
                o[6] = sp.getKichThuoc().getKichThuoc();
                o[7] = sp.getMauSac().getMauSac();
                o[8] = sp.getChatLieu().getChatLieu();
                o[9] = sp.getNhaCungCap().getTenNCC();
                o[10] = sp.getSoLuong();
             model_SP.addRow(o);
        }
    }    
    
    /**
     * Thông kê danh sách sản phẩm theo các tiêu chí
     */
    public void thongKeDsSanPhamTheoTieuChi() {
        model_SP.setRowCount(0);
        
        String phanLoai = cmb_PhanLoai.getSelectedItem().toString();
        String ktPhanLoai = cmb_PhanLoai.getSelectedItem().toString();
        if(ktPhanLoai.equalsIgnoreCase("Tất cả")){
            phanLoai = "";
        }        
        
        String mauSac = cmb_MauSac.getSelectedItem().toString();
        String ktMauSac = cmb_MauSac.getSelectedItem().toString();
        if(ktMauSac.equalsIgnoreCase("Tất cả")){
            mauSac = "";
        }
        
        String kichThuoc = cmb_KichThuoc.getSelectedItem().toString();
        String ktKichThuoc = cmb_KichThuoc.getSelectedItem().toString();
        if(ktKichThuoc.equalsIgnoreCase("Tất cả")){
            kichThuoc = "";
        }
        
        ArrayList<SanPham> listSanPham = daoSanPham.getAllSanPhamTheoTieuChi(phanLoai, mauSac, kichThuoc);
        for(SanPham sp: listSanPham) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String ngayNhapForMat = formatter.format(sp.getNgayNhap());
            Object[] o = new Object[11];
                o[0] = sp.getMaSP();
                o[1] = sp.getTenSP();
                o[2] = sp.getPhanLoai().getLoaiSanPham();
                o[3] = sp.getGiaBan();
                o[4] = sp.getGiaNhap();
                o[5] = ngayNhapForMat;
                o[6] = sp.getKichThuoc().getKichThuoc();
                o[7] = sp.getMauSac().getMauSac();
                o[8] = sp.getChatLieu().getChatLieu();
                o[9] = sp.getNhaCungCap().getTenNCC();
                o[10] = sp.getSoLuong();
             model_SP.addRow(o);
        }
    }
    
    /**
     * Thống kê top sản phẩm bán chạy
     */
    public void thongKeSanPhamBanChay() {
        model_SP.setRowCount(0);
        System.out.println("ss");
        for(SanPham sp: daoSanPham.getSanPhamBanChay()) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            String ngayNhapForMat = formatter.format(sp.getNgayNhap());
            Object[] o = new Object[11];
                o[0] = sp.getMaSP();
                o[1] = sp.getTenSP();
                o[2] = sp.getPhanLoai().getLoaiSanPham();
                o[3] = sp.getGiaBan();
                o[4] = sp.getGiaNhap();
                o[5] = ngayNhapForMat;
                o[6] = sp.getKichThuoc().getKichThuoc();
                o[7] = sp.getMauSac().getMauSac();
                o[8] = sp.getChatLieu().getChatLieu();
                o[9] = sp.getNhaCungCap().getTenNCC();
                o[10] = sp.getSoLuong();
             model_SP.addRow(o);
             
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

        pnl_DanhSachSanPham = new javax.swing.JPanel();
        scr_DanhSachSanPham = new javax.swing.JScrollPane();
        tbl_SanPham = new javax.swing.JTable();
        pnl_NV_TieuDe = new javax.swing.JPanel();
        lbl_TieuDe = new javax.swing.JLabel();
        pnl_ThongTin = new javax.swing.JPanel();
        lbl_PhanLoai = new javax.swing.JLabel();
        lbl_KichThuoc = new javax.swing.JLabel();
        lbl_MauSac = new javax.swing.JLabel();
        pnl_TongSanPham = new javax.swing.JPanel();
        lbl_TongSanPham = new javax.swing.JLabel();
        txt_TongSanPham = new javax.swing.JTextField();
        cmb_PhanLoai = new javax.swing.JComboBox<>();
        cmb_MauSac = new javax.swing.JComboBox<>();
        cmb_KichThuoc = new javax.swing.JComboBox<>();
        chk_TatCa = new javax.swing.JCheckBox();
        rad_HangMoiNhap = new javax.swing.JRadioButton();
        rad_HetHangTrongKho = new javax.swing.JRadioButton();
        btn_TopSPBanChay = new javax.swing.JButton();
        btn_TopSPBanChạm = new javax.swing.JButton();
        pnl_NutChucNang = new javax.swing.JPanel();
        btn_XuatThongKe = new javax.swing.JButton();

        setBackground(new java.awt.Color(199, 210, 213));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        scr_DanhSachSanPham.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tbl_SanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_SanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Phân loại", "Giá bán ", "Giá nhập", "Ngày nhập", "Kích cỡ", "Màu sắc", "Chất liệu", "Nhà cung cấp", "Số lượng tồn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_SanPham.setRowHeight(35);
        tbl_SanPham.setShowGrid(true);
        scr_DanhSachSanPham.setViewportView(tbl_SanPham);

        lbl_TieuDe.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        lbl_TieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TieuDe.setText("THỐNG KÊ SẢN PHẨM");
        lbl_TieuDe.setMaximumSize(new java.awt.Dimension(32767, 32767));
        lbl_TieuDe.setPreferredSize(new java.awt.Dimension(181, 40));

        javax.swing.GroupLayout pnl_NV_TieuDeLayout = new javax.swing.GroupLayout(pnl_NV_TieuDe);
        pnl_NV_TieuDe.setLayout(pnl_NV_TieuDeLayout);
        pnl_NV_TieuDeLayout.setHorizontalGroup(
            pnl_NV_TieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_NV_TieuDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_NV_TieuDeLayout.setVerticalGroup(
            pnl_NV_TieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_DanhSachSanPhamLayout = new javax.swing.GroupLayout(pnl_DanhSachSanPham);
        pnl_DanhSachSanPham.setLayout(pnl_DanhSachSanPhamLayout);
        pnl_DanhSachSanPhamLayout.setHorizontalGroup(
            pnl_DanhSachSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachSanPham)
            .addComponent(pnl_NV_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_DanhSachSanPhamLayout.setVerticalGroup(
            pnl_DanhSachSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DanhSachSanPhamLayout.createSequentialGroup()
                .addComponent(pnl_NV_TieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scr_DanhSachSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
        );

        pnl_ThongTin.setBackground(new java.awt.Color(199, 210, 213));
        pnl_ThongTin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnl_ThongTin.setPreferredSize(new java.awt.Dimension(1151, 300));

        lbl_PhanLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_PhanLoai.setText("Phân loại");

        lbl_KichThuoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_KichThuoc.setText("Kích thước");

        lbl_MauSac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_MauSac.setText("Màu sắc");

        pnl_TongSanPham.setBackground(new java.awt.Color(255, 255, 255));
        pnl_TongSanPham.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lbl_TongSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TongSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TongSanPham.setText("Tổng sản phẩm");
        lbl_TongSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_TongSanPham.setEditable(false);
        txt_TongSanPham.setBackground(new java.awt.Color(255, 255, 255));
        txt_TongSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_TongSanPham.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_TongSanPham.setText("0");
        txt_TongSanPham.setBorder(null);

        javax.swing.GroupLayout pnl_TongSanPhamLayout = new javax.swing.GroupLayout(pnl_TongSanPham);
        pnl_TongSanPham.setLayout(pnl_TongSanPhamLayout);
        pnl_TongSanPhamLayout.setHorizontalGroup(
            pnl_TongSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TongSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_TongSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TongSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(txt_TongSanPham, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnl_TongSanPhamLayout.setVerticalGroup(
            pnl_TongSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TongSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TongSanPham)
                .addGap(42, 42, 42)
                .addComponent(txt_TongSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        cmb_PhanLoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_PhanLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        cmb_PhanLoai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_PhanLoaiItemStateChanged(evt);
            }
        });

        cmb_MauSac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_MauSac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        cmb_MauSac.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_MauSacItemStateChanged(evt);
            }
        });

        cmb_KichThuoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_KichThuoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        cmb_KichThuoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_KichThuocItemStateChanged(evt);
            }
        });

        chk_TatCa.setBackground(new java.awt.Color(199, 210, 213));
        chk_TatCa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chk_TatCa.setSelected(true);
        chk_TatCa.setText("Tất cả");
        chk_TatCa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk_TatCaItemStateChanged(evt);
            }
        });

        rad_HangMoiNhap.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rad_HangMoiNhap.setText("Hàng mới nhập");
        rad_HangMoiNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_HangMoiNhapItemStateChanged(evt);
            }
        });

        rad_HetHangTrongKho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rad_HetHangTrongKho.setText("Hết hàng trong kho");
        rad_HetHangTrongKho.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rad_HetHangTrongKhoItemStateChanged(evt);
            }
        });

        btn_TopSPBanChay.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_TopSPBanChay.setText("Top những sản phẩm bán chạy");
        btn_TopSPBanChay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TopSPBanChayActionPerformed(evt);
            }
        });

        btn_TopSPBanChạm.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_TopSPBanChạm.setText("Top những sản phẩm bán chậm");
        btn_TopSPBanChạm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TopSPBanChạmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ThongTinLayout = new javax.swing.GroupLayout(pnl_ThongTin);
        pnl_ThongTin.setLayout(pnl_ThongTinLayout);
        pnl_ThongTinLayout.setHorizontalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(pnl_TongSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rad_HangMoiNhap)
                    .addComponent(rad_HetHangTrongKho)
                    .addComponent(chk_TatCa))
                .addGap(100, 100, 100)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmb_MauSac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_TopSPBanChạm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_TopSPBanChay, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnl_ThongTinLayout.setVerticalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lbl_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_KichThuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rad_HangMoiNhap)
                            .addComponent(btn_TopSPBanChay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                        .addComponent(lbl_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmb_MauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_TopSPBanChạm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmb_PhanLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(rad_HetHangTrongKho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk_TatCa))))
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(pnl_TongSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pnl_NutChucNang.setBackground(new java.awt.Color(199, 210, 213));

        btn_XuatThongKe.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
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
                .addComponent(pnl_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btn_XuatThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XuatThongKeMouseEntered
        btn_XuatThongKe.setBackground(new Color(0x9EDDFF));
       btn_XuatThongKe.setForeground(new Color(0x141E46));
    }//GEN-LAST:event_btn_XuatThongKeMouseEntered

    private void btn_XuatThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XuatThongKeMouseExited
        btn_XuatThongKe.setBackground(UIManager.getColor("Menu.background"));
        btn_XuatThongKe.setForeground(UIManager.getColor("Menu.foreground"));
    }//GEN-LAST:event_btn_XuatThongKeMouseExited

    private void btn_TopSPBanChayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TopSPBanChayActionPerformed
        thongKeSanPhamBanChay();
        chk_TatCa.setSelected(false);
    }//GEN-LAST:event_btn_TopSPBanChayActionPerformed

    private void btn_TopSPBanChạmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TopSPBanChạmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_TopSPBanChạmActionPerformed

    private void cmb_KichThuocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_KichThuocItemStateChanged
        if(rad_HetHangTrongKho.isSelected()) {
            thongKeDsSanPhamHetHang();
        } else {
            thongKeDsSanPhamTheoTieuChi();
        }
    }//GEN-LAST:event_cmb_KichThuocItemStateChanged

    private void cmb_MauSacItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_MauSacItemStateChanged
        if(rad_HetHangTrongKho.isSelected()) {
            thongKeDsSanPhamHetHang();
        } else {
            thongKeDsSanPhamTheoTieuChi();
        }
    }//GEN-LAST:event_cmb_MauSacItemStateChanged

    private void cmb_PhanLoaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_PhanLoaiItemStateChanged
        if(rad_HetHangTrongKho.isSelected()) {
            thongKeDsSanPhamHetHang();
        } else {
            thongKeDsSanPhamTheoTieuChi();
        }
    }//GEN-LAST:event_cmb_PhanLoaiItemStateChanged

    private void chk_TatCaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk_TatCaItemStateChanged
        if(chk_TatCa.isSelected()) {
            rad_HangMoiNhap.setSelected(false);
            rad_HetHangTrongKho.setSelected(false);
            thongKeDsSanPhamTheoTieuChi();
        }
    }//GEN-LAST:event_chk_TatCaItemStateChanged

    private void rad_HetHangTrongKhoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_HetHangTrongKhoItemStateChanged
        if(rad_HetHangTrongKho.isSelected()) {
            rad_HangMoiNhap.setSelected(false);
            chk_TatCa.setSelected(false);
        }
        thongKeDsSanPhamHetHang();
    }//GEN-LAST:event_rad_HetHangTrongKhoItemStateChanged

    private void rad_HangMoiNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rad_HangMoiNhapItemStateChanged
        if(rad_HangMoiNhap.isSelected()) {
            rad_HetHangTrongKho.setSelected(false);
            chk_TatCa.setSelected(false);
        }
    }//GEN-LAST:event_rad_HangMoiNhapItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_TopSPBanChay;
    private javax.swing.JButton btn_TopSPBanChạm;
    private javax.swing.JButton btn_XuatThongKe;
    private javax.swing.JCheckBox chk_TatCa;
    private javax.swing.JComboBox<String> cmb_KichThuoc;
    private javax.swing.JComboBox<String> cmb_MauSac;
    private javax.swing.JComboBox<String> cmb_PhanLoai;
    private javax.swing.JLabel lbl_KichThuoc;
    private javax.swing.JLabel lbl_MauSac;
    private javax.swing.JLabel lbl_PhanLoai;
    private javax.swing.JLabel lbl_TieuDe;
    private javax.swing.JLabel lbl_TongSanPham;
    private javax.swing.JPanel pnl_DanhSachSanPham;
    private javax.swing.JPanel pnl_NV_TieuDe;
    private javax.swing.JPanel pnl_NutChucNang;
    private javax.swing.JPanel pnl_ThongTin;
    private javax.swing.JPanel pnl_TongSanPham;
    private javax.swing.JRadioButton rad_HangMoiNhap;
    private javax.swing.JRadioButton rad_HetHangTrongKho;
    private javax.swing.JScrollPane scr_DanhSachSanPham;
    private javax.swing.JTable tbl_SanPham;
    private javax.swing.JTextField txt_TongSanPham;
    // End of variables declaration//GEN-END:variables
}
