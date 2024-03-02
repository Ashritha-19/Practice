package Protected1;

import ProtectedDemo.EmployeeDetails;

public class Details extends EmployeeDetails {
    public Details(String name, String id, String company) {
        super(name, id, company);
    }

    public static void main(String[]args){
        EmployeeDetails P1 = new EmployeeDetails("Krish", "123", "Neoteric");
        System.out.println(P1);

    }

}
