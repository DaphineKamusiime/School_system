import java.util.Scanner;
public class Main {
      
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name");
        System.out.println("Enter age");
        System.out.println("Enter year of entry");
        System.out.println("Enter course");
        System.out.println("Enter residence_status");
        System.out.println("Enter time spent");
        
        String name=obj.nextLine();
        int age=obj.nextInt();
        int year=obj.nextInt();
        String course=obj.nextLine();
        String residence=obj.nextLine();
        int time_spent=obj.nextInt();

        System.out.print("NAME----");
        System.out.println(name);

        System.out.print("AGE----");
        System.out.println(age);

        System.out.print("YEAR----");
        System.out.println(year);

        System.out.print("COURSE----");
        System.out.println(course);

        System.out.print("RESIDENCE STATUS---");
        System.out.println(residence); 

        System.out.print("time spent---");
        System.out.println(time_spent); 
           
    }
}