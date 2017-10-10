// this class is asubclass ofprogression. it will have a start value, and then a constant value to go up by.
public class arithmeitcProgression extends Progression {
	protected long increment;
	public arithmeitcProgression() {
		// TODO Auto-generated constructor stub
		this(1,0);//incrememnt 1, start at 0
	}
	public arithmeitcProgression(long stepsize) {
		this(stepsize,0);}//increment of stepsize, start at 0

	public arithmeitcProgression(long stepsize, long start) {//incrememnt of stepsize, start at start
		super(start);
		increment=stepsize;
		
	}
	
	//now to make the overridden version of advance
	protected void advance() {
		current +=increment;
	}
}
