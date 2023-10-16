package entity;

public class TaiKhoan {
	private String tenTaiKhoan;
	private String matKhau;
	private String phanQuyen;
	private NhanVien nhanVien;
	
	public TaiKhoan() {
		// TODO Auto-generated constructor stub
	}

	public TaiKhoan(String tenTaiKhoan, String matKhau, String phanQuyen, NhanVien nhanVien) {
		this.tenTaiKhoan = tenTaiKhoan;
		this.matKhau = matKhau;
		this.phanQuyen = phanQuyen;
		this.nhanVien = nhanVien;
	}

	public String getTenTaiKhoan() {
		return tenTaiKhoan;
	}

	public void setTenTaiKhoan(String tenTaiKhoan) {
		this.tenTaiKhoan = tenTaiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getPhanQuyen() {
		return phanQuyen;
	}

	public void setPhanQuyen(String phanQuyen) {
		this.phanQuyen = phanQuyen;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	
	
}
