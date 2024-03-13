public class ContactsEmail extends Contacts{
    private String email;

    public ContactsEmail(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactsEmail{" +
                "email='" + email + '\'' +
                '}';
    }

    @Override
    public void contactInfo() {
        System.out.println("Emailing "+email);
    }
}
