package Lab4.exercise3;

public abstract class WrittenItem extends Item{
	
	private String author ;
	
	public WrittenItem() {
		super() ;
	}
	
	public WrittenItem(long uid, String title, long numOfCopies,String author) {
		super(uid, title, numOfCopies);
		this.author = author ;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
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
	

	
}
