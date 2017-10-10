import java.util.*;
/**
 * This method will take in user input of 2 numbers.
 * It then will join these two into a single list of numbers, where each number is paired with its corresponding val
 * in the other list
 * @author demps 30/07/2017
 *@version 1.2
 */

 
public class test{

	public static void main(String [] args){
		//three ArrayLists
			//first 2 are the individual lists of numbers.
		//	3rd list is the joined list, where each element is added respectfully 
			//ex: l1{1,2,3},l2{4,5,6} therefore l3{1,4,2,5,3,6}
		
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		//make a scanner now
		Scanner scan = new Scanner(System.in);	
		System.out.println("Please enter your first list of numbers");
		
		//adding in the vals to my first list
		for(int i =0;i<=4;i++){//must make these be able to work for any size. 
			if(scan.hasNextInt()){
				list1.add(scan.nextInt());
			}else{
				i++;
			}	
		}
		System.out.println("Please enter your second list of numbers");
		//adding in vals to my second list
		for(int i =0;i<=4;i++){
			if(scan.hasNextInt()){
				list2.add(scan.nextInt());
			}else{
				i++;
			}	
		}
		System.out.println("List1 after user input with a scanner: "+list1);
		System.out.println("List2 after user input with a scanner: "+list2);
	
		//just adding some elements by hand, will make into scanner later
		/*list1.add(1);
		list1.add(2);
		list1.add(3);*/
		//System.out.println("List1 is: " + list1);
		/*list2.add(4);
		list2.add(5);
		list2.add(6);*/
		//System.out.println("List2 is: " + list2);
	
		//will need a counter that will be the index of each element i take out of the 2 lists.
		//this will be used in the method add
		int index = 0;
		//System.out.println("Size of list 1 is: "+list1.size());
		//now loop through both lists, adding each element at the same index of each list to the 3rd one
		while(list1.isEmpty() !=  true){
			//get the two elements
					int obj1,obj2;
					obj1 = list1.get(index);
					obj2 = list2.get(index);
					//add in new elements
					list3.add(obj1);
					list3.add(obj2);
					//try just removing the elements. the index++ is funky
					list1.remove(index);
					list2.remove(index);
					//now print them
					//System.out.println("List1 after deletion: " + list1);
					//System.out.println("List2 after deletion: " + list2);
				//index++;
		}
		System.out.println("List3 is :" + list3);	
	}
}