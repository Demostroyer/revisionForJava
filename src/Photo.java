//Class for photos that can be sold
public class Photo implements Sellable{

	private String desc;//decription of photo
	private int price;//prive of the photo
	private boolean colour;//true if photo is in colour
	public Photo(String descrip,int p, boolean c) {
		// TODO Auto-generated constructor stub
		desc=descrip;
		price=p;
		colour=c;
	}
	
	//just some getters
	public String description() {return desc;}
	public int listPrice() {return price;}
	public int lowestPrice() {return price/2;}//the lowest price we are willing to take for the photo
	public boolean getColour() {return colour;}

}
