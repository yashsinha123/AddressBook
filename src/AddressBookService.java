import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBookService {
    public String display(Person p) {
        //System.out.println(" You entered these values");
        return p.getFirstname() + " " + p.getLastname() + " " + p.getEmail() + " " + p.getCity() + " " + p.getState() + " " + p.getZip() + " " + p.getPhno() + "\n";
    }

    public void setValues(Person p, AddressBook address) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fn = sc.next();
        if (!checkname(fn, address)){
            throw new RuntimeException("CHALA JA YAHA SE NAYA NAM LEKE AA, APNA KHUDKA NAM BANA "+ fn);
        }

        p.setFirstname(fn);

        System.out.println("Enter your last name: ");
        String ln = sc.next();
        p.setLastname(ln);
        System.out.println("Enter your city name");
        String city = sc.next();
        p.setCity(city);
        System.out.println("enter state");
        String state = sc.next();
        p.setState(state);
        System.out.println("enter email");
        String email = sc.next();
        p.setEmail(email);
        System.out.println("Enter your zip code: ");
        Integer zip = Integer.valueOf(sc.next());
        p.setZip(zip);
        Pattern phonepattern = Pattern.compile("^[6-9]{1}[0-9]{9}+$");
        do {

            System.out.println("Enter your phone number: ");
            String phone = sc.next();
            Matcher matcher = phonepattern.matcher(phone);
            if (matcher.matches()) {
                p.setPhno(phone);

                break;
            } else {
                System.out.println("invalid number please put 10 digits no with range from 6-9");
            }

        } while (true);

    }

    private boolean checkname(String name, AddressBook address) {
        return address.contactList.values().stream().map((s) -> s.getFirstname() != name).count() == 0;

    }

}