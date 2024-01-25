import java.util.Scanner;

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
        System.out.println("this is the enter u made now press enter to update it");
        System.out.println("if u want to edit type the first name in the contact list");
        Scanner sc = new Scanner(System.in);
        String fnedit = sc.next();
        //Person p2 = new Person();
        //String value = p2.getFirstname();

        if(fnedit.equals(p1.getFirstname())) {

            s1.setValues(p1);
            a1.contactList.put(1, p1);
            System.out.println(s1.display(p1));
        }

        else{
            System.out.println("please enter first name correctly");
        }

    }
}