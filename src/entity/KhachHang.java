package entity;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private String email;
	private String sdt;
	private String gioiTinh;
	
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	
	public KhachHang(String maKH, String hoTen, String email, String sdt, String gioiTinh) {
		
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.email = email;
		this.sdt = sdt;
		this.gioiTinh = gioiTinh;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
	
	
}
