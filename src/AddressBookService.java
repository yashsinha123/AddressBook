import java.util.Scanner;

public class AddressBookService {
    public String display(Person p){
        //System.out.println(" You entered these values");
        return p.getFirstname()+" "+ p.getLastname()+" "+p.getEmail()+" "+p.getCity()+" "+p.getState()+" "+p.getZip()+" "+p.getPhno()+"\n";
    }
    public void setValues(Person p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fn = sc.next();
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

        System.out.println("Enter your phone number: ");
        Integer phn = Integer.valueOf(sc.next());
        p.setPhno(phn);

    }

}
