package entity;

public class CTPhieuDatHang {
	private PhieuDatHang phieuDatHang;
	private SanPham sanPham;
	private int soLuong;
	
	public CTPhieuDatHang() {
		// TODO Auto-generated constructor stub
	}

	public CTPhieuDatHang(SanPham sanPham, PhieuDatHang phieuDatHang, int soLuong) {
		this.phieuDatHang = phieuDatHang;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
	}

	public PhieuDatHang getPhieuDatHang() {
		return phieuDatHang;
	}

	public void setPhieuDatHang(PhieuDatHang phieuDatHang) {
		this.phieuDatHang = phieuDatHang;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
}	
