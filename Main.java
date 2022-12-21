import java.util.Scanner;
public class Main {
      
    public static void main(String[] args){
        
        System.out.println("Enter name");

        System.out.println("Enter age");
       
        System.out.println("Enter year of entry");

        System.out.println("Enter course");

        System.out.println("Enter residence_status");
        
        System.out.println("Enter time spent");
        
        Scanner myobj=new Scanner(System.in);

        String name=myobj.nextLine();

        int age=myobj.nextInt();

        myobj.nextLine();

        int year=myobj.nextInt();

        myobj.nextLine();

        String course=myobj.nextLine();

        String residence=myobj.nextLine();
        
        int time_spent=myobj.nextInt();
        
        myobj.nextLine();

        System.out.print("NAME: " + name);

        System.out.print("       AGE: "+ age );

        System.out.print("   YEAR: " + year);
        
        System.out.print("    COURSE: " + course);
      
        System.out.print("   RESIDENCE: " + residence);
       
        System.out.print("   TIME: " + time_spent);
           
    }
}
