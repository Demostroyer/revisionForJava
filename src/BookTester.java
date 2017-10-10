
public class BookTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is using the default contructor
		Book book1=new Book();
		//the following two will be defined by a user.
		Book book2 = new Book("The Waking Fire","Anthony Ryan", "Fantasy", 600, 2016 );
		Book book3 = new Book("The Legion of Flame","Anthony Ryan", "Fantasy", 456, 2017 );
		//this is the one line to try and print it out all out for each book.
		book1.summary();
		book2.summary();
		book3.summary();
		 int result = factorial(2);
		 System.out.println("The result is: "+result);
		
		
		/* This all seems redundant, try to do it in one line for each book!!
		 * COMPLETED it in 3 lines above.
		//now going to print out the values of each object
		System.out.println("The name of the first book is: " +book1.getTitle());
		System.out.println("The author is: "+book1.getAuthor());
		System.out.println("The genre is: "+book1.getGenre());
		System.out.println("The number of pages is: "+book1.getPages());
		System.out.println("The year of publication is: "+book1.getYear());
		
		//now for the user-defined ones
		System.out.println("\nThe name of the second book is: "+book2.getTitle());
		System.out.println("The author is: "+book2.getAuthor());
		System.out.println("The genre is: "+book2.getGenre());
		System.out.println("The number of pages is is: "+book2.getPages());
		System.out.println("The year of publication is: "+book2.getYear());
		
		System.out.println("\nThe name of the third book is: "+book3.getTitle());
		System.out.println("The author is: "+book3.getAuthor());
		System.out.println("The genre is: "+book3.getGenre());
		System.out.println("The number of pages is is: "+book3.getPages());
		System.out.println("The year of publication is: "+book3.getYear());
		 */
	}
	
	//a factorial thing in class:
	//facorial being the product of all number from 1*...n-1*n
	public static int factorial(int num) {
		if(num<=1) {
			return 1;
			
		}else {
			return num* factorial(num-1);
		}
	}

}
