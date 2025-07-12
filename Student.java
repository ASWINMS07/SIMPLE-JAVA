class Student{
	int id;
	String name;
	int age;
	Student(int i,String n){
		id=i;
		name=n;
	}
	Student(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display(){
		System.out.println(id+""+name+""+age);
	}
		public static void main(String arg[]){
		Student s1=new Student(99,"Surya");
		Student s2 = new Student(999,"Suryaganthan",99999);
		s1.display();
		s2.display();
	}
}