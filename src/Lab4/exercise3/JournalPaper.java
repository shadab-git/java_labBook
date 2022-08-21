package Lab4.exercise3;
	

	public class JournalPaper extends WrittenItem {
		private String yop ;
		
		public JournalPaper() {
			super() ;
		}

		public JournalPaper(long uid, String title, long numOfCopies, String author, String yop) {
			super(uid, title, numOfCopies, author);
			this.yop = yop ;
		}
		
		public String getYop() {
			return yop;
		}

		public void setYop(String yop) {
			this.yop = yop;
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
			System.out.println("Info About JournalPaper ");
			super.print();
			System.out.println("AUTHOR : " +super.getAuthor());
			System.out.println("YOP : " +yop);
		}
		
		//adding in the map
		public void addItem(JournalPaper journal) {
			super.addItem(journal);
		}
		//deleting by id and value
		public void deleteItem(long id, JournalPaper journal) {	
			super.deleteItem(id,journal);
		}
		@Override
		public String toString() {
			return "JournalPaper [ " +  super.toString() + " Author= " + getAuthor() + ", YOP="+getYop() +" ] ]";
		}

	}


