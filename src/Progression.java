//this is a basic sequence of numbers that only increases by 1 every step.
public class Progression {

	//instance var
	protected long current;
	
	public Progression() {this(0);}//the start value for current is 0 if not designated
	
	//user defined constructor
	public Progression(long start) {current=start;}

	//return next val of the sequence
	public long nextVal() {
		long answer =current;//so start off at the current val, just add one to it
		advance();//this is protected call to advance the current value, we store it incase we call 
		//for the next value. 
		return answer;//but we return the value before we advanced. 
	}
	
	protected void advance() {
		current++;
	}
	
	//prints the next n values of the preogression
	public void printProgr(int n) {
		System.out.print(nextVal());
		for(int i =1;i<n;i++) {
			System.out.print(" " + nextVal());
			System.out.println();
		}
		
	}
}
