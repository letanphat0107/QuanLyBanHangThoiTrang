package entity;

public class SanPham {
	private String maSP;
	private String tenSP;
	private int soLuong;
	private double giaNhap;
	private double giaBan;
	private String hinhAnh;
	private ChatLieu chatLieu;
	private KichThuoc kichThuoc;
	private MauSac mauSac;
	private PhanLoai phanLoai;
	private NhaCungCap nhaCungCap;

	public SanPham() {
		// TODO Auto-generated constructor stub
	}

	public SanPham(String maSP, String tenSP, int soLuong, double giaNhap, double giaBan, String hinhAnh,
			ChatLieu chatLieu, KichThuoc kichThuoc, MauSac mauSac, PhanLoai phanLoai, NhaCungCap nhaCungCap) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.soLuong = soLuong;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.hinhAnh = hinhAnh;
		this.chatLieu = chatLieu;
		this.kichThuoc = kichThuoc;
		this.mauSac = mauSac;
		this.phanLoai = phanLoai;
		this.nhaCungCap = nhaCungCap;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}

	public ChatLieu getChatLieu() {
		return chatLieu;
	}

	public void setChatLieu(ChatLieu chatLieu) {
		this.chatLieu = chatLieu;
	}

	public KichThuoc getKichThuoc() {
		return kichThuoc;
	}

	public void setKichThuoc(KichThuoc kichThuoc) {
		this.kichThuoc = kichThuoc;
	}

	public MauSac getMauSac() {
		return mauSac;
	}

	public void setMauSac(MauSac mauSac) {
		this.mauSac = mauSac;
	}

	public PhanLoai getPhanLoai() {
		return phanLoai;
	}

	public void setPhanLoai(PhanLoai phanLoai) {
		this.phanLoai = phanLoai;
	}

	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	
	
}
