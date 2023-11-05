package entity;

import dao.Dao_MauSac;

public class MauSac {

    private String maMauSac;
    private String mauSac;

    private String auto_ID() {
        Dao_MauSac daoMauSac = new Dao_MauSac();
        String idPrefix = daoMauSac.taoMaMauSac();
        return idPrefix;
    }

    public MauSac(String mauSac) {
        this.maMauSac = auto_ID();
        this.mauSac = mauSac;

    }

    public MauSac() {
    }

    public MauSac(String maMauSac, String mauSac) {
        this.maMauSac = maMauSac;
        this.mauSac = mauSac;
    }

    public String getMaMauSac() {
        return maMauSac;
    }

    public void setMaMauSac(String maMauSac) {
        this.maMauSac = maMauSac;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
}
