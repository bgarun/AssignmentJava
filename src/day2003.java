class nation{
	static String code="IND";
	static void name() {
		System.out.println("India");
	}
	void language() {
		System.out.println("many languages present");
	}
}
public class day2003 {
static int states=28;
byte UT=8;
static void currency() {
	System.out.println("Rupees");
}
void GDP() {
	System.out.println("Expected to 7.4");
}
public static void main(String[]args) {
	System.out.println(states);
	System.out.println(new day2003().UT);
	currency();
	new day2003().GDP();
	System.out.println(nation.code);
	nation.name();
	new nation().language();
	
}
}
