/*
 *Simulaiton of a tic tac toe game, with no computer strategy. 
 * @author Ian Dempsey
 * @date 21/09/17
 * Here 1 is equivalent to X, -1 is equal to O. I will use a matrix(two arrays) to represent the board
 * To check if a player has won, I will make a method that will sum up all possible ways to win,
 * and if the sum =3(for player X) then they won, and vice-versa.
 * This will need a few global vars, ie players X O, the empty var for board space thats empty
 * the board itself and the player who is playing.
 * Constructor will clear the board for a new round. So need a clearboard method
 * need a method to insert the mark onto the board at position [i][j]
 * initially hardcode in where players place something, just to see.
 * maybe have a display func to show off the board at every turn? 
 *a more advanced version can use scanners to ask the player where they want to place something
 */
public class TicTacTo {
//some instance global vars
	public static final int X=1,O=-1;//THE two players
	public static final int EMPTY =0;//the empty states of the board
	public static int[][] board =new int[3][3];//the 3x3 board state
	public int player;//current player
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a new game
		TicTacTo game = new TicTacTo();
		//now some hardcoded moves!
		game.putMark(2, 0);//x
		game.putMark(0, 1);//o
		game.putMark(2,1);//x
		game.putMark(2,2);//o
		game.putMark(1,1);//x
		game.putMark(0,0);//o
		game.putMark(1,2);//x
		game.putMark(0,2);//o
		game.putMark(1,0);//x
		//going to try add in another marker to test my new Exception in putMark()
		//game.putMark(2, 0);//this should return an IllegalStateException
		//so x should win in the above case
		System.out.println(game);//quick check on current state
		//now need something that will check if somebody won.
		int winner=game.winner();
		String[] outcome= {"O wins","Tie", "X wins"};
		
		if(winner==1) {
			System.out.println(outcome[winner+1]);
		}else if(winner==0) {
			System.out.println(outcome[winner]);
		}else {
			System.out.println(outcome[winner-1]);
		}
		//System.out.println(outcome[winner+1]);
	}
	
	/**Constructor**/
	public TicTacTo() {clearBoard();}
	//Clears the board
	public void clearBoard() {
		for(int i =0;i<3;i++) {//going through the row
			for(int j =0;j<3;j++) {//going through columns
				board[i][j]=EMPTY;//put in value 0 at position, resetting the board
			}
		}
		player=X;//now reset that the first player is X;
	}
	
	//this method is used for putting in a mark on the board
	//i, j are the args which are the positions
	//probably can use the exceptions to catch issues like invalid coords, or position is full already
	public void putMark(int i, int j) throws IllegalArgumentException, IllegalStateException{
		int count=0;//use a counter to track the number of executions of this method,
		
		if((i<0)||(j<0)||i>2||j>2) {//if it is out of bounds
			throw new IllegalArgumentException("Invalid Board Position");
			
		}if(board[i][j]!=EMPTY) {//if the position is occupied already
			throw new IllegalArgumentException("Board Position already occupied!");
		}
		//maybe call winner(), if it returns a winner then print it out?
		//		if(winner()==1 || winner()==0) {//if the total number of plays is greater than 9, then the game is over. 
			//		throw new IllegalStateException("The game is over, you can not put down any more marks");
				//}
		count++;//incrememnt the count
		//else the position is good, so put in the mark
		board[i][j]=player;//initially will be player X, to change this to other player multiply by -1
		//so setting the turn to the other player by getting opposite of current player
		player= -player;//so 1 becomes -1

	}
	//it has return type of int because it will return the int representing X or 0.
	//will need a method that checks board state to see if any way there's a config equalling 3.
	public int winner(){
		if(isWin(X)) {
			return X;
		}else if(isWin(O)) {
			return O;
		}else {//else nobody won!
		return 0;
		}
	}
	//checks whether the board config is a win for given player.
	public boolean isWin(int mark) {
		return((board[0][0]+board[0][1]+board[0][2] == mark*3) //row 0
				||(board[1][0]+board[1][1]+board[1][2] == mark*3)//row 1
				||(board[2][0]+board[2][1]+board[2][2] == mark*3)//row 2
				||(board[0][0]+board[1][0]+board[2][0] == mark*3)//column 0
				|| (board[0][1]+board[1][1]+board[2][1] == mark*3)//column 1
				|| (board[0][2]+board[1][2]+board[2][2] == mark*3)//column 2
				|| (board[0][0]+board[1][1]+board[2][2] == mark*3)//diag
				|| (board[2][2]+board[1][1]+board[0][2] == mark*3)//reverse diag
				);
	}
	//this is called when we print out the board.
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//the rows
		for(int i=0;i<3;i++) {
			//the columns
			for(int j =0;j<3;j++) {
				//use a switch, will allow the two to be printed based on the current player
				switch(board[i][j]) {
				case X: sb.append("X");
				break;
				
				case O: sb.append("O");
				break;
				
				case EMPTY: sb.append("0");
				break;
				
				}
				//this is for the separator |, will go in between every column, but not at the end
				if(j <2) { sb.append("|");}
			}
			//this is for separator between rows
			if(i<2) {sb.append("\n~~~~~\n");}
		}
		
		return sb.toString();
	}
	
}
