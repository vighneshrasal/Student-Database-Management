import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;
    private static int id = 1000;

    //Constructor prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student First Name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student Last Name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

        
    }    

    //Generate an ID
    private void setStudentID(){
        //Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }
    //Enroll in courses
    //View Balance
    //Pay Tuition 
    //Show Status
}
