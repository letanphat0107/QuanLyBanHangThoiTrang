package entity;


public class MauSac {
	private String maMauSac;
    private String mauSac;

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
