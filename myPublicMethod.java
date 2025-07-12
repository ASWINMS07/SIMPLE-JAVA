public class Main{
	Static void myStaticMethod(){
		System.out.println("Static methods can be called without creating obj");
public void myPublicMethod(){
	System.out.println("Public method must be called by creating obj");
}
public static void main(String args[]){
	myStaticMethod();
	Main myObj = new Main();
	myObj.myPublicMethod();
	}
}