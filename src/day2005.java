class car{
	static String company="tata";
	static void origin() {
		System.out.println("India");
		System.out.println("vocal for local");
	}
	}
public class day2005 {
static String model="Safari";
String variant="xz+";
static void engine() {
	System.out.println("Peugeot XD88 turbodiesel");
}
void Price() {
	System.out.println("depends on location and variant");
}
public static void main(String[]args) {
	System.out.println(model);
	System.out.println(new day2005().variant);
	engine();
	new day2005().Price();
	System.out.println(car.company);
	car.origin();
	
}
}
