import java.util.Scanner;
public class Simple{
public static void main(String[] arg){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter : ");
	int i=input.nextInt();
	int j=input.nextInt();
	int k=input.nextInt();
	if(i>k){
		if(j>k)
			System.out.println("i and j are greater than k");
	}
	else
		System.out.println("i is less than or equal to k");
}
}