import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt();
		long mobileNo = sc.nextLong();
		double cgpa = sc.nextDouble();
		System.out.println("name :" "+Name);	
	}
}