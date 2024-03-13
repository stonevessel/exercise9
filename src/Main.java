public class Main {
    public static void main(String[] args) {
        ContactsEmail mike = new ContactsEmail("mike","mike45132@email.com");
        ContactsPhoneNumber mike2 = new ContactsPhoneNumber("mikes","614-284-4433");
        mike2.contactInfo();
        mike.contactInfo();

    }
}