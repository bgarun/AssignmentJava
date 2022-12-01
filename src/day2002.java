class constitution{
	static String name="Indian Constitution";
	static void date() {
		System.out.println("26 jan 1950");
	}
	int parts=25;
	void parts() {
		System.out.println(parts);
	}
}
public class day2002 {
static int articles=470;
int amendments=105;
static void contents() {
	System.out.println("Preamble and 25 parts and 12 schedules");
}
void preamble() {
	System.out.println("includes word socialist,secular and integrity");
}
public static void main(String[]args) {
	System.out.println(articles);
	System.out.println(new day2002().amendments);
	contents();
	new day2002().preamble();
	System.out.println(constitution.name);
	constitution.date();
	System.out.println(new constitution().parts);
	new constitution().parts();
	
}
}

