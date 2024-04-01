package Module_3.CustomerAccountApp;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */
public class Customer {
    private String name = "Tuhin Daw";
    private String address = "123 Main Street";
    private String city = "NewYork";
    private String zip = "19087";


    public Customer() {}

    public Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        return "---Customer Details---"+ "\n" +
                "name=" + name + "\n" +
                "address=" + address + "\n" +
                "city=" + city + "\n" +
                "zip=" + zip + "\n";
    }
}
