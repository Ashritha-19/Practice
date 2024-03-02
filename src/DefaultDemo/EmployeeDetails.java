package DefaultDemo;

public class EmployeeDetails {
    String name;
    String id;
    String company;

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public EmployeeDetails(String name, String id, String company){
        this.name = name;
        this.id = id;
        this.company = company;

    }
}
