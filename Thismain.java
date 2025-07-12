public class ThisMain{
	int x;
	public ThisMain(int x){
	  this.x = x;
	}

	public static void main(String args[]){
		ThisMain myObj = new ThisMain(5);
		System.out.println("Val of x = "+myObj.x);
	}
}