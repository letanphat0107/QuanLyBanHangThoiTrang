/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author phant
 */
public class Dao_SendMail {
    static final String fromEmail = "phansinh0606@gmail.com";
    static final String password = "elihvpvqateibfbe";
    
    public void sendEmail(String toEmail, String tieuDe, String noiDung) {
        //Khai báo các thuộc tính
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587"); //tls 587 ssl 465
        props.put("mail.smtp.auth", "true"); //Đăng nhập thành công
        props.put("mail.smtp.starttls.enable", "true"); //khơi tạo giao thức
        
        //Tạo Authenticator: lấy ra phiên làm việc để gửi mail
        Authenticator auth = new Authenticator() {
            //Nhập mật khẩu và tài khoản -> để đăng nhập vào gmail
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }

        };
        
        //Phiên làm việc
        Session session = Session.getInstance(props, auth);
        
        //Tạo tin nhắn gửi
        MimeMessage msg = new MimeMessage(session);
        try {
            msg.addHeader("Conten-type", "text;charset=UTF-8"); // Kiểu nội dung
            
            //Người gửi
            msg.setFrom(fromEmail);
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));//gửi đến người nhận
            
            //Tiêu đề mail
            msg.setSubject(tieuDe);
            
            //Quy định ngày gửi
            msg.setSentDate(new Date());
            
            //Nội dung gửi
            msg.setText(noiDung,"UTF-8");
            
            //Gui mail
            Transport.send(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            
}
