package SchoolName;

public class Validation {
    public boolean isPassed(Subject subject){
        System.out.println("from isPassed"+ subject.name);
        return subject.marks >=35;
    }


    Student getResult(Student inputStudent) {


        if (isPassed(inputStudent.marks.telugu)) {
            inputStudent.marks.telugu.result = "pass";
        } else {
            inputStudent.marks.telugu.result = "fail";
        }
        if (isPassed(inputStudent.marks.hindi)) {
            inputStudent.marks.hindi.result = "pass";
        } else {
            inputStudent.marks.hindi.result = "fail";
        }
        if (isPassed(inputStudent.marks.english)) {
            inputStudent.marks.english.result = "pass";
        } else {
            inputStudent.marks.english.result = "fail";
        }
        if (isPassed(inputStudent.marks.maths)) {
            inputStudent.marks.maths.result = "pass";
        } else {
            inputStudent.marks.maths.result = "fail";
        }
        if (isPassed(inputStudent.marks.science)) {
            inputStudent.marks.science.result = "pass";
        } else {
            inputStudent.marks.science.result = "fail";
        }
        if (isPassed(inputStudent.marks.social)) {
            inputStudent.marks.social.result = "pass";
        } else {
            inputStudent.marks.social.result = "fail";

        }
        if (inputStudent.marks.telugu.result.equals("pass")
                && inputStudent.marks.hindi.result.equals("pass")
                && inputStudent.marks.english.result.equals("pass")
                && inputStudent.marks.maths.result.equals("pass")
                && inputStudent.marks.science.result.equals("pass")
                && inputStudent.marks.social.result.equals("pass")
        ){
            inputStudent.result = "pass";
        }else {
            inputStudent.result = "fail";
        }
        return inputStudent;
       }
    public static void main(String[] args) {


        Subject teluguSubject = new Subject("telugu", 88, "pass");

        Subject hindiSubject = new Subject("hindi",92, "pass");

        Subject englishSubject = new Subject("english", 89, "pass");

        Subject mathsSubject = new Subject("maths", 83, "pass");

        Subject scienceSubject = new Subject("science", 85,"pass");

        Subject socialSubject = new Subject("social", 79, "pass");

        Marks marks = new Marks("88","92","89","83",
                "85","79");
        marks.telugu = teluguSubject;
        marks.hindi = hindiSubject;
        marks.english = englishSubject;
        marks.maths = mathsSubject;
        marks.social = socialSubject;
        marks.science = scienceSubject;

        Student student = new Student("Krish","Amarnadh","01/01/2001",
                "7672095126","Delhi Public School","06");


        student.marks = marks;

       student.name = "Krish";
        student.fatherName = "Amarnadh";
        student.mobileNumber = "7672095126";
        student.dob = "01-01-2001";

        Validation validation = new Validation();
        Student latestStudent = validation.getResult(student);
        System.out.println(latestStudent);

    }
}