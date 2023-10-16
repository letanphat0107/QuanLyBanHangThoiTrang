package entity;


public class PhanLoai {
	private String maPhanLoai;
    private String loaiSanPham;

    public PhanLoai() {
    }
     
    public PhanLoai(String maPhanLoai, String loaiSanPham) {
        this.maPhanLoai = maPhanLoai;
        this.loaiSanPham = loaiSanPham;
    }

    public String getMaPhanLoai() {
        return maPhanLoai;
    }

    public void setMaPhanLoai(String maPhanLoai) {
        this.maPhanLoai = maPhanLoai;
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }
}
