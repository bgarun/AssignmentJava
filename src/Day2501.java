class Phone{
	double version;
	String os;
	int ram;
	int rom;
	Phone(){
		System.out.println("Smartphone models");
		version=10.3;
		os="Android";
		ram=6;
		rom=128;
	}
}
public class Day2501 {
	public static void main(String[] args) {
		Phone p=new Phone();
		System.out.println(p.version);
		System.out.println(p.os);
		System.out.println(p.ram);
		System.out.println(p.rom);
	}
	
	

}
