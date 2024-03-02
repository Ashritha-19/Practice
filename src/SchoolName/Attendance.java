package SchoolName;

public class Attendance {
    public int noOfWorkingDays;
    public int noOfPresentDays;
    public int noOfTotalDays;
    public String monthName;


    public Attendance(int noOfWorkingDays, int noOfPresentDays, int noOfTotalDays, String monthName) {
        this.noOfWorkingDays = noOfWorkingDays;
        this.noOfPresentDays = noOfPresentDays;
        this.noOfTotalDays = noOfTotalDays;
        this.monthName = monthName;
    }
}