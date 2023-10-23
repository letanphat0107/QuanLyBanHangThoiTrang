package entity;


public class KichThuoc {
	 private String maKichThuoc;
	   private String kichThuoc;

	    public KichThuoc() {
	    }
            public KichThuoc(String maKichThuoc) {
                this.maKichThuoc = maKichThuoc;

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
