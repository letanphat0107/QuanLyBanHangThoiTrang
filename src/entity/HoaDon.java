package entity;

import dao.Dao_HoaDon;
import java.util.Calendar;
import java.util.Date;

public class HoaDon {
	private String maHoaDon;
	private KhachHang khachHang;
	private NhanVien nhanVien;
	private Date ngayNhap;
	
	public HoaDon() {
		// TODO Auto-generated constructor stub
	}

        public String auto_ID() {
            Dao_HoaDon daoHoaDon = new Dao_HoaDon();
            String idPrefix = daoHoaDon.taoMaHoaDon();
            return idPrefix;
        }
        
        public HoaDon( KhachHang khachHang, NhanVien nhanVien, Date ngayNhap) {
		
		this.maHoaDon = auto_ID();
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.ngayNhap = ngayNhap;
	}
        
	public HoaDon(String maHoaDon, KhachHang khachHang, NhanVien nhanVien, Date ngayNhap) {
		
		this.maHoaDon = maHoaDon;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.ngayNhap = ngayNhap;
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public Date getNgayNhap() {
		return ngayNhap;
	}

	public void setNgayNhap(Date ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	
	
}
