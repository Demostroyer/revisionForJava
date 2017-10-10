package Section3;
//this class will store our info in an array. It will use the constructor from gameEntry to get this 
//info into a better representation. The scoreboard has a limit of size, but can be anything, we will 
//set it using a param in our scoreboard constructor. We will have the scoreboard go from highest to 
//lowest. only adding in a new score if it higher than the lowest high score currently in the scoreboard. 

public class scoreBoard {
	private int numEntries = 0;
	private GameEntry[] board;//array of game entries, so the array is type GameEntry. The size of the
	//board is defined below in the constructor.
	
	//constructs an empty scoreboard with the given capacity for storing entries. 
	public scoreBoard(int capacity) {
		// TODO Auto-generated constructor stub
		board = new GameEntry[capacity];
	}
	/*
	One of the most common updates we might want to make to a Scoreboard is to add
	a new entry. Keep in mind that not every entry will necessarily qualify as a high
	score. If the board is not yet full, any new entry will be retained. Once the board is
	full, a new entry is only retained if it is strictly better than one of the other scores,
	in particular, the last entry of the scoreboard, which is the lowest of the high scores.
	*/
	//This method will return nothing, takes a GameEntry as its type for param
	public void add(GameEntry g) {
		int newScore = g.getScore();//get the score of this new entry. must test it!!
		//now test if this new score is bigger than the last score to get inputted.
		//so test first if the numEntries is smaller than length, if so we can input the score straight away
		//as there is room. OR is the new score higher than the very last slot in the board
		if(numEntries <board.length || newScore > board[numEntries-1].getScore()) {
			if(numEntries < board.length) {//no score drops off of the board
				numEntries++;//so increase this val, to track size of board
				//shift any lower score to the right, making room for new entry.
			}
			int j = numEntries-1;
				//whilst not at the the head of the board, and the score before J is less than newScore
				//we keep moving, as we have not found a val that is bigger than new score.
				//when we do find it we will then know where to put the new val, where j is
			while(j>0 && board[j-1].getScore() <newScore) {
				board[j]=board[j-1];
					j--;
				}
				board[j]=g;//once find it, we set the index j to be this new GameEntry. 
			}
		}
	//this method will remove an entry based on the index given for the entry.
	//when we remove said entry, we must simply must all entries following it up one to remove it.
	//we want to return this entry though, so we store it in a temp var, then return this temp var
	public GameEntry remove(int i) throws IndexOutOfBoundsException {
		GameEntry temp = null;
		//so if i is an invalid answer
		if(i <0 || i>=numEntries)
		{
			throw new IndexOutOfBoundsException("i:" + i +" ,is an invalid index");
		}
		temp = board[i];//so it is valid, we set temp to this position on our board.
		for(int j =i;j<numEntries-1;j++) {
			//so starting at index j(really it is i), we overwrite every positoin with the neighrbour to the 
			//right of our current position, this removes the wanted entry
			board[j] = board[j+1];	
		}
		board[numEntries-1] = null; //gets rid of the final entry
		numEntries--;//updats the total number of entries in our scoreboard
		return temp;
		
	}
	
	public static void main(String [] args) {
		scoreBoard score = new scoreBoard(4);
		String[] names = {"Ian","John","Bryan","Dawid"};
		int[] scores = {10,2,3,5};
		//now to insert each of these
		for(int i =0;i<names.length;i++) {
			//make a gameentry to add into score
			GameEntry g = new GameEntry(names[i],scores[i]);
			System.out.println("Adding: "+g);
			score.add(g);
			System.out.println("Scoreboard " + score);
		}
		//an example of removing an entry
	    System.out.println("Removing score at index " + 3);
	    score.remove(3);
	    System.out.println(score);
	}
}
