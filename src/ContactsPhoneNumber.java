public class ContactsPhoneNumber extends Contacts{
    private String phoneNumber;

    public ContactsPhoneNumber(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactsPhoneNumber{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public void contactInfo() {
        System.out.println("Calling "+phoneNumber);
    }
}
