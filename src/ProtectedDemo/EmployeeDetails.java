package ProtectedDemo;

public class EmployeeDetails {
    protected String name;
    protected String id;

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    protected String company;
    public EmployeeDetails(String name, String id, String company){
        this.name = name;
        this.id = id;
        this.company = company;


    }
}
