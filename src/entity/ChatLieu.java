package entity;


public class ChatLieu {
	private String maChatLieu;
    private String chatLieu;

    public ChatLieu() {
    }
     
    public ChatLieu(String maChatLieu, String chatLieu) {
        this.maChatLieu = maChatLieu;
        this.chatLieu = chatLieu;
    }

    
    public String getMaChatLieu() {
        return maChatLieu;
    }

    public void setMaChatLieu(String maChatLieu) {
        this.maChatLieu = maChatLieu;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }
}
