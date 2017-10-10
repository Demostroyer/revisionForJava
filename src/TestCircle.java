
/**
 * This is a test class which  demonstrates how to use 
 * a Circle Class.
 * In this test class we use the Circle Class definition
 * to (1) Declare a Circle reference variable (2) Create
 * a new Circle object (concrete class) using.
 * We then send messages to this Circle object using 
 * myCircle.<method name>
 * 
 * @author Joe Duffin
 * @author 883001127
 * @version 03/03/2014
 */
public class TestCircle{
    public static void main(String [] args){
        Circle myCircle; // Declare a Circle reference variable 
        myCircle = new Circle(5,7,10,"Blue"); // Create a new Circle object (concrete class) and give its reference to myCircle
       
        int x = myCircle.getX(); // get the x coordinate
        int y = myCircle.getY(); // get the y coordinate
        int r = myCircle.getRadius(); // get the radius
        String theColour = myCircle.getColour(); // get the value of the colour attribute
        System.out.println("Circle center coordinates are x=" + x + " and y=" + y);
        System.out.println("The circle has a radius value = " + r);
        System.out.println("The circle's colour is : " + theColour);
        
        System.out.println("\n Now to change the attributes of the circle");
        System.out.println("and then to print out the new values of these attributes\n\n");
        
        myCircle.setX(12); // set the x centre coordinate
        myCircle.setY(100);  // set the y centre coordinate
        myCircle.setRadius(20); // set the radius of the circle
        myCircle.setColour("Red"); // set the colour of the circle
        
        x = myCircle.getX(); // get the x coordinate
        y = myCircle.getY(); // get the y coordinate
        r = myCircle.getRadius(); // get the radius
        theColour = myCircle.getColour(); // get the colour of the circle.   
        System.out.println("Circle center coordinates are x=" + x + " and y=" + y);
        System.out.println("The circle has a radius value = " + r);
        System.out.println("The circle's colour is : " + theColour);    
        
    }   
}