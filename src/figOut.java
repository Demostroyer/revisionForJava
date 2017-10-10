import static java.lang.System.out;

public class figOut {
	//mars here is an instance variable
	//instance are outside a method and dont use static
	//each INSTANCE of the class(so a new object) gets a copy for itself of the instance variables to change and use.
	String mars="f.mars 	red planet";
			
	void visitPenn(){
		out.println("visitPA is running");
		
		String mars="		Janine's home town";
		
		out.println(mars);
		out.println(this.mars);
		
	}
}
