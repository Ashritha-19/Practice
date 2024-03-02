package PrivateDemo;

public class EmployeeDetails {
    private String name;
    private String id;
    private String company;
    public EmployeeDetails(String name, String id, String company){
        this.name = name;
        this.id = id;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public String getCompany() {
        return company;

    }
}
