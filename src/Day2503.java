class Book{
	String title;
	int pages;
	int edition;
	String author;
	Book(String ti, int pg, int ed, String au){
		title=ti;
		pages=pg;
		edition=ed;
		author=au;
		
	}
}
public class Day2503 {
	public static void main(String[] args) {
		Book b=new Book("one Straw revolution", 182, 1, "Masanobu Fukuoka" );
		System.out.println(b.title);
		System.out.println(b.pages);
		System.out.println(b.edition);
		System.out.println(b.author);
		Book bb=new Book("The machine that changed the world", 352, 2, "James P. Womack" );
		System.out.println(bb.title);
		System.out.println(bb.pages);
		System.out.println(bb.edition);
		System.out.println(bb.author);
		
	}

}
