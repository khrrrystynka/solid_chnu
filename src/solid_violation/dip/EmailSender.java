package solid_violation.dip;

public class EmailSender implements EmailService {
    @Override
    public void send(Email email) {
        System.out.print("To:" + email.getTo() + ", Subject: " + email.getSubject() + ", Message: " + email.getMessage());
    }
}
