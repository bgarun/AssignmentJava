class bike{
	static String company="HONDA";
	static void tech() {
		System.out.println("smart enhanced power");
	}
	void clas() {
		System.out.println("100cc to 350cc");
	}
}
public class day2004 {
static String model="Hornet";
byte generation=2;
static void engine() {
	System.out.println("160cc");
}
void Price() {
	System.out.println("depends on location");
}
public static void main(String[]args) {
	System.out.println(model);
	System.out.println(new day2004().generation);
	engine();
	new day2004().Price();
	System.out.println(bike.company);
	bike.tech();
	new bike().clas();
	
}
}
