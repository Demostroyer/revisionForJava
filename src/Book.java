
public class Book {
	//the instance variables for the book class
	private String title;
	private int pages;
	private int yearOfPublication;
	private String author;
	private String genre;
	//default construcot for the class
	public Book(){
		pages=0;
		title="undefined";
		author="undefined";
		genre="undefined";
		yearOfPublication=1990;
	}
	//creating the user defined constructor
	public Book(String title, String author, String genre, int pages, int yearOfPub){
		this.title=title;
		this.author=author;
		this.genre=genre;
		this.pages=pages;
		yearOfPublication=yearOfPub;
	}
	
	//now making the getters for the class
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}
	public int getPages() {
		return pages;
	}
	public int getYear() {
		return yearOfPublication;
	}
	//now making the setter methods for the class
	public void setAuthor(String person) {
		author=person;
	}
	public void setTitle(String name) {
		title=name;
	}
	public void setGenre(String type) {
		genre=type;
	}
	public void setPage(int num) {
		pages=num;
	}
	public void setYear(int year) {
		yearOfPublication=year;
	}
	
	//going to make a print out method, no need foe all the printout statements in the main class
	public void summary() {
		System.out.println("The name of the book is: " +title);
		System.out.println("The author is: "+author);
		System.out.println("The genre is: "+genre);
		System.out.println("The number of pages is: "+pages);
		System.out.println("The year of publication is: "+yearOfPublication+"\n");
	}
	
	
	
	
}
