class StaticPoly{
	int id;
	String name;

	     StaticPoly(){
			System.out.print("This is default constructor");
		}
             StaticPoly(int i,String n){
			id=i;
			name=n;
		}
}

public class ConstructorOverLoading{
	Public static void main(String args[]){
		StaticPoly s = new StaticPoly();
		System.out.println("Default Constructor val :");
		System.out.println("Student Id : " +s.id+"Student Name : "s.name);

		System.out.print("\nParameterized Constructor val : ");
		StaticPoly student = new StaticPoly(126,"Pradeep");
		System.out.print("Student Id :"+student.id+ "Student Name : "+student.name );
	}
}