package constructorOverloading;

public class Address {
    public String city;
    public String state;
    public String country;
    public String pinCode;

    public Address(){
        city="Guntur";
        state = "AP";
        country = "India";
        pinCode = "522001";

    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
