import java.util.Iterator;
import java.util.Map;
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
        System.out.println("if u want to edit type 'edit'");
        System.out.println("if u want to delete type 'delete' ");
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

        */
        if("edit".equalsIgnoreCase(userinput)){
            System.out.println("please enter the first name of the user to edit");
            String fristnametoedit = sc.next();
            Iterator<Map .Entry<Integer,Person>> iterator = a1.contactList.entrySet().iterator();
            boolean found = false;
            while(iterator.hasNext()){
                Map.Entry<Integer,Person> entry = iterator.next();
                Person currentperson = entry.getValue();
                if(currentperson.getFirstname().equalsIgnoreCase(fristnametoedit)){
                    s1.setValues(currentperson);
                    System.out.println("update details:");
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
        System.out.println("updsted contatc list" + a1.contactList);

    }
}