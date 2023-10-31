package entity;

import dao.Dao_PhanLoai;

public class PhanLoai {

    private String maPhanLoai;
    private String loaiSanPham;

    private String auto_ID(){
        Dao_PhanLoai daoPhanLoai = new Dao_PhanLoai();
        String idPrefix = daoPhanLoai.taoMaPhanLoai();
        return idPrefix;
    }
    
    public PhanLoai() {
    }

    public PhanLoai(String loaiSanPham) {
        this.maPhanLoai = auto_ID();
        this.loaiSanPham = loaiSanPham;
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
