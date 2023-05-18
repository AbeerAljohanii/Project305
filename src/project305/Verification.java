package project305;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Verification {

    private String code;

    public void verification(String Email) {

        // Send verification code email
        String host = "smtp.gmail.com";
        String port = "587";
        String senderEmail = "BookTrackingSystem@gmail.com";
        String senderPassword = "gjrxettakjkgxxgl";
        String recipientEmail = "Email";
        String subject = "Verification Code";
        code = generateVerificationCode();
        String body = "Your verification code is " + code;

        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(senderEmail, senderPassword);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(senderEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
            message.setSubject(subject);
            message.setText(body);

            Transport.send(message);

            System.out.println("Verification code email sent.");
        } catch (MessagingException e) {
            System.out.println("Error sending verification code email: " + e.getMessage());
        }
    }

    public String getCode() {
        return code;
    }

    private static String generateVerificationCode() {
        Random random = new Random();
        int code = 100000 + random.nextInt(900000);
        return String.valueOf(code);
    }

    public boolean searchEmail(String Email) { // search if an email exists or not
        return false;
    }

}
