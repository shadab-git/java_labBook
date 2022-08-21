package Lab4.exercise3;

public class CD extends MediaItem{
	
	private String artist ;
	private String genre ;
	
	public CD() {
		super() ;
	}

	public CD(long uid, String title, long numOfCopies, int runtime,  String artist, String genre) {
		super(uid, title, numOfCopies, runtime);
		this.artist = artist ;
		this.genre = genre ;
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
	
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}


	public void print() {
		System.out.println("Info About CD ");
		super.print();
		System.out.println("RUNTIME : " +super.getRuntime() + "mins") ;
		System.out.println("ARTIST : " +artist);
		System.out.println("GENRE : " +genre);
	}
	
	public void addItem(CD cd) {
		super.addItem(cd);
	}
	
	//deleting by id and value
		public void deleteItem(long id, CD cd) {	
			super.deleteItem(id,cd);
		}


	@Override
	public String toString() {
		return "CD [ " +  super.toString() +" Runtime="+ getRuntime()+"min " + ", Artist="+ artist + 
				", Genre="+ genre + " ] ]";
	}
	
	
}
