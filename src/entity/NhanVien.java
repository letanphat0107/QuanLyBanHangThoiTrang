package entity;

import dao.Dao_NhanVien;

public class NhanVien {

    private String maNV;
    private String hoTen;
    private String chuVu;
    private String email;
    private String sdt;
    private String diaChi;
    private String gioiTinh;
    private boolean trangThai;

    public NhanVien() {
        // TODO Auto-generated constructor stub
    }

    public String auto_ID() {
        Dao_NhanVien daoNhanVien = new Dao_NhanVien();
        String idPrefix = daoNhanVien.taoMaNhanVien();
        return idPrefix;
    }

    public NhanVien(String hoTen, String chuVu, String email, String sdt, String diaChi, String gioiTinh, boolean trangThai) {

        this.maNV = auto_ID();
        this.hoTen = hoTen;
        this.chuVu = chuVu;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
    }

    public NhanVien(String maNV, String hoTen, String chuVu, String email, String sdt, String diaChi, String gioiTinh, boolean trangThai) {

        this.maNV = maNV;
        this.hoTen = hoTen;
        this.chuVu = chuVu;
        this.email = email;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.trangThai = trangThai;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuVu() {
        return chuVu;
    }

    public void setChuVu(String chuVu) {
        this.chuVu = chuVu;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTen=" + hoTen + ", chuVu=" + chuVu + ", email=" + email + ", sdt=" + sdt + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + '}';
    }

}
