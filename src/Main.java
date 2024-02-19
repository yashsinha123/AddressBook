import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        HashMap<String, AddressBook> addressbookss = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        AddressBookService s1 = new AddressBookService();
        AddressBook a1 = new AddressBook();

        System.out.println("welcome to address book system");
        //int action1 = sc.nextInt();
        while(true){
            System.out.println("Choose an action on adddressbooks:");
            System.out.println("1. Add addressbook");
            System.out.println("2. display addressbook");
            System.out.println("3.Save AddressBook");
            System.out.println("4. search person in different cities by city name Addressbooks");

            String action1 = sc.next();
            sc.nextLine();
            switch(action1){
                case "1":
                    System.out.println("write the name of the addressbook: ");

                    String thisBook = sc.next();

                    addressbookss.put(thisBook, new AddressBook());
                    while(true) {

                        System.out.println("Choose an action:");
                        System.out.println("1. Add person");
                        System.out.println("2. Edit person");
                        System.out.println("3. Delete person");
                        System.out.println("4. Display address book");
                        System.out.println("5.getting out of the address book");
                        int action = sc.nextInt();

                        sc.nextLine();

                        //action = sc.nextInt();
                        //sc.nextLine();
                        switch (action) {
                            case 1:
                                addressbookss.get(thisBook).addperson(s1);

                                break;
                            case 2:

                                //Scanner sc = new Scanner(System.in);
                                addressbookss.get(thisBook).editpersonusingfirstname(s1, sc);
                                break;

                            case 3:
                                //Scanner sc = new Scanner(System.in);
                                addressbookss.get(thisBook).delete(sc);
                                break;
                            case 4:
                                System.out.println("Address Book:");
                                for (Person person : addressbookss.get(thisBook).contactList.values()) {
                                    System.out.println(s1.display(person));
                                }
                                break;
                            case 5:
                                break;

                        }
                        if(action == 5){

                            break;
                        }


                    }
                    break;
                case "2":
                    System.out.println("number of address books and its data is:");
                    System.out.println("Printing elements using a for loop:");
                    for (String key : addressbookss.keySet()) {
                        System.out.println("name of the book is:" + "\n" + key);
                        System.out.println(addressbookss.get(key));
                    }


                    break;
                case "3":

                    a1.writeHashMapToFile(addressbookss,"save1.txt");
                case "4":
                    System.out.println("please enter the name of the city you want to find people of");
                    String cityname = sc.nextLine();
                    checkCity(cityname,addressbookss,a1);

            }

        }
    }


    private static void checkCity(String cityName, HashMap<String, AddressBook> addressBooks, AddressBook currentAddressBook) {
        List matchingContacts = addressBooks.values().stream()
                .flatMap(AddressBook -> AddressBook.contactList.values().stream())
                .filter((s)-> s.getCity().equalsIgnoreCase(cityName))

                .collect(Collectors.toList());

        System.out.println(matchingContacts);
    }

}