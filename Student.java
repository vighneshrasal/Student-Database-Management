import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
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
    }    

    //Generate an ID
    private void setStudentID(){
        //Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }
    //Enroll in courses
    public void Enroll(){
        //Get inside a loop, user hits 0
    do{
        System.out.print("Enter course to enroll (Q to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();

        if(!course.equals("Q")){
            courses = courses + "\n " + course;
            tuitionBalance = tuitionBalance + costOfCourse; 
        }else{
            break;
        }
    }   while(1 != 0);
    }

    //View Balance 
    public void viewbalance(){
        System.out.println("Your Balance is $" + tuitionBalance);
    }

    //Pay Tuition 
    public void payTuition(){
        viewbalance();

        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);

        viewbalance();
    }

    //Show Status
    public String showInfo(){
        return "Name: " + firstName + " " + lastName + 
               "\nGrade Level: " + gradeYear +
               "\nStudent ID: " + studentID +
               "\nCourse Enroled: " + courses + 
               "\nBalance: $" + tuitionBalance;
    }
}
