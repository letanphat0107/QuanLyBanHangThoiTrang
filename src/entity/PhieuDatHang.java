package entity;

import dao.Dao_PhieuDatHang;
import java.util.Date;

public class PhieuDatHang {
	private String maPhieuDat;
	private KhachHang khachHang;
	private NhanVien nhanVien;
	private Date ngayLap;
	
	public PhieuDatHang() {
		// TODO Auto-generated constructor stub
	}
        
        public String auto_ID() {
            Dao_PhieuDatHang daoPhieuDatHang = new Dao_PhieuDatHang();
            String idPrefix = daoPhieuDatHang.taoMaPhieuDatHang();
            return idPrefix;
        }
        
        public PhieuDatHang( KhachHang khachHang, NhanVien nhanVien, Date ngayLap) {
		
		this.maPhieuDat = auto_ID();
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.ngayLap = ngayLap;
	}

	public PhieuDatHang(String maPhieuDat, KhachHang khachHang, NhanVien nhanVien, Date ngayLap) {
		this.maPhieuDat = maPhieuDat;
		this.khachHang = khachHang;
		this.nhanVien = nhanVien;
		this.ngayLap = ngayLap;
	}

	public String getMaPhieuDat() {
		return maPhieuDat;
	}

	public void setMaPhieuDat(String maPhieuDat) {
		this.maPhieuDat = maPhieuDat;
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

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	
	
}
