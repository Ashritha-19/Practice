public class EnrollNumber {
    public static void main(String[]args) {
        Student s1 = new Student();
        StudentEnrollment s2 = new StudentEnrollment();
        Student studentOutput = s2.Enrollment("Krish", "Siddharth", "7672095126", "03-03-2000");
        System.out.println(studentOutput);
    }
}
