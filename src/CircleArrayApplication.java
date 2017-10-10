
/**
 * This program will demonstrate how to create objects of the class Circle
 * 
 * In General you need a line of code:
 * 
 * Circle circle1; // declare a variable, capable of storing a reference to a circle object.
 * 
 * circle1 = new Circle(5,7); // create a circle object using the contructor and assign its reference to circle1
 * 
 * In the example below we have instead of a single Circle reference variable, we have created
 * in memory an array of Circle references: 
 * 
 * Circle[] myCircles = new Circle[10];
 * 
 * We must then create an object for each and every element in the array of Circle called myCircles.
 * If after we declare a Circle array, we try to print the elements we will get null values for each element.
 * If we try and erroneously access a method on any of these elements we will get a null
 * pointer exception. (Try this out for yourself)
 * For each element in the array of Circle references we need to do the following:
 * 
 * myCircles[0] = new Circles(5,6); // Create a concrete object and store its reference in myCircles[0]
 * myCircles[1] = new Circles(7,8); // Create a concrete object and store its reference in myCircles[1]
 * myCircles[2] = new Circles(4,3); // Create a concrete object and store its reference in myCircles[2]
 * and so on...
 * 
 * It is only after we have created a Circle object using one of the class constructors (new Circle (5,6) )
 * and assigning the link reference of this to the array element that we can then access the getX and getY 
 * on the newly created concrete circle object methods on it.
 * 
 * @author Joe Duffin
 * @author 83810832
 * @version 3/03/2014
 */
public class CircleArrayApplication
{
    public static void main(String []args){
    
        Circle [] myCircles = new Circle[10]; // This is an array of references to Circle objects
        // We have not yet created the circle objects (concrete classes)
        // This myCircles will print out null values for each of the myCircles array elemets because they have
        // not being given the addresses or links to created objects in memory.
        System.out.println("Printing out the myCircles array (all null values as they reference or point to nothing) ");
        for (int i=0;i<myCircles.length/2;i++){
            
            System.out.println("myCircles ["+i+"] is " + myCircles[i] + "\n");
            // myCircles[i].getX(); // Trying to access this will give you a null pointer exception.
        }
       System.out.println("Now to create an object for each available object refrence variable in our array \n");
        //System.out.println("Notice that we are printing the machine address of each object ");
       System.out.println("We are calling methods on the newly created objects to get their x and y attributes \n ");
       // Use a loop to go through each element in the myCircles array of references 
       // and create a new circle for each element in the array.
       for (int i=0;i<myCircles.length;i++){
           
           myCircles[i] = new Circle(0,0); // create a new Circle object and assign its link to myCircles[i]
            //System.out.println("Machine address of myCircles ["+i+"] is " + myCircles[i]);
            System.out.println("Information for Circle object pointed to by index " + i );
            System.out.println("Value of x is " +myCircles[i].getX() + " --- and y is " + myCircles[i].getY());
            System.out.println("Radius of this circle is " + myCircles[i].getRadius());
            System.out.println("Circle colour is "+ myCircles[i].getColour()+ "\n");
        } 
    } // end of main
} // end of CricelArrayApplication
