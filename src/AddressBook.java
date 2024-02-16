import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {
    HashMap<Integer,Person> contactList = new HashMap<>();

    public void addperson(AddressBookService addressBookService){
        Person newperson = new Person();
        try{
            addressBookService.setValues(newperson,this);
            int countid = contactList.size() + 1;
            contactList.put(countid, newperson);
            System.out.println("contact added with contactid: " + countid);

        }
        catch (RuntimeException e){
            e.getMessage();
            e.printStackTrace();
        }

    }
    public void editpersonusingfirstname(AddressBookService addressBookService, Scanner sc){
        System.out.println("to edit type 'edit':");
        String userinput = sc.next();
        if ("edit".equalsIgnoreCase(userinput)) {
            System.out.println("please enter the first name of the user to edit");
            String fristnametoedit = sc.next();
            Iterator<Map.Entry<Integer, Person>> iterator = contactList.entrySet().iterator();
            boolean found = false;
            while (iterator.hasNext()) {
                Map.Entry<Integer, Person> entery = iterator.next();
                Person currentperson = entery.getValue();
                if (currentperson.getFirstname().equalsIgnoreCase(fristnametoedit)) {
                    addressBookService.setValues(currentperson,this);
                    System.out.println("updated details:");
                    System.out.println(addressBookService.display(currentperson));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("person not found");
            }

        }


    }
    public void delete( Scanner sc){
        System.out.println("to delete type 'delete'");
        String userinput1 = sc.next();
        if ("delete".equalsIgnoreCase(userinput1)) {
            System.out.println("please enter thr first name of the user u want to delete");
            String fristnametodelete = sc.next();
            Iterator<Map.Entry<Integer, Person>> iterator = contactList.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, Person> entrygfc = iterator.next();
                Person currentperson = entrygfc.getValue();
                if (currentperson.getFirstname().equalsIgnoreCase(fristnametodelete)) {
                    iterator.remove();
                    System.out.println("entry of the person is deleted");
                    break;
                }
            }

        } else {
            System.out.println("inavlid, please type 'edit or 'delete'");
        }

    }
    public  void writeHashMapToFile(HashMap<String, AddressBook> inputMap, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<String, AddressBook> entry : inputMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine(); // Add a new line for each entry
            }
            System.out.println("HashMap has been written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String toString() {
        return "AddressBook:" + "\n" +
                "contactList=" + contactList + "\n"+
                '.';
    }
}