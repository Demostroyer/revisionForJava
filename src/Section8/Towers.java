package Section8;

public class Towers {
	static int nDisks=64;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doTowers(nDisks,'A','B','C');
		
	}
	
	public static void doTowers(int topN, char src,char inter,char dest) {
		
		if(topN==1)System.out.println("Disk 1 from " + src +" to " + dest);
		else {
			doTowers(topN-1,src,dest,inter);//src to inter
			System.out.println("Disk " + topN + " from "+ src+ " to " + dest );//move bottom
			doTowers(topN-1,inter,src,dest);//inter to dest
		}
		
		
	}

}
