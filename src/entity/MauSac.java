package entity;

import dao.Dao_MauSac;

public class MauSac {

    private String maMauSac;
    private String mauSac;

    private String auto_ID() {
        Dao_MauSac daoMauSac = new Dao_MauSac();
        String idPrefix = "MS";
        int length = daoMauSac.getAllMauSac().size();
        String finalId = idPrefix + String.format("%04d", length + 1);
        return finalId;
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
