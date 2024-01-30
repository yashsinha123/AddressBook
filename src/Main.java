import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to address book system");

        //Person p1 = new Person();
        AddressBook a1 = new AddressBook();
        AddressBookService s1 = new AddressBookService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Add person");
            System.out.println("2. Edit person");
            System.out.println("3. Delete person");
            System.out.println("4. Display address book");
            System.out.println("5. Exit");
            int action = sc.nextInt();
            sc.nextLine();
            switch (action) {
                case 1:
                    a1.addperson(s1);

                    break;
                case 2:
                    //Scanner sc = new Scanner(System.in);
                    System.out.println("to edit type 'edit':");
                    String userinput = sc.next();
                    if ("edit".equalsIgnoreCase(userinput)) {
                        System.out.println("please enter the first name of the user to edit");
                        String fristnametoedit = sc.next();
                        Iterator<Map.Entry<Integer, Person>> iterator = a1.contactList.entrySet().iterator();
                        boolean found = false;
                        while (iterator.hasNext()) {
                            Map.Entry<Integer, Person> entery = iterator.next();
                            Person currentperson = entery.getValue();
                            if (currentperson.getFirstname().equalsIgnoreCase(fristnametoedit)) {
                                s1.setValues(currentperson);
                                System.out.println("updated details:");
                                System.out.println(s1.display(currentperson));
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("person not found");
                        }

                    }
                    break;
                case 3:
                    //Scanner sc = new Scanner(System.in);
                    System.out.println("to delete type 'delete'");
                    String userinput1 = sc.next();
                    if ("delete".equalsIgnoreCase(userinput1)) {
                        System.out.println("please enter thr first name of the user u want to delete");
                        String fristnametodelete = sc.next();
                        Iterator<Map.Entry<Integer, Person>> iterator = a1.contactList.entrySet().iterator();
                        while (iterator.hasNext()) {
                            Map.Entry<Integer, Person> entry = iterator.next();
                            Person currentperson = entry.getValue();
                            if (currentperson.getFirstname().equalsIgnoreCase(fristnametodelete)) {
                                iterator.remove();
                                System.out.println("entry of the person is deleted");
                                break;
                            }
                        }

                    } else {
                        System.out.println("inavlid, please type 'edit or 'delete'");
                    }
                    break;
                case 4:
                    System.out.println("Address Book:");
                    for (Person person : a1.contactList.values()) {
                        System.out.println(s1.display(person));
                    }
                    break;

            }


            //System.out.println("set values: ");
            //s1.setValues(p1);
            //System.out.println(s1.display(person));
            //a1.contactList.put(1,p1);
            //System.out.println(a1.contactList);
            // Display the address book after adding the first person
            //System.out.println("Address Book after adding the first person:");
        /*for (Person person : a1.contactList.values()) {
            System.out.println(s1.display(person));
        }

        // Add a second person to the address book
        a1.addperson(s1);

        // Display the address book after adding the second person
        System.out.println("Address Book after adding the second person:");
        for (Person person : a1.contactList.values()) {
            System.out.println(s1.display(person));
        }
        System.out.println("these are the enter u made now press enter to update it");
        System.out.println("if u want to edit type 'edit'");
        System.out.println("if u want to delete type 'delete' ");
        System.out.println("want to see the updated address book type 'up'");
        Scanner sc = new Scanner(System.in);
        String userinput = sc.next();
        //Person p2 = new Person();
        //String value = p2.getFirstname();

       /* if(fnedit.equals(p1.getFirstname())) {

            s1.setValues(p1);
            a1.contactList.put(1, p1);
            System.out.println(s1.display(p1));
        }

        else if{
            System.out.println("please enter first name correctly");
        }


        if("edit".equalsIgnoreCase(userinput)){
            System.out.println("please enter the first name of the user to edit");
            String fristnametoedit = sc.next();
            Iterator<Map .Entry<Integer,Person>> iterator = a1.contactList.entrySet().iterator();
            boolean found = false;
            while(iterator.hasNext()){
                Map.Entry<Integer,Person> entery = iterator.next();
                Person currentperson = entery.getValue();
                if(currentperson.getFirstname().equalsIgnoreCase(fristnametoedit)){
                    s1.setValues(currentperson);
                    System.out.println("updated details:");
                    System.out.println(s1.display(currentperson));
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("person not found");
            }

        }
        else if ("delete".equalsIgnoreCase(userinput)){
            System.out.println("please enter thr first name of the user u want to delete");
            String fristnametodelete = sc.next();
            Iterator<Map.Entry<Integer, Person>> iterator = a1.contactList.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<Integer,Person> entry = iterator.next();
                Person currentperson = entry.getValue();
                if(currentperson.getFirstname().equalsIgnoreCase(fristnametodelete)){
                    iterator.remove();
                    System.out.println("entry of the person is deleted");
                    break;
                }
            }

        }else{
            System.out.println("inavlid, please type 'edit or 'delete'");
        }
        System.out.println("Address Book:");

        for (Person person : a1.contactList.values()) {
            System.out.println(s1.display(person));
        }*/
            //System.out.println("updsted contatc list" + a1.contactList);

        }
    }
}