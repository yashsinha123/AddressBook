public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to address book system");
        Person p1 = new Person();
        AddressBook a1 = new AddressBook();
        AddressBookService s1 =  new AddressBookService();
        System.out.println("set values: ");
        s1.setValues(p1);
        System.out.println(s1.display(p1));
        a1.contactList.put(1,p1);
        //System.out.println(a1.contactList);

    }
}