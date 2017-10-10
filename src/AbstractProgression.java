//now attempting with the abstract way, as Progression could simply be an interface for the subclasses to use
public abstract class AbstractProgression {

	//instance var
		protected long current;
		
		public AbstractProgression() {this(0);}//the start value for current is 0 if not designated
		
		//user defined constructor
		public AbstractProgression(long start) {current=start;}

		//return next val of the sequence
		public long nextVal() {
			long answer =current;//so start off at the current val, just add one to it
			advance();//this is protected call to advance the current value, we store it incase we call 
			//for the next value. 
			return answer;//but we return the value before we advanced. 
		}
		//this is now an abstract version. 
		protected abstract void advance();
		
		//prints the next n values of the preogression
		public void printProgr(int n) {
			System.out.print(nextVal());
			for(int i =1;i<n;i++) {
				System.out.print(" " + nextVal());
				System.out.println();
			}
			
		}
}
