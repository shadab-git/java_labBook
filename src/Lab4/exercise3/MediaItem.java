package Lab4.exercise3;

public abstract class MediaItem extends Item {
	private int runtime ;
	
	public MediaItem() {
		super();
		}

	public MediaItem(long uid, String title, long numOfCopies, int runtime) {
		super(uid, title, numOfCopies);
		this.runtime = runtime ;
	}


	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	
}
