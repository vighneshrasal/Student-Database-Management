import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

    //Ask how many neew students we want to add
    System.out.print("Enter number of students to enroll: ");
    Scanner in = new Scanner(System.in);
    int numOfStudents = in.nextInt();
    Student[] students = new Student[numOfStudents];

    // Create n number of new students
    for(int n = 0; n < numOfStudents; n++){
        students[n] = new Student();
        students[n].Enroll();
        students[n].payTuition();
        System.out.println(students[n].showInfo());
        System.out.println();
    }
    System.out.println(Arrays.toString(students));
    }
}
