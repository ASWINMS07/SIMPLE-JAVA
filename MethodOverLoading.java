class StaticPoly{
	void sum(int x,int y){
		int s =x+y;
		System.out.println("sum of two number : "+s);
		}
	void sum(int x,int y,int z){
		int s =x+y+z;
		System.out.println("Sum of three num : " +s);
		}
	}
public class MethodOverLoading{
	public static void main(String args[]){
		StaticPoly obj = new StaticPoly();
		obj.sum(20,10);
		obj.sum(10,20,30);
	}
}