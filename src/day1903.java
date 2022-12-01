class Atm{
	static String bank="SBI";
	public static void card() {
		System.out.println("insert your card");
	}
	
}
class day1903{
	static int pin=1234;
	static void draw() {
		System.out.println("choose the option");
		System.out.println("enter amount");
	}
	public static void main(String[]args) {
		Atm.card();
		System.out.println(pin);
		draw();
	
	}
}
