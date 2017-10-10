/**
 * This class is used for creating a dog. It has 3 instance variables, breed, isDangerous and age.
 * @author demps
 *
 */
public class Dog {
	String breed;
	boolean isDangerous;
	int age;
	//this is the base constructor. It takes not params and sets values to default. 
	public Dog(){
		breed = "not available";
		isDangerous= true;
		age=1;
	}
	//this is the constructor for given parameters.
	public Dog(String breed, boolean isDangerous, int age){
		this.breed =breed;
		this.isDangerous=isDangerous;
		this.age=age;
	}
	
	public String dogBreed(){
		return breed;
	}
	
	public boolean dogOk(){
		return isDangerous;
	}
	
	public int dogAge(){
		return age;
	}
	
	public void bark(){
		System.out.println("Woof! The dog has barked");
	}
}
