class day{
	static double b=4.5;
	static void task() {
		System.out.println("task");
	}
	static boolean res= false;
}
class day1901{
	static float w=4.5f;
	static void disp() {
		System.out.println("disp method");
	}
	public static void main(String[]args) {
		System.out.println(day.b);
		day.b=65845.235;
		System.out.println(day.b);
		day.task();
		System.out.println(day.res);
		System.out.println(w);
		w=8.5f;
		System.out.println(w);
		disp();
	}
}