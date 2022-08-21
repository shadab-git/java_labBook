package Lab4.exercise3;

public class Video extends MediaItem{
	
	private String director;
	private String genre ;
	private String year ;
	
	public Video() {
		super() ;
	}

	public Video(long uid, String title, long numOfCopies, int runtime, String director, String genre, String year) {
		super(uid, title, numOfCopies, runtime);
		this.director = director ;
		this.genre = genre ;
		this.year = year ;
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
	
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void print() {
		System.out.println("Info About Video ");
		super.print();
		System.out.println("RUNTIME : " +super.getRuntime() + "mins") ;
		System.out.println("DIRECTOR : " +director);
		System.out.println("GENRE : " +genre);
		System.out.println("YOP : " +year);
		
		
	}
	
	public void addItem(Video v) {
		super.addItem(v);
	}
	
	//deleting by id and value
		public void deleteItem(long id, Video video) {	
			super.deleteItem(id,video);
		}


	@Override
	public String toString() {
		return "Video [ " +  super.toString() +" Runtime="+ getRuntime()+"min " + ", Director="+ director + 
				", Genre="+ genre + ", YOP="+ year + " ] ]";
	}
	
	
}
