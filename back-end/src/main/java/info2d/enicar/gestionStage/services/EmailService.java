//package info2d.enicar.gestionStage.services;
//
//import jakarta.mail.MessagingException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import jakarta.mail.internet.MimeMessage;
//import org.springframework.stereotype.Service;
//
//import java.io.UnsupportedEncodingException;
//
//@Service
//public class EmailService {
//    private final JavaMailSender mailSender;
//
//    public EmailService(JavaMailSender mailSender) {
//        this.mailSender = mailSender;
//    }
//
//    public void sendNewConnectionDetectedEmail(String email) throws UnsupportedEncodingException, MessagingException {
//        String fromAddress = "no-reply@stagehub.com";
//        String senderName = "StageHub";
//        String subject = "A new connection to your account has been detected";
//        String content = "We've detected a new connection to your account";
//
//        MimeMessage message = mailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message);
//
//        helper.setFrom(fromAddress, senderName);
//        helper.setTo(email);
//        helper.setSubject(subject);
//
//        helper.setText(content, true);
//
//        mailSender.send(message);
//    }
//
//
//}
