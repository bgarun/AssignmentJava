class Andor {
	public static void main(String [] args) {
		int a=35;
		int b=20;
		boolean res= a>b || ++a > ++b;
		System.out.println(res);
		System.out.println(a);
		System.out.println(b);
}
}