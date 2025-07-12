import java.util.Scanner;
public class prog {
public static void main ( String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Name : ");
    String name = input.nextLine();

    System.out.println("Enter roll : ");
    int roll = input.nextInt();
    input.nextLine(); 

    System.out.println("Enter Department : ");
    String dept = input.nextLine();

    System.out.println("Enter Mobile number : ");
    double phone = input.nextDouble();
    input.nextLine();

    System.out.println("Enter Email : ");
    String email = input.nextLine();

    System.out.println("Enter Address : ");
    String addr = input.nextLine();

    System.out.println("Enter Age : ");
    int age = input.nextInt();

    System.out.println("Enter Sub 1 mark : ");
    float sub1 = input.nextFloat();
 
    System.out.println("Enter Sub 2 mark : ");
    float sub2 = input.nextFloat();

    System.out.println("Enter Sub 3 mark : ");
    float sub3 = input.nextFloat();

    System.out.println("Enter Sub 4 mark : ");
    float sub4 = input.nextFloat();

    System.out.println("Enter Sub 5 mark : ");
    float sub5 = input.nextFloat();

    float score = sub1 + sub2 + sub3 + sub4 + sub5;
    float avg = score/5;
    
    System.out.println("Average is : " + avg);

    if ( score >= 90.0 )
        System.out.print("A");
    else if ( score >= 80.0 )
        System.out.print("B");
    else if ( score >= 70.0 )
        System.out.print("C");
    else if ( score >= 60.0 )
        System.out.print("D");
    else 
        System.out.print("F");
    }
}