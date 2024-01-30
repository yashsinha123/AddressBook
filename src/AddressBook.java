import java.util.HashMap;

public class AddressBook {
    HashMap<Integer,Person> contactList = new HashMap<>();
    public void addperson(AddressBookService addressBookService){
        Person newperson = new Person();
        addressBookService.setValues(newperson);
        int countid = contactList.size() + 1;
        contactList.put(countid, newperson);
        System.out.println("contact added with contactid: " + countid);
    }

}