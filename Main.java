import java.util.Scanner;
public class Main {
      
    public static void main(String[] args){
        

    
    Scanner myScanner=new Scanner(System.in);
   
    System.out.println("Enter name");
    System.out.println("Enter age");
    System.out.println("Enter year of entry");
    System.out.println("Enter course");
    System.out.println("Enter residence_status");
   

    String name= myScanner.nextLine();
    int age= myScanner.nextInt();
    myScanner.nextLine();
    int yearofentry= myScanner.nextInt();
    myScanner.nextLine();
    String course= myScanner.nextLine();
    String residence= myScanner.nextLine();
    myScanner.nextLine();
    Student myStudent = new Student(name, age, yearofentry, course,residence );
    
    System.out.println(myStudent.name);
    System.out.println(myStudent.age);
    System.out.println(myStudent.yearofentry);
    System.out.println(myStudent.course);
    System.out.println(myStudent.residenceStatus);
    }
}
