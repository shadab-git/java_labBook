package Lab4.exercise3;

import java.util.Map;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Choose any one to create : ");
		System.out.println("1 for Book:");
		System.out.println("2 for Journal:");
		System.out.println("3 for Video:");
		System.out.println("4 for CD:");
		
		Scanner sc = new Scanner(System.in) ;
		
		int choice = sc.nextInt() ;
		
		switch(choice) {
		
		case 1:
			//long uid, String title, long numOfCopies, String author
			System.out.println("Add Book Info ");
			System.out.print("Create Id of Book (4 digit Num) : ");
			long id = sc.nextLong() ;
			System.out.println();
			System.out.print("Title of the book: ");
			String title = sc.next() ;
			System.out.println();
			System.out.print("No of Copies : ");
			long nc = sc.nextLong() ;
			System.out.println();
			System.out.print("Author of the book: ");
			String author = sc.next() ;
			System.out.println();
			
			Book b = new Book(id, title, nc, author) ;
			
			System.out.println("Choose operations");
			System.out.println("A for ADD");
			System.out.println("D Delete");
			System.out.println("C for CheckIn");
			System.out.println("B for CheckOut");
			System.out.println("P for printing the detail");
			
			
				String option = sc.next() ;
				String newoption = option.toUpperCase() ;
				switch(newoption) {
				case "A" :
					b.addItem(b);
					break ;
				case "D" :
					b.deleteItem(id, b);
					break;
				case "C" :
					b.checkIn();
					break ;
				case "B" :
					b.checkOut();
					break ;
				case "P":
					b.print();
					break ;
				}
			break ;
		case 2:
			//long uid, String title, long numOfCopies, String author
			System.out.println("Add Journal Info ");
			System.out.print("Create Id of Journal (4 digit Num) : ");
			 id = sc.nextLong() ;
			System.out.println();
			System.out.print("Title of the journal: ");
			 title = sc.next() ;
			System.out.println();
			System.out.print("No of Copies : ");
			nc = sc.nextLong() ;
			System.out.println();
			System.out.print("Author of the journal : ");
			author = sc.next() ;
			System.out.println();
			System.out.print("date of the journal : ");
			String date = sc.next() ;
			
			JournalPaper j = new JournalPaper(id, title, nc, author,date) ;
			
			System.out.println("Choose operations");
			System.out.println("A for ADD");
			System.out.println("D Delete");
			System.out.println("C for CheckIn");
			System.out.println("B for CheckOut");
			System.out.println("P for printing the detail");
			
			
				 option = sc.next() ;
				 newoption = option.toUpperCase() ;
				switch(newoption) {
				case "A" :
					j.addItem(j);
					break ;
				case "D" :
					j.deleteItem(id, j);
					break;
				case "C" :
					j.checkIn();
					break ;
				case "B" :
					j.checkOut();
					break ;
				case "P":
					j.print();
					break ;
				}
			break ;
		case 3:
			//long uid, String title, long numOfCopies, int runtime, String director, String genre, String year
			System.out.println("Add Video Info ");
			System.out.print("Create Id of Video (4 digit Num) : ");
			 id = sc.nextLong() ;
			System.out.println();
			System.out.print("Title of the video : ");
			 title = sc.next() ;
			System.out.println();
			System.out.print("No of Copies : ");
			nc = sc.nextLong() ;
			System.out.println();
			System.out.print("Runtime : ");
			int runtime = sc.nextInt() ;
			System.out.println();
			System.out.print("Director : ");
			String director = sc.next() ;
			System.out.println();
			System.out.print("Genre : ");
			String genre = sc.next() ;
			System.out.println();
			System.out.print("YOP : ");
			String yop= sc.next() ;
			
			Video v = new Video(id, title, nc, runtime, director, genre, yop) ;
			
			System.out.println("Choose operations");
			System.out.println("A for ADD");
			System.out.println("D Delete");
			System.out.println("C for CheckIn");
			System.out.println("B for CheckOut");
			System.out.println("P for printing the detail");
			
			
				 option = sc.next() ;
				 newoption = option.toUpperCase() ;
				switch(newoption) {
				case "A" :
					v.addItem(v);
					break ;
				case "D" :
					v.deleteItem(id, v);
					break;
				case "C" :
					v.checkIn();
					break ;
				case "B" :
					v.checkOut();
					break ;
				case "P":
					v.print();
					break ;
				}
				break ;
		case 4:
			//long uid, String title, long numOfCopies, int runtime, String director, String genre, String year
			System.out.println("Add CD Info ");
			System.out.print("Create Id of CD (4 digit Num) : ");
			 id = sc.nextLong() ;
			System.out.println();
			System.out.print("Title of the CD : ");
			 title = sc.next() ;
			System.out.println();
			System.out.print("No of Copies : ");
			nc = sc.nextLong() ;
			System.out.println();
			System.out.print("Runtime : ");
			runtime = sc.nextInt() ;
			System.out.println();
			System.out.print("Artist : ");
			String artist = sc.next() ;
			System.out.println();
			System.out.print("Genre : ");
			genre = sc.next() ;
			
			CD cd = new CD(id, title, nc, runtime, artist, genre) ;
			
			System.out.println("Choose operations");
			System.out.println("A for ADD");
			System.out.println("D Delete");
			System.out.println("C for CheckIn");
			System.out.println("B for CheckOut");
			System.out.println("P for printing the detail");
			
			
				 option = sc.next() ;
				 newoption = option.toUpperCase() ;
				switch(newoption) {
				case "A" :
					cd.addItem(cd);
					break ;
				case "D" :
					cd.deleteItem(id, cd);
					break;
				case "C" :
					cd.checkIn();
					break ;
				case "B" :
					cd.checkOut();
					break ;
				case "P":
					cd.print();
					break ;
				}
				break ;
	
		}
		
	}
}
