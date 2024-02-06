package SchoolName;

public class Student {
    public String name;
    public String fatherName;
    public String dob;
    public String mobileNumber;
    public String SchoolName;
    public String RollNo;
    public Address address;
    public Marks marks;
    public String result;

    public Student(String name, String fatherName, String dob, String mobileNumber,
                   String schoolName, String rollNo) {
        this.name = name;
        this.fatherName = fatherName;
        this.dob = dob;
        this.mobileNumber = mobileNumber;
        this.SchoolName = schoolName;
        this.RollNo = rollNo;

    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dob='" + dob + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", SchoolName='" + SchoolName + '\'' +
                ", RollNo='" + RollNo + '\'' +
                ", address=" + address +
                ", marks=" + marks +
                ", result='" + result + '\'' +
                '}';
    }
}
