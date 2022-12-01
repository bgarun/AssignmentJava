class state{
	static String statecode="KA";
	static void State() {
		System.out.println("Karnataka");
	}
	int dist=31;
	void district() {
		System.out.println("31 Disticts");
	}
}
public class day2001 {
static String dist="gadag";
long population;
static void town() {
	System.out.println("Gajendragad");
}
void economy() {
	System.out.println("Economy");
}
public static void main(String[]args) {
	System.out.println(dist);
	System.out.println(new day2001().population);
	town();
	new day2001().economy();
	System.out.println(state.statecode);
	state.State();
	System.out.println(new state().dist);
	new state().district();
	
}
}
