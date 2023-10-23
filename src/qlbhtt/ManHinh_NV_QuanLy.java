/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlbhtt;

import connectDB.Connect;
import dao.Dao_NhanVien;
import entity.NhanVien;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author DMX
 */
public class ManHinh_NV_QuanLy extends javax.swing.JPanel {
    private DefaultTableModel modelNhanVien;
    private Dao_NhanVien daoNhanVien;
    private Connect connect;
    private boolean kiemTraHoaDongThem = false;
    private boolean kiemTraHoaDongSua = false;
    /**
     * Creates new form quanly
     */
    public ManHinh_NV_QuanLy() throws SQLException {
    daoNhanVien = new Dao_NhanVien();
        connect = new Connect();
        connect.connect();
        initComponents();
        docDuLieuNhanVien();
    }

    /**
     * Load dữ liệu vào bảng
     */
     public void docDuLieuNhanVien() {
        modelNhanVien = (DefaultTableModel) tbl_NhanVien.getModel();
        for(NhanVien nv: daoNhanVien.getAllNhanVien()) {
            Object[] object = new Object[7];
            object[0] = nv.getMaNV();
            object[1] = nv.getHoTen();
            object[2] = nv.getGioiTinh();
            object[3] = nv.getChuVu();
            object[4] = nv.getDiaChi();
            object[5] = nv.getSdt();
            object[6] = nv.getEmail();
            modelNhanVien.addRow(object);
        }
    }
    
    /**
     * Kiem tra hoat dong cua cac JtextField
     */
    public void kiemTraHoatDongTextNhap(boolean kiemTra) {
        txt_TenNV.setEditable(kiemTra);
        txt_SoDienThoai.setEditable(kiemTra);
        txt_Email.setEditable(kiemTra);
        txt_ChucVu.setEditable(kiemTra);
        txt_DiaChi.setEditable(kiemTra);
        rad_Nam.setEnabled(kiemTra);
        rad_Nu.setEnabled(kiemTra);
    }
    
    
    /**
     * Huy thao tac hoat dong cua componet
     */
    public void huyThaoTac() {
        kiemTraHoaDongThem = false;
        kiemTraHoaDongSua = false;
        btn_Them.setEnabled(true);
        btn_CapNhat.setEnabled(true);
        btn_Xoa.setEnabled(true);
        btn_Luu.setEnabled(false);
        kiemTraHoatDongTextNhap(false);
        xoaTrangTxt();
    }
    /**
     * Xóa trắng các Jtext filed
     */
    public void xoaTrangTxt() {
        txt_TenNV.setText("");
        txt_SoDienThoai.setText("");
        txt_DiaChi.setText("");
        txt_Email.setText("");
        txt_ChucVu.setText("");
        txt_MaNV.setText("");
        rad_Nam.setSelected(false);
        rad_Nu.setSelected(false);
    } 
    
    /**
     * regex thông tin nhập vào khi thêm hoặc sửa nhân viên
     */
    public boolean rangBuocDuLieuNhap() {
        //tạo regex cho các textfield
        String regexSoDienThoai = "^[0-9]{10}$"; //-> 0123456789
        String regexEmail = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$"; // -> abc@abc.abc
        
        //lấy giá trị từ các textfield
        String tenNhanVien = txt_TenNV.getText();
        String sdt = txt_SoDienThoai.getText();
        String email = txt_Email.getText();
        String diaChi = txt_DiaChi.getText();
        String chuVu = txt_ChucVu.getText();
        
        //kiểm tra các giá trị với regex
        if(txt_TenNV.getText().equals("") || txt_SoDienThoai.getText().equals("") || txt_Email.getText().equals("") || txt_DiaChi.getText().equals("")||txt_ChucVu.getText().equals("")){
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
        
        if(chuVu.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "Thông tin chức vụ không chứa số!");
            txt_ChucVu.requestFocus();
            return false;
        }
        
        if(tenNhanVien.matches(".*\\d.*")) {
            JOptionPane.showMessageDialog(this, "Thông tin tên Nhân Viên không chứa số!");
            txt_TenNV.requestFocus();
            return false;
        }
        return true;
    }
    
    /**
     * Xử lý thêm nhân viên
     */
    public void xuLyThemNhanVien() {
        if(!rangBuocDuLieuNhap()) {
            return;
        } 
        
        String tenNV = txt_TenNV.getText();
        String gioiTinh= "";
        if(rad_Nam.isSelected()) {
            gioiTinh = "Nam";
        } else if(rad_Nu.isSelected()) {
            gioiTinh = "Nữ";
        }
        String chucVu = txt_ChucVu.getText();
        String diaChi = txt_DiaChi.getText();
        String sdt = txt_SoDienThoai.getText();
        String email = txt_Email.getText();
        
        NhanVien nv = new NhanVien(tenNV, chucVu, email, sdt, diaChi, gioiTinh);
        
        daoNhanVien.themNhanVien(nv);
        
        modelNhanVien = (DefaultTableModel) tbl_NhanVien.getModel();
        Object[] object = new Object[7];
            object[0] = nv.getMaNV();
            object[1] = nv.getHoTen();
            object[2] = nv.getGioiTinh();
            object[3] = nv.getChuVu();
            object[4] = nv.getDiaChi();
            object[5] = nv.getSdt();
            object[6] = nv.getEmail();
        modelNhanVien.addRow(object);
        xoaTrangTxt();
        JOptionPane.showMessageDialog(this, "Thêm thành công");
    }
    
    /**
     * Xử lý xóa nhân viên 
     */
    public void xuLyXoaNhanVien() {
         int row = tbl_NhanVien.getSelectedRow();
         if(row!=-1) {
             if(JOptionPane.showConfirmDialog(this, "Bạn có chắc là xóa dòng này không?", "Cảnh Báo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                 String maNhanVien = txt_MaNV.getText();
                 daoNhanVien.xoaNhanVien(maNhanVien);
                 modelNhanVien.removeRow(row);
                 JOptionPane.showMessageDialog(this, "Xóa thành công");
                 xoaTrangTxt();
             }
         } else {
             JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng cần xóa!");
         }
         
    }
    
    /**
     * Xử lý cập nhật nhân viên
     */ 
    public void xuLyCapNhatNhanVien() {
        if(!rangBuocDuLieuNhap()) {
            return;
        }
        
        String maNV = txt_MaNV.getText();
        String tenNV = txt_TenNV.getText();
        String chucVu = txt_ChucVu.getText();
        String diaChi = txt_DiaChi.getText();
        String sdt = txt_SoDienThoai.getText();
        String email = txt_Email.getText();
        String gioiTinh= "";
        if(rad_Nam.isSelected()) {
            gioiTinh = "Nam";
        } else if(rad_Nu.isSelected()) {
            gioiTinh = "Nữ";
        }
        
        NhanVien nv = new NhanVien(maNV, tenNV, chucVu, email, sdt, diaChi, gioiTinh);
        
        int row = tbl_NhanVien.getSelectedRow();
        if(row!=-1) {
            daoNhanVien.capNhatNhanVien(nv);
            for (int i = 0; i < tbl_NhanVien.getRowCount(); i++) {
                 String maNV_Update = tbl_NhanVien.getValueAt(row, 0).toString();
                 if(maNV_Update.equalsIgnoreCase(maNV)) {
                     tbl_NhanVien.setValueAt(tenNV, row, 1);
                     tbl_NhanVien.setValueAt(gioiTinh, row, 2);
                     tbl_NhanVien.setValueAt(chucVu, row, 3);
                     tbl_NhanVien.setValueAt(diaChi, row, 4);
                     tbl_NhanVien.setValueAt(sdt, row, 5);
                     tbl_NhanVien.setValueAt(email, row, 6);
                 }                 
            }
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            xoaTrangTxt();
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng cần cập nhật!");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnl_DanhSachNhanVien = new javax.swing.JPanel();
        scr_DanhSachNhanVien = new javax.swing.JScrollPane();
        tbl_NhanVien = new javax.swing.JTable();
        pnl_ThongTin = new javax.swing.JPanel();
        txt_TenNV = new javax.swing.JTextField();
        txt_MaNV = new javax.swing.JTextField();
        lbl_MaNV = new javax.swing.JLabel();
        lbl_ChucVu = new javax.swing.JLabel();
        lbl_TenNV = new javax.swing.JLabel();
        lbl_DiaChi = new javax.swing.JLabel();
        lbl_GioiTinh = new javax.swing.JLabel();
        lbl_SoDienThoai = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        rad_Nam = new javax.swing.JRadioButton();
        rad_Nu = new javax.swing.JRadioButton();
        txt_ChucVu = new javax.swing.JTextField();
        txt_SoDienThoai = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_DiaChi = new javax.swing.JTextField();
        pnl_NutChucNang = new javax.swing.JPanel();
        btn_Them = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        btn_CapNhat = new javax.swing.JButton();
        btn_Luu = new javax.swing.JButton();

        setBackground(new java.awt.Color(199, 210, 213));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        scr_DanhSachNhanVien.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tbl_NhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên nhân viên", "Giới tính", "Chức vụ", "Địa chỉ", "Số điện thoại", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_NhanVien.setRowHeight(35);
        tbl_NhanVien.setShowGrid(true);
        tbl_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NhanVienMouseClicked(evt);
            }
        });
        scr_DanhSachNhanVien.setViewportView(tbl_NhanVien);

        javax.swing.GroupLayout pnl_DanhSachNhanVienLayout = new javax.swing.GroupLayout(pnl_DanhSachNhanVien);
        pnl_DanhSachNhanVien.setLayout(pnl_DanhSachNhanVienLayout);
        pnl_DanhSachNhanVienLayout.setHorizontalGroup(
            pnl_DanhSachNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachNhanVien)
        );
        pnl_DanhSachNhanVienLayout.setVerticalGroup(
            pnl_DanhSachNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
        );

        pnl_ThongTin.setBackground(new java.awt.Color(199, 210, 213));
        pnl_ThongTin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        txt_TenNV.setEditable(false);
        txt_TenNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_TenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TenNVActionPerformed(evt);
            }
        });

        txt_MaNV.setEditable(false);
        txt_MaNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_MaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MaNVActionPerformed(evt);
            }
        });

        lbl_MaNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_MaNV.setText("Mã nhân viên");

        lbl_ChucVu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_ChucVu.setText("Chức vụ");

        lbl_TenNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TenNV.setText("Tên nhân viên");

        lbl_DiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_DiaChi.setText("Địa chỉ");

        lbl_GioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_GioiTinh.setText("Giới tính");

        lbl_SoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_SoDienThoai.setText("Số điện thoại");

        lbl_Email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Email.setText("Email");

        rad_Nam.setBackground(new java.awt.Color(199, 210, 213));
        buttonGroup1.add(rad_Nam);
        rad_Nam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rad_Nam.setSelected(true);
        rad_Nam.setText("Nam");
        rad_Nam.setEnabled(false);

        rad_Nu.setBackground(new java.awt.Color(199, 210, 213));
        buttonGroup1.add(rad_Nu);
        rad_Nu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rad_Nu.setText("Nữ");
        rad_Nu.setEnabled(false);

        txt_ChucVu.setEditable(false);
        txt_ChucVu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_ChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ChucVuActionPerformed(evt);
            }
        });

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
                .addGap(100, 100, 100)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                .addComponent(rad_Nam)
                                .addGap(18, 18, 18)
                                .addComponent(rad_Nu))))
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_ThongTinLayout.setVerticalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rad_Nam)
                    .addComponent(rad_Nu)
                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pnl_NutChucNang.setBackground(new java.awt.Color(199, 210, 213));
        pnl_NutChucNang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        btn_Them.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
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

        btn_Xoa.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/icons8-delete-document-30.png"))); // NOI18N
        btn_Xoa.setText("Xóa");
        btn_Xoa.setBorder(null);
        btn_Xoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_XoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_XoaMouseExited(evt);
            }
        });
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        btn_CapNhat.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
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

        btn_Luu.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
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

        javax.swing.GroupLayout pnl_NutChucNangLayout = new javax.swing.GroupLayout(pnl_NutChucNang);
        pnl_NutChucNang.setLayout(pnl_NutChucNangLayout);
        pnl_NutChucNangLayout.setHorizontalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_CapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(btn_Luu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnl_NutChucNangLayout.setVerticalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_Them, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_CapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Luu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnl_DanhSachNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_ThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_NutChucNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_DanhSachNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_ThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pnl_NutChucNang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void txt_TenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TenNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TenNVActionPerformed

    private void txt_MaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MaNVActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        xuLyXoaNhanVien();
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CapNhatActionPerformed
        if(btn_CapNhat.getText().equalsIgnoreCase("Cập nhật")) {
            btn_CapNhat.setText("Hủy");
            btn_Them.setEnabled(false);
            btn_Xoa.setEnabled(false);
            btn_Luu.setEnabled(true);
            kiemTraHoaDongSua = true;
            kiemTraHoatDongTextNhap(true);
            xoaTrangTxt();
        } else if(btn_CapNhat.getText().equalsIgnoreCase("Hủy")) {
            btn_CapNhat.setText("Cập nhật");
            huyThaoTac();
        }
    }//GEN-LAST:event_btn_CapNhatActionPerformed

    private void btn_LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LuuActionPerformed
        if(kiemTraHoaDongThem) {
            xuLyThemNhanVien();
        } else if(kiemTraHoaDongSua) {
            xuLyCapNhatNhanVien();
        }
    }//GEN-LAST:event_btn_LuuActionPerformed

    private void txt_ChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ChucVuActionPerformed

    private void txt_SoDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SoDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SoDienThoaiActionPerformed

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailActionPerformed

    private void txt_DiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DiaChiActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        if(btn_Them.getText().equalsIgnoreCase("Thêm")) {
            btn_Them.setText("Hủy");
            btn_CapNhat.setEnabled(false);
            btn_Xoa.setEnabled(false);
            btn_Luu.setEnabled(true);
            kiemTraHoaDongThem = true;
            kiemTraHoatDongTextNhap(true);
            xoaTrangTxt();
        } else if(btn_Them.getText().equalsIgnoreCase("Hủy")) {
            btn_Them.setText("Thêm");
            huyThaoTac();
        }
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void tbl_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NhanVienMouseClicked
       int row = tbl_NhanVien.getSelectedRow();
        if(row != -1) {
            txt_MaNV.setText(tbl_NhanVien.getValueAt(row, 0).toString());
            txt_TenNV.setText(tbl_NhanVien.getValueAt(row, 1).toString());
            
            if(tbl_NhanVien.getValueAt(row, 2).toString().equalsIgnoreCase("Nam")) {
                rad_Nam.setSelected(true);
            } else if(tbl_NhanVien.getValueAt(row, 2).toString().equalsIgnoreCase("Nữ")) {
                rad_Nu.setSelected(true);
            }           
            txt_ChucVu.setText(tbl_NhanVien.getValueAt(row, 3).toString());
            txt_DiaChi.setText(tbl_NhanVien.getValueAt(row, 4).toString());
            txt_SoDienThoai.setText(tbl_NhanVien.getValueAt(row, 5).toString());
            txt_Email.setText(tbl_NhanVien.getValueAt(row, 6).toString());
        } 
    }//GEN-LAST:event_tbl_NhanVienMouseClicked

    private void btn_ThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemMouseEntered
       if(btn_Them.isEnabled()) {
            btn_Them.setBackground(new Color(0x9EDDFF));
            btn_Them.setForeground(new Color(0x141E46));
       }
        
    }//GEN-LAST:event_btn_ThemMouseEntered

    private void btn_ThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ThemMouseExited
        if(btn_Them.isEnabled()) {
            btn_Them.setBackground(UIManager.getColor("Menu.background"));
            btn_Them.setForeground(UIManager.getColor("Menu.foreground"));
        }
    }//GEN-LAST:event_btn_ThemMouseExited

    private void btn_XoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XoaMouseEntered
      if(btn_Xoa.isEnabled()) {
        btn_Xoa.setBackground(new Color(0x9EDDFF));
       btn_Xoa.setForeground(new Color(0x141E46));}
    }//GEN-LAST:event_btn_XoaMouseEntered

    private void btn_XoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XoaMouseExited
        if(btn_Xoa.isEnabled()) {
        btn_Xoa.setBackground(UIManager.getColor("Menu.background"));
        btn_Xoa.setForeground(UIManager.getColor("Menu.foreground"));}
    }//GEN-LAST:event_btn_XoaMouseExited

    private void btn_CapNhatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CapNhatMouseEntered
       if(btn_CapNhat.isEnabled()) {
        btn_CapNhat.setBackground(new Color(0x9EDDFF));
       btn_CapNhat.setForeground(new Color(0x141E46));}
    }//GEN-LAST:event_btn_CapNhatMouseEntered

    private void btn_CapNhatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CapNhatMouseExited
       if(btn_CapNhat.isEnabled()) {
        btn_CapNhat.setBackground(UIManager.getColor("Menu.background"));
        btn_CapNhat.setForeground(UIManager.getColor("Menu.foreground"));}
    }//GEN-LAST:event_btn_CapNhatMouseExited

    private void btn_LuuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LuuMouseEntered
        if(btn_Luu.isEnabled()) {
        btn_Luu.setBackground(new Color(0x9EDDFF));
       btn_Luu.setForeground(new Color(0x141E46));}
    }//GEN-LAST:event_btn_LuuMouseEntered

    private void btn_LuuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LuuMouseExited
        if(btn_Luu.isEnabled()) {
        btn_Luu.setBackground(UIManager.getColor("Menu.background"));
        btn_Luu.setForeground(UIManager.getColor("Menu.foreground"));}
    }//GEN-LAST:event_btn_LuuMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CapNhat;
    private javax.swing.JButton btn_Luu;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lbl_ChucVu;
    private javax.swing.JLabel lbl_DiaChi;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_GioiTinh;
    private javax.swing.JLabel lbl_MaNV;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_TenNV;
    private javax.swing.JPanel pnl_DanhSachNhanVien;
    private javax.swing.JPanel pnl_NutChucNang;
    private javax.swing.JPanel pnl_ThongTin;
    private javax.swing.JRadioButton rad_Nam;
    private javax.swing.JRadioButton rad_Nu;
    private javax.swing.JScrollPane scr_DanhSachNhanVien;
    private javax.swing.JTable tbl_NhanVien;
    private javax.swing.JTextField txt_ChucVu;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_MaNV;
    private javax.swing.JTextField txt_SoDienThoai;
    private javax.swing.JTextField txt_TenNV;
    // End of variables declaration//GEN-END:variables
}
