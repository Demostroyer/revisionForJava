public class door{
	
	//instance variable
	private boolean open;
	
	//default constructor
	public door(){}
	//my constructor, so if it is open depends on my constructor
	//just an initial way of starting my door class
	public door(boolean status){
		open = status;
	}
	/** this works fine, now to make a more advanced version!
	//now make a checker
	public boolean isClosed(){
		if(open == true){
			return true;
		}else{
			return false;
		}
	}**/
	//following 2 methods will open and close the door.
	public boolean isOpen(){
		open = true;
		return open;
	}
	
	public boolean isClosed(){
		open = false;
		return open;
	}
	//now build a status checker
	public boolean doorStatus(){
		return open;
	}
}