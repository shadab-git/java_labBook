package Lab4.exercise3;

import java.util.HashMap;

public abstract class Item {
	
	//defining map for adding the informations into it using addingItem
	static HashMap<Long, Book> BookStores = new HashMap<>() ;
	static HashMap<Long, JournalPaper> JournalStores = new HashMap<>() ;
	static HashMap<Long, Video> VideoStores = new HashMap<>() ;
	static HashMap<Long, CD> CDStores = new HashMap<>() ;
	
	private long uid ;
	private String title ;
	private long numOfCopies ;
	
	public Item() {
		super() ;
	}
	
	public Item(long uid, String title, long numOfCopies) {
		super();
		this.uid = uid;
		this.title = title;
		this.numOfCopies = numOfCopies;
	}

	public long getUid() {
		return uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(long numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public void print() {
		System.out.println("ID : " + uid);
		System.out.println("TITLE : " + title);
		System.out.println("NUM OF COPIES: " + numOfCopies);
	}
	
	public void checkIn() {
		this.numOfCopies+=1 ;
	}
	
	public void checkOut() {
		this.numOfCopies-=1 ;
	}
	
	public void addItem(Object obj) {
		Long id = Long.valueOf(uid) ;
		
		if(obj instanceof Book) {
			Book book = (Book)obj ;
			BookStores.put(id, book) ;
		}
		if(obj instanceof JournalPaper) {
			JournalPaper  journal = (JournalPaper)obj ;
			JournalStores.put(id, journal) ;
		}
		if(obj instanceof Video) {
			Video  video = (Video)obj ;
			VideoStores.put(id, video) ;
		}
		if(obj instanceof CD) {
			CD  cd = (CD)obj ;
			CDStores.put(id, cd) ;
		}
		
	}
	
	public void deleteItem(long id, Object obj) {
		if(obj instanceof Book) {
			Book book = (Book)obj ;
			BookStores.remove(id, book) ;
		}
		if(obj instanceof JournalPaper) {
			JournalPaper  journal = (JournalPaper)obj ;
			JournalStores.remove(id, journal) ;
		}
		if(obj instanceof Video) {
			Video  video = (Video)obj ;
			VideoStores.remove(id, video) ;
		}
		if(obj instanceof CD) {
			CD  cd = (CD)obj ;
			CDStores.remove(id, cd) ;
		}
	}

	@Override
	public String toString() {
		return "Item [uid=" + uid + ", title=" + title + ", numOfCopies=" + numOfCopies + "," ;
	};
	
}
