package aggregation;

public class Book {
	
	String bookname;
	int pages;
	Author ar;
	
	public Book(String bookname,int pages,Author ar) {
		
		this.bookname=bookname;
		this.pages=pages;
		this.ar=ar;
	}

	public void display() {
		
		System.out.println(bookname);
		System.out.println(pages);
		System.out.println(ar.age);
		System.out.println(ar.Authorname);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author obj1 = new Author("Sajith",10);
		Book obj2 = new Book("moment to remember",200,obj1);
		obj2.display();
	}

}
