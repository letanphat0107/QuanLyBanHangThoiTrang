package entity;

import dao.Dao_KichThuoc;

public class KichThuoc {

    private String maKichThuoc;
    private String kichThuoc;

    private String auto_ID() {
        Dao_KichThuoc daoKichThuoc = new Dao_KichThuoc();
        String idPrefix = daoKichThuoc.taoMaKichThuoc();
        return idPrefix;
                
    }

    public KichThuoc(String kichThuoc) {
        this.maKichThuoc = auto_ID();
        this.kichThuoc = kichThuoc;

    }

    public KichThuoc() {
    }

    public KichThuoc(String maKichThuoc, String kichThuoc) {
        this.maKichThuoc = maKichThuoc;
        this.kichThuoc = kichThuoc;
    }

    public String getMaKichThuoc() {
        return maKichThuoc;
    }

    public void setMaKichThuoc(String maKichThuoc) {
        this.maKichThuoc = maKichThuoc;
    }

    public String getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }
}
