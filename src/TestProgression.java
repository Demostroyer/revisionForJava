//this class will just test the progression of the arithmeticProgression class
public class TestProgression {

	public static void main(String [] args) {
		// TODO Auto-generated constructor stub
		//prog has type Progression. but it can be an instance of the sublasses of Progression
		//so it can be a new arithmetic progression. It can be declared as an indirect or direct subtype
		//of pregression
		Progression prog;
		//test arithmeticProgression
		System.out.print("Arithmetic Progression with default increment: " );
		prog = new arithmeitcProgression();
		prog.printProgr(10);
		System.out.print("Arithmetic Progression with increment of 5: " );
		prog = new arithmeitcProgression(5);
		prog.printProgr(10);
		System.out.print("Arithmetic Progression with start 2, and increment 5: " );
		prog = new arithmeitcProgression(5,2);
		prog.printProgr(10);
		
	}

}
