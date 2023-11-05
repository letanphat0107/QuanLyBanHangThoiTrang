/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package qlbhtt;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import connectDB.Connect;
import dao.Dao_CTHD;
import dao.Dao_HoaDon;
import dao.Dao_KhachHang;
import entity.KhachHang;
import entity.NhanVien;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DMX
 */
public class ManHinh_NV_ThongKeThongTinKhachHang extends javax.swing.JPanel {

    private Connect connect = new Connect();
    private Dao_CTHD dao_CTHD = new Dao_CTHD();
    private Dao_KhachHang dao_KhachHang = new Dao_KhachHang();
    private Dao_HoaDon dao_HoaDon = new Dao_HoaDon();
    private DefaultTableModel dtm;
    private KhachHang kh = new KhachHang();

    private boolean activeTatCa = false;
    private boolean activeTop5KhachHang = false;   

    private final NhanVien nhanVien = Login.nhanVien;

    /**
     * Creates new form quanly
     */
    public ManHinh_NV_ThongKeThongTinKhachHang() throws SQLException {
        connect.connect();
        initComponents();

        dtm = (DefaultTableModel) tbl_ThongKe.getModel();

        tbl_ThongKe.setDefaultEditor(Object.class, null); //Không cho chỉnh sửa cột
        tbl_ThongKe.getTableHeader().setReorderingAllowed(false); //Không cho di chuyển cột
        
        tblThongKeKhachHang();
        activeTatCa = true;
    }

    /**
     * Load dữ liệu lên bảng
     */
    private void tblThongKeKhachHang() {
        dtm.setRowCount(0);
        ArrayList<KhachHang> listKH = dao_HoaDon.thongKeThongTinKhachHangDaMuaHang();
        int soLuongKH = listKH.size();
        for (KhachHang dskh : listKH) {
            int tongSL = dao_HoaDon.getSoLuongKhachHangMua(dskh.getMaKH());
            double tongTien = dao_HoaDon.getThanhTienKhachHangMua(dskh.getMaKH());
            int tongHD = dao_HoaDon.getSoLuongHoaDonKhachHangMua(dskh.getMaKH());
            Object[] rowdata = {dskh.getMaKH(), dskh.getHoTen(), dskh.getSdt(), tongSL, tongHD,NumberFormat.getInstance().format(tongTien)};
            dtm.addRow(rowdata);
        }
        txt_TongSanPhamBan.setText(soLuongKH + "");
    }

    /**
     * Thống kê top 5 khách hàng mua nhiều
     */
    private void tblThongKeTop5KhachHang() {
        dtm.setRowCount(0);
        ArrayList<KhachHang> listKH = dao_HoaDon.thongKeThongTinTop5KhachHangDaMuaHang();
        int soLuongKH = listKH.size();
        for (KhachHang dskh : listKH) {
            int tongSL = dao_HoaDon.getSoLuongKhachHangMua(dskh.getMaKH());
            double tongTien = dao_HoaDon.getThanhTienKhachHangMua(dskh.getMaKH());
            int tongHD = dao_HoaDon.getSoLuongHoaDonKhachHangMua(dskh.getMaKH());
            Object[] rowdata = {dskh.getMaKH(), dskh.getHoTen(), dskh.getSdt(), tongSL, tongHD ,NumberFormat.getInstance().format(tongTien)};
            dtm.addRow(rowdata);
        }
        txt_TongSanPhamBan.setText(soLuongKH + "");
    }

    private void lamMoi() {
        txt_MaKH.setText("");
        txt_TenKH.setText("");
        txt_SoLuongSPMua.setText("");
        txt_SoDienThoai.setText("");
        txt_ThanhTien.setText("");
    }

    /**
     * Lấy giá trị trên bảng add vào ArrayList
     */
    public ArrayList<KhachHang> getGiaTriTrongBang() throws ParseException {
        ArrayList<KhachHang> listKH = new ArrayList<>();
        for (int i = 0; i < tbl_ThongKe.getRowCount(); i++) {
            String maKH = tbl_ThongKe.getValueAt(i, 0).toString();
            String tenKH = tbl_ThongKe.getValueAt(i, 1).toString();
            String sdt = tbl_ThongKe.getValueAt(i, 2).toString();

            KhachHang khachHang = new KhachHang(maKH, tenKH, "", sdt, "");
            listKH.add(khachHang);
        }
        return listKH;
    }

    /**
     * Xuất bảng PDF báo cáo thông kê
     *
     * @param listSP
     */
    public void xuatBaoCaoThongKe(ArrayList<KhachHang> listKH) {
        try {

            Font fontMain = FontFactory.getFont("/Font/vuArial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

            Font fontTD = FontFactory.getFont("/Font/vuArial.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            fontTD.setSize(22);
            fontTD.setFamily(Font.BOLD + "");

            // Tạo một đối tượng Random
            Random random = new Random();

            // Sinh dãy số tự nhiên ngẫu nhiên gồm 3 ký tự (bao gồm chữ cái và số từ 0 đến 9)
            StringBuilder randomNumber = new StringBuilder(3);
            for (int i = 0; i < 3; i++) {
                char randomChar;
                if (random.nextBoolean()) {
                    // Sinh ra một chữ cái ngẫu nhiên
                    randomChar = (char) (random.nextInt(26) + 'A');
                } else {
                    // Sinh ra một số ngẫu nhiên từ 0 đến 9
                    randomChar = (char) (random.nextInt(10) + '0');
                }
                randomNumber.append(randomChar);
            }
            String pathFull = null;

            if (activeTatCa) {
                pathFull = "data/BaoCaoTKKH/" + "BaoCaoKhachHang" + randomNumber + ".pdf";
            } else if (activeTop5KhachHang) {
                pathFull = "data/BaoCaoTKKH/" + "Top5KhachHang" + randomNumber + ".pdf";
            }
            Document document = new Document(PageSize.A4.rotate()); //Add page khổ ngang
            PdfWriter.getInstance(document, new FileOutputStream(pathFull)); //Tạo ra đối tượng ghi dữ liệu vào tài liệu PDF
            document.open();

            //Tiêu đề 
            Paragraph paragraph = null;
            if (activeTatCa) {
                paragraph = new Paragraph("Thống Kê Khách Hàng", fontTD);
            } else if (activeTop5KhachHang) {
                paragraph = new Paragraph("Top 5 Khách Hàng Tiềm Năng", fontTD);
            }
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));

            //Tạo Mục
            PdfPTable tableMuc = new PdfPTable(2);
            tableMuc.setWidthPercentage(100); //Đặt chiều rộng ứng với 100% trang
            tableMuc.setSpacingBefore(10f); //Đặt khoảng cách là 10
            tableMuc.setSpacingAfter(10f);

            float[] chieuRongCot = {1f, 1f};
            tableMuc.setWidths(chieuRongCot);

            //Mục mã nhân viên
            PdfPCell cellMaNV = new PdfPCell(new Paragraph("Mã nhân viên: " + nhanVien.getMaNV(), fontMain));
            cellMaNV.setBorderColor(BaseColor.WHITE);
            tableMuc.addCell(cellMaNV);

            //Mục ngày in
            Date ngayIn = new Date();
            SimpleDateFormat fomatter = new SimpleDateFormat("dd-MM-yyyy");
            String ngayInformat = fomatter.format(ngayIn);
            PdfPCell cellNgayIn = new PdfPCell(new Paragraph("Ngày in: " + ngayInformat, fontMain));
            cellNgayIn.setBorderColor(BaseColor.WHITE);
            tableMuc.addCell(cellNgayIn);

            //Mục ngày in
            PdfPCell cellTenNV = new PdfPCell(new Paragraph("Tên Nhân viên: " + nhanVien.getHoTen(), fontMain));
            cellTenNV.setBorderColor(BaseColor.WHITE);
            tableMuc.addCell(cellTenNV);

            //Mục chức vụ
            PdfPCell cellChucVu = new PdfPCell(new Paragraph("Chức vụ: " + nhanVien.getChuVu(), fontMain));
            cellChucVu.setBorderColor(BaseColor.WHITE);
            tableMuc.addCell(cellChucVu);

            //Mục tổng khách hàng
            PdfPTable tableTongKH = new PdfPTable(1);
            tableTongKH.setWidthPercentage(100); //Đặt chiều rộng ứng với 100% trang
            tableTongKH.setSpacingBefore(10f); //Đặt khoảng cách là 10
            tableTongKH.setSpacingAfter(10f);

            float[] chieuRongCotTongKH = {1f};
            tableTongKH.setWidths(chieuRongCotTongKH);

            PdfPCell cellTongKH = new PdfPCell(new Paragraph("Tổng Khách hàng đã mua: " + txt_TongSanPhamBan.getText(), fontMain));
            cellTongKH.setBorderColor(BaseColor.WHITE);
            tableTongKH.addCell(cellTongKH);

            document.add(tableMuc);
            document.add(tableTongKH);

            //Tạo bảng sản phẩm
            PdfPTable tableDsSP = new PdfPTable(6);
            tableDsSP.setWidthPercentage(100); //Đặt chiều rộng ứng với 100% trang
            tableDsSP.setSpacingBefore(10f); //Đặt khoảng cách là 10
            tableDsSP.setSpacingAfter(10f);

            //Tiêu đề bảng
            float[] chieuRongCotSP = {1f, 1f, 1f, 1f, 1f, 1f};
            tableDsSP.setWidths(chieuRongCotSP);

            //Mã khách hàng
            PdfPCell cellTblKH_maKH = new PdfPCell(new Paragraph("Mã khách hàng ", fontMain));
            cellTblKH_maKH.setBorderColor(BaseColor.BLACK);
            cellTblKH_maKH.setVerticalAlignment(Element.ALIGN_MIDDLE);//Chỉnh text của cột theo chiều dọc
            cellTblKH_maKH.setHorizontalAlignment(Element.ALIGN_CENTER);// Chỉnh text cửa cột theo chiều ngang
            tableDsSP.addCell(cellTblKH_maKH);

            //Tên khách hàng
            PdfPCell cellTblKH_tenKH = new PdfPCell(new Paragraph("Tên khách hàng ", fontMain));
            cellTblKH_tenKH.setBorderColor(BaseColor.BLACK);
            cellTblKH_tenKH.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTblKH_tenKH.setHorizontalAlignment(Element.ALIGN_CENTER);
            tableDsSP.addCell(cellTblKH_tenKH);

            //SĐT
            PdfPCell cellTblKH_SDT = new PdfPCell(new Paragraph("SĐT ", fontMain));
            cellTblKH_SDT.setBorderColor(BaseColor.BLACK);
            cellTblKH_SDT.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTblKH_SDT.setHorizontalAlignment(Element.ALIGN_CENTER);
            tableDsSP.addCell(cellTblKH_SDT);

            //Số lượng sản phảm đã mua
            PdfPCell cellTblKH_SLM = new PdfPCell(new Paragraph("Số lượng sản phảm đã mua ", fontMain));
            cellTblKH_SLM.setBorderColor(BaseColor.BLACK);
            cellTblKH_SLM.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTblKH_SLM.setHorizontalAlignment(Element.ALIGN_CENTER);
            tableDsSP.addCell(cellTblKH_SLM);
            
            //Số lượng hóa đơn đã mua
            PdfPCell cellTblKH_SLHD = new PdfPCell(new Paragraph("Số lượng hóa đơn", fontMain));
            cellTblKH_SLHD.setBorderColor(BaseColor.BLACK);
            cellTblKH_SLHD.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTblKH_SLHD.setHorizontalAlignment(Element.ALIGN_CENTER);
            tableDsSP.addCell(cellTblKH_SLHD);

            //Thành Tiền
            PdfPCell cellTblKH_ThanhTien = new PdfPCell(new Paragraph("Thành tiền ", fontMain));
            cellTblKH_ThanhTien.setBorderColor(BaseColor.BLACK);
            cellTblKH_ThanhTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cellTblKH_ThanhTien.setHorizontalAlignment(Element.ALIGN_CENTER);
            tableDsSP.addCell(cellTblKH_ThanhTien);

            //Thong tin san pham
            for (KhachHang kh : listKH) {
                //Mã kháchhàng 
                PdfPCell cellTblKH_maKH_giaTri = new PdfPCell(new Paragraph(kh.getMaKH(), fontMain));
                cellTblKH_maKH_giaTri.setBorderColor(BaseColor.BLACK);
                cellTblKH_maKH_giaTri.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDsSP.addCell(cellTblKH_maKH_giaTri);

                //Tên kháchhàng 
                PdfPCell cellTblKH_tenKH_giaTri = new PdfPCell(new Paragraph(kh.getHoTen(), fontMain));
                cellTblKH_tenKH_giaTri.setBorderColor(BaseColor.BLACK);
                cellTblKH_tenKH_giaTri.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDsSP.addCell(cellTblKH_tenKH_giaTri);

                //SDT
                PdfPCell cellTblKH_SDT_giaTri = new PdfPCell(new Paragraph(kh.getSdt(), fontMain));
                cellTblKH_SDT_giaTri.setBorderColor(BaseColor.BLACK);
                cellTblKH_SDT_giaTri.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellTblKH_SDT_giaTri.setHorizontalAlignment(Element.ALIGN_CENTER);
                tableDsSP.addCell(cellTblKH_SDT_giaTri);

                //Số lượng kh mua
                int tongSL = dao_HoaDon.getSoLuongKhachHangMua(kh.getMaKH());

                PdfPCell cellTblKH_SLM_giaTri = new PdfPCell(new Paragraph(tongSL + "", fontMain));
                cellTblKH_SLM_giaTri.setBorderColor(BaseColor.BLACK);
                cellTblKH_SLM_giaTri.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellTblKH_SLM_giaTri.setHorizontalAlignment(Element.ALIGN_CENTER);
                tableDsSP.addCell(cellTblKH_SLM_giaTri);
                
                //Số lượng hóa đơn đã mua
                int tongHD = dao_HoaDon.getSoLuongHoaDonKhachHangMua(kh.getMaKH());
                PdfPCell cellTblKH_SLHD_giaTri = new PdfPCell(new Paragraph(tongHD+"", fontMain));
                cellTblKH_SLHD_giaTri.setBorderColor(BaseColor.BLACK);
                cellTblKH_SLHD_giaTri.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellTblKH_SLHD_giaTri.setHorizontalAlignment(Element.ALIGN_CENTER);
                tableDsSP.addCell(cellTblKH_SLHD_giaTri);

                //Thành tiền
                double tongTien = dao_HoaDon.getThanhTienKhachHangMua(kh.getMaKH());
                PdfPCell cellTblKH_thanhTien_giaTri = new PdfPCell(new Paragraph(NumberFormat.getInstance().format((long) tongTien) + "", fontMain));
                cellTblKH_thanhTien_giaTri.setBorderColor(BaseColor.BLACK);
                cellTblKH_thanhTien_giaTri.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellTblKH_thanhTien_giaTri.setHorizontalAlignment(Element.ALIGN_CENTER);
                tableDsSP.addCell(cellTblKH_thanhTien_giaTri);

            }

            document.add(tableDsSP);

            document.close();

            // mở file pdf
            try {
                File file = new File(pathFull);
                //Kiểm tra xem tệp có tồn tại hay không
                if (file.exists()) {
                    Desktop.getDesktop().open(file); //Mở file trên ứng dụng mặc định của tệp                
                } else {
                    System.out.println("File này không tồn tại!");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } catch (IOException | DocumentException e) {
            e.printStackTrace();
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

        pnl_DanhSachThongKe = new javax.swing.JPanel();
        scr_DanhSachThongKe = new javax.swing.JScrollPane();
        tbl_ThongKe = new javax.swing.JTable();
        pnl_NV_TieuDe = new javax.swing.JPanel();
        lbl_TieuDe = new javax.swing.JLabel();
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

        scr_DanhSachThongKe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách khách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tbl_ThongKe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_ThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "Họ tên", "SDT", "Số lượng sản phẩm đã mua", "Số lượn hóa đơn", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_ThongKe.setRowHeight(35);
        tbl_ThongKe.setShowGrid(true);
        tbl_ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ThongKeMouseClicked(evt);
            }
        });
        scr_DanhSachThongKe.setViewportView(tbl_ThongKe);

        lbl_TieuDe.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        lbl_TieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TieuDe.setText("THỐNG KÊ THÔNG TIN KHÁCH HÀNG");
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

        javax.swing.GroupLayout pnl_DanhSachThongKeLayout = new javax.swing.GroupLayout(pnl_DanhSachThongKe);
        pnl_DanhSachThongKe.setLayout(pnl_DanhSachThongKeLayout);
        pnl_DanhSachThongKeLayout.setHorizontalGroup(
            pnl_DanhSachThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scr_DanhSachThongKe)
            .addComponent(pnl_NV_TieuDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_DanhSachThongKeLayout.setVerticalGroup(
            pnl_DanhSachThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DanhSachThongKeLayout.createSequentialGroup()
                .addComponent(pnl_NV_TieuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scr_DanhSachThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
        );

        pnl_ThongTin.setBackground(new java.awt.Color(199, 210, 213));
        pnl_ThongTin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lbl_TenKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TenKH.setText("Tên khách hàng");

        txt_TenKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pnl_TongKHDaMua.setBackground(new java.awt.Color(255, 255, 255));
        pnl_TongKHDaMua.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lbl_TongKHDaMua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_TongKHDaMua.setText("Tổng khách hàng đã mua");

        txt_TongSanPhamBan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lbl_MaKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_MaKH.setText("Mã khách hàng");

        txt_MaKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbl_SoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_SoDienThoai.setText("SDT");

        lbl_SoLuongSPMua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_SoLuongSPMua.setText("Số lượng sản phẩm đã mua");

        txt_SoLuongSPMua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txt_ThanhTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbl_ThanhTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_ThanhTien.setText("Thành tiền");

        javax.swing.GroupLayout pnl_ThongTinLayout = new javax.swing.GroupLayout(pnl_ThongTin);
        pnl_ThongTin.setLayout(pnl_ThongTinLayout);
        pnl_ThongTinLayout.setHorizontalGroup(
            pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(pnl_TongKHDaMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_SoLuongSPMua, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_SoLuongSPMua, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_ThongTinLayout.createSequentialGroup()
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                    .addComponent(lbl_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_SoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                    .addComponent(lbl_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_ThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_ThongTinLayout.createSequentialGroup()
                                .addComponent(lbl_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_MaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(pnl_ThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                .addComponent(lbl_SoLuongSPMua, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_SoLuongSPMua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_ThongTinLayout.createSequentialGroup()
                                .addComponent(lbl_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
        );

        pnl_NutChucNang.setBackground(new java.awt.Color(199, 210, 213));

        btn_Top5KH.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_Top5KH.setText("Top 5 Khách hàng tiềm năng");
        btn_Top5KH.setBorder(null);
        btn_Top5KH.setMinimumSize(new java.awt.Dimension(107, 18));
        btn_Top5KH.setPreferredSize(new java.awt.Dimension(107, 18));
        btn_Top5KH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Top5KHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Top5KHMouseExited(evt);
            }
        });
        btn_Top5KH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Top5KHActionPerformed(evt);
            }
        });

        btn_XuatThongKe.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_XuatThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/icons8-analytics-30.png"))); // NOI18N
        btn_XuatThongKe.setText("Xuất thống kê");
        btn_XuatThongKe.setBorder(null);
        btn_XuatThongKe.setMinimumSize(new java.awt.Dimension(107, 18));
        btn_XuatThongKe.setPreferredSize(new java.awt.Dimension(107, 18));
        btn_XuatThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_XuatThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_XuatThongKeMouseExited(evt);
            }
        });
        btn_XuatThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XuatThongKeActionPerformed(evt);
            }
        });

        btn_LamMoi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btn_LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageGD/icons8-reset-30.png"))); // NOI18N
        btn_LamMoi.setText("Làm mới");
        btn_LamMoi.setBorder(null);
        btn_LamMoi.setMinimumSize(new java.awt.Dimension(107, 18));
        btn_LamMoi.setPreferredSize(new java.awt.Dimension(107, 18));
        btn_LamMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_LamMoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_LamMoiMouseExited(evt);
            }
        });
        btn_LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_NutChucNangLayout = new javax.swing.GroupLayout(pnl_NutChucNang);
        pnl_NutChucNang.setLayout(pnl_NutChucNangLayout);
        pnl_NutChucNangLayout.setHorizontalGroup(
            pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NutChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Top5KH, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_NutChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn_LamMoi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(btn_XuatThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
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

    private void txt_TongSanPhamBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TongSanPhamBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TongSanPhamBanActionPerformed

    private void btn_XuatThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XuatThongKeMouseEntered
        btn_XuatThongKe.setBackground(new Color(0x9EDDFF));
        btn_XuatThongKe.setForeground(new Color(0x141E46));
    }//GEN-LAST:event_btn_XuatThongKeMouseEntered

    private void btn_XuatThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_XuatThongKeMouseExited
        btn_XuatThongKe.setBackground(UIManager.getColor("Menu.background"));
        btn_XuatThongKe.setForeground(UIManager.getColor("Menu.foreground"));
    }//GEN-LAST:event_btn_XuatThongKeMouseExited

    private void btn_Top5KHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Top5KHMouseEntered
        btn_Top5KH.setBackground(new Color(0x9EDDFF));
        btn_Top5KH.setForeground(new Color(0x141E46));
    }//GEN-LAST:event_btn_Top5KHMouseEntered

    private void btn_Top5KHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Top5KHMouseExited
        btn_Top5KH.setBackground(UIManager.getColor("Menu.background"));
        btn_Top5KH.setForeground(UIManager.getColor("Menu.foreground"));
    }//GEN-LAST:event_btn_Top5KHMouseExited

    private void btn_LamMoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LamMoiMouseEntered
        btn_LamMoi.setBackground(new Color(0x9EDDFF));
        btn_LamMoi.setForeground(new Color(0x141E46));
    }//GEN-LAST:event_btn_LamMoiMouseEntered

    private void btn_LamMoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_LamMoiMouseExited
        btn_LamMoi.setBackground(UIManager.getColor("Menu.background"));
        btn_LamMoi.setForeground(UIManager.getColor("Menu.foreground"));
    }//GEN-LAST:event_btn_LamMoiMouseExited

    private void tbl_ThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ThongKeMouseClicked
        int row = tbl_ThongKe.getSelectedRow();
        if (row != -1) {
            txt_MaKH.setText(tbl_ThongKe.getValueAt(row, 0).toString());
            txt_TenKH.setText(tbl_ThongKe.getValueAt(row, 1).toString());
            txt_SoDienThoai.setText(tbl_ThongKe.getValueAt(row, 2).toString());
            txt_SoLuongSPMua.setText(tbl_ThongKe.getValueAt(row, 3).toString());
            txt_ThanhTien.setText(tbl_ThongKe.getValueAt(row, 4).toString());
        }
    }//GEN-LAST:event_tbl_ThongKeMouseClicked

    private void btn_Top5KHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Top5KHActionPerformed
        activeTatCa = false;
        activeTop5KhachHang = true;
        tblThongKeTop5KhachHang();
    }//GEN-LAST:event_btn_Top5KHActionPerformed

    private void btn_XuatThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XuatThongKeActionPerformed
        ArrayList<KhachHang> listKH = null;
        try {
            listKH = getGiaTriTrongBang();
        } catch (ParseException ex) {
            Logger.getLogger(ManHinh_NV_ThongKeThongTinKhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        xuatBaoCaoThongKe(listKH);
    }//GEN-LAST:event_btn_XuatThongKeActionPerformed

    private void btn_LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LamMoiActionPerformed
        activeTatCa = true;
        activeTop5KhachHang = false;
        tblThongKeKhachHang();
    }//GEN-LAST:event_btn_LamMoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_LamMoi;
    private javax.swing.JButton btn_Top5KH;
    private javax.swing.JButton btn_XuatThongKe;
    private javax.swing.JLabel lbl_MaKH;
    private javax.swing.JLabel lbl_SoDienThoai;
    private javax.swing.JLabel lbl_SoLuongSPMua;
    private javax.swing.JLabel lbl_TenKH;
    private javax.swing.JLabel lbl_ThanhTien;
    private javax.swing.JLabel lbl_TieuDe;
    private javax.swing.JLabel lbl_TongKHDaMua;
    private javax.swing.JPanel pnl_DanhSachThongKe;
    private javax.swing.JPanel pnl_NV_TieuDe;
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
