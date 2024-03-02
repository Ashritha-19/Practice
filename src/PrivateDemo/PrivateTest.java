package PrivateDemo;

public class PrivateTest {
    public static void main(String[]args){
        EmployeeDetails employeeDetails = new EmployeeDetails("Krish","123","Neoteric");
        employeeDetails.getName();
        employeeDetails.getId();
        employeeDetails.getCompany();
        System.out.println(employeeDetails);

    }
}
