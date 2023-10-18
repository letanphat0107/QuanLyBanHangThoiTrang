package entity;

import dao.Dao_NhaCungCap;


public class NhaCungCap {
	private String maNCC;
    private String tenNCC;
    private String diaChi;
    private String sdt;
    private String email;

    private String auto_ID(){
        Dao_NhaCungCap daoNhaCungCap = new Dao_NhaCungCap();
        String idPrefix = "NCC";
        int length = daoNhaCungCap.getAllNhaCungCap().size();
        String finalId = idPrefix + String.format("%03d", length + 1);
        return finalId;
    }
    
    public NhaCungCap(String tenNhaCungCap, String diaChi, String sdt, String email) {
        this.maNCC = auto_ID();
        this.tenNCC = tenNhaCungCap;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
    } 
        
    public NhaCungCap() {
    }
  
    public NhaCungCap(String maNCC, String tenNCC, String diaChi, String sdt, String email) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.email = email;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
