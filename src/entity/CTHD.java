package entity;

public class CTHD {
	private SanPham sanPham;
    private HoaDon hoaDon;
    private int soLuong;

    public CTHD() {
    }

    public CTHD(SanPham sanPham, HoaDon hoaDon, int soLuong) {
        this.sanPham = sanPham;
        this.hoaDon = hoaDon;
        this.soLuong = soLuong;    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
 
}
