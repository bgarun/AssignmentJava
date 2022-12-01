class Car{
	String model;
	int rating;
	double efficiency;
	int topspeed;
	Car(){
		System.out.println("Car");
		model="Tata Punch";
		rating=5;
		efficiency=25.4;
		topspeed=180;
	}
}
public class Day2502 {
	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.model);
		System.out.println(c.rating);
		System.out.println(c.efficiency);
		System.out.println(c.topspeed);
	}

}
