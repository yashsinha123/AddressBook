public class Person {
    private String firstname;
    private String lastname;
    private String address;
    private String city;
    private String state;
    private Integer zip;
    private String phno;
    private String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getPhno() {

        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + "\n" +
                ", lastname='" + lastname + "\n" +
                ", address='" + address + "\n" +
                ", city='" + city + "\n" +
                ", state='" + state + "\n" +
                ", zip=" + zip + "\n" +
                ", phno=" + phno + "\n" +
                ", email='" + email + "\n" +
                '}';
    }

}
