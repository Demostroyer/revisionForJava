package Section3;
/**
 * This class is the first in my relearnig of data structures. 
 * I will be refreshing everything for my final year project. Which will help me for interview Qs
 * This is section 3.1, where  we store hiugh scores in arrays. using objects here!!
 * @author demps
 * 
 */
public class GameEntry {
	private String name;//name of user getting high score
	private int score;
	public GameEntry(String n, int s) {
		// TODO Auto-generated constructor stub
		name=n;
		score=s;
	}
	//we dont need a null constructor, just set everything to default is good. 
	//now some getters
	public String getName() {return name;}
	public int getScore() {return score;}
	//a better representation of this infor
	public String toString() {return " ( " + name + ", " + score + " ) ";}
	

}
