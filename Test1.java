import.java.io.BufferedReader;
import.java.io.IDExecption;
import.java.io.InputStreamReader;

public Class Test1{
	public static void main(Strings[] args){
		BufferReader Reader = new BufferReader(new InputStreamReader(System.in));
		System.out.print("Enter The Name : ");
		String name = Reader.readline();

		System.out.println("Enter Dept : ");
		String Dept = Reader.readline();

		System.out.println("Enter Roll : ");
		int age = Integer.parseInt(Reader.readline());

		System.out.println("Enter Mark1 : ");
		float mar1 = Float.parseFloat(Reader.readline());

		System.out.println("Enter Mark2 : ");
		float mar2 = Float.parseFloat(Reader.readline());

		System.out.println("Enter Mark3 : ");
		float mar3 = Float.parseFloat(Reader.readline());

		System.out.println("Enter Mark4 : ");
		float mar4 = Float.parseFloat(Reader.readline());

		System.out.println("Enter Mark5 : ");
		float mar5 = Float.parseFloat(Reader.readline());

		float score = sub1 + sub2 + sub3 + sub4 + sub5;
   	        float avg = score/5;

		System.out.print("Total Mark : "+score);
		System.out.print("Avg : "+avg);
		
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