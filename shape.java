class Shapes{
	public void area(){
		System.out.print("The Formula for area of ");
	}
}
class Triangle extends Shapes{
	public void area(){
		System.out.println(" Triangle is 1/2 *base*height");
	}
}
class Circle extends Shapes{
	public void area(){
 	 System.out.print(" Circle is 3.14*radius*radius");
	}
}
class Shape{
	public static void main(String args[]){
		Shapes myShape=new Shapes();
		Shapes myTriangle = new Triangle();
		Shapes myCircle = new Circle();
		myTriangle.area();
		myShape.area();
		myCircle.area();
	}
}