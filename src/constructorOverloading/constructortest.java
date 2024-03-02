package constructorOverloading;

public class constructortest {
    public static void main(String[]args){
        Address address = new Address();
        address.city = "Guntur";
        address.state = "AP";
        address.country = "India";
        address.pinCode = "522001";

        Student student = new Student("Krish", "Amar", "03-03-2000", "7672095126", address);
        System.out.println("student joining"+student);
        Student exam = new Student("Krish", "Amar", "03-03-2000", "7672095126");
        System.out.println("exam"+exam);

    }
}
