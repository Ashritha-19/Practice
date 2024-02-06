package SchoolName;

public class StudentTest {


    Student getSchoolName(Student student) {
        student.SchoolName = "Delhi Public School";
        return student;

    }
    Student getSchoolNameDeepClone(Student student) {
        Student cloneStudent = new Student("Krish","Amarnadh","01/01/2001",
                "7672095126","Delhi Public School","06");
        cloneStudent.name = student.name;
        cloneStudent.fatherName = student.fatherName;
        cloneStudent.mobileNumber = student.mobileNumber;
        cloneStudent.dob = student.dob;
        cloneStudent.SchoolName = "Delhi Public School";
        return cloneStudent;
    }
        Student getAddress(Student student){
        Student localStudent = new Student("Krish","Amarnadh","01/01/2001",
                "7672095126","Delhi Public School","06");
        localStudent.name = student.name;
        localStudent.fatherName = student.fatherName;
        localStudent.mobileNumber = student.mobileNumber;
        localStudent.dob = student.dob;
        localStudent.SchoolName = student.SchoolName;

        Address address = new Address();
        address.street = "xyz";
        address.city = "Thiruvananthapuram";
        address.state = "Kerala";
        address.pinCode = "123456";
        localStudent.address = address;

        return localStudent;

    }

        public static void main(String[]args) {
            StudentTest studentTest = new StudentTest();

            Student krishstudent = new Student("Krish","Amarnadh","01/01/2001",
                    "7672095126","Delhi Public School","06");


            krishstudent.name = "Krish";
            krishstudent.fatherName = "Amarnadh";
            krishstudent.mobileNumber = "7672095126";
            krishstudent.dob = "01-01-2001";



            Student latestStudent = studentTest.getSchoolName(krishstudent);

            System.out.println("LatestStudent schoolName"+latestStudent.SchoolName);
            System.out.println("Student schoolName"+ krishstudent.SchoolName);

        }
    }

