
public class arithAbstractProg extends AbstractProgression {
	protected long increment;
	public arithAbstractProg() {
		// TODO Auto-generated constructor stub
		this(1,0);//incrememnt 1, start at 0
	}
	
	public arithAbstractProg(long stepsize) {
		this(stepsize,0);}//increment of stepsize, start at 0

	public arithAbstractProg(long stepsize, long start) {//incrememnt of stepsize, start at start
		super(start);
		increment=stepsize;
		
	}
	
	//now to make the overridden version of advance
	protected void advance() {
		current +=increment;
	}
}
