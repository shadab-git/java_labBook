package Lab4.exercise3;

public class Book extends WrittenItem {
	public Book() {
		super() ;
	}

	public Book(long uid, String title, long numOfCopies, String author) {
		super(uid, title, numOfCopies, author);
	}

	public long getUid() {
		return super.getUid();
	}


	public String getTitle() {
		return super.getTitle();
	}

	
	public long getNumOfCopies() {
		return super.getNumOfCopies();
	}
	
	public String getAuthor() {
		return super.getAuthor();
	}
	
	public void print() {
		System.out.println("Info About Book ");
		super.print();
		System.out.println("AUTHOR : " +super.getAuthor());
	}
	
	//adding to map
	public void addItem(Book book) {	
		super.addItem(book);
	}
	
	//deleting by id and value
	public void deleteItem(long id, Book book) {	
		super.deleteItem(id,book);
	}

	@Override
	public String toString() {
		return "Book [ " +  super.toString() + " Author= " + getAuthor() + " ] ]";
	}
	
	

}
