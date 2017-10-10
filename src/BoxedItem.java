
public class BoxedItem implements Sellable, Transportable {
	
	private String desc;
	private int price;
	private boolean haz;
	private int weight;
	private int height;
	private int width;
	private int depth;
	
	public BoxedItem(String descr,int p, boolean danger, int w) {
		
		// TODO Auto-generated constructor stub
		desc=descr;
		price=p;
		haz=danger;
		weight=w;
	}
	
	//now some getters. will include a an insure method, that just means it is doubles the value of item
	//also inclue a method to set the size of the box
	public String getDesc() {return desc;}
	public int getPrice() {return price;}
	public int lowestPrice() {return price/2;}//the lowest price we are willing to take for the item
	public int getWeight() {return weight;}
	public boolean isHazard() {return haz;}
	public int insuredVal() {return price*2;}
	public void setBox(int hi, int wid, int dep) {
		height = hi;
		width=wid;
		depth=dep;
	}

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
