class Shirt{
	String cloth;
	float length;
	int cost;
	boolean slimfit;
	Shirt(String cloth, float length, int cost, boolean slimfit){
	System.out.println("Shirt Stiching");
	this.cloth= cloth;
	this.length=length;
	this.cost=cost;
	this.slimfit=slimfit;
	
	}
}
public class Day2504 {
public static void main(String[]args) {
	Shirt s1= new Shirt("Silk", 1.6f, 850, false );
	System.out.println(s1.cloth);
	System.out.println(s1.length);
	System.out.println(s1.cost);
	System.out.println(s1.slimfit);
	Shirt s2= new Shirt("cotton", 1.2f, 700, true );
	System.out.println(s2.cloth);
	System.out.println(s2.length);
	System.out.println(s2.cost);
	System.out.println(s2.slimfit);
}
}