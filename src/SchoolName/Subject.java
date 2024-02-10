package SchoolName;

public class Subject {
    public String name;
    public int marks;
    public String result;

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", result='" + result + '\'' +
                '}';
    }

    public Subject(String name, int marks, String result){
    this.name=name;
    this.marks=marks;
    this.result=result;

}

}
