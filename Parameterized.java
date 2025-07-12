import java.io.*;
class Data{
	String name ="Ramu";
	int id = 99;
	Data (String name, int id){
		this.name = name;
		this.id=id;
		}
	}
public class Parameterized{
  public static void main(String args[]){
	Data data =new Data("Surya",99);
	System.out.println("Name :"+data.name+" and Id :"+data.id);
	}
} 