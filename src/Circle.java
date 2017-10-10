
/**
 * This class is a simple representation of a circle.
 * An Circle object could be passed to a drawing Class to draw 
 * a circle as specified by the methods and attributes defined here.
 * 
 * @author Joe Duffin 
 * @version 03/03/2014
 */
public class Circle{
    // Only one of circleCounter exists and this is for all objects created with the Circle Class.
    private static int circleCounter = 0; // counts the number of created Circles
    // Each object created using the Circle template has its own variables below, (x,y, colour, radius).
    private int x = 0; // only methods inside this class can access this variable.
    private int y = 0; // only methods inside this class can access this variable.
    private String colour = "Grey";
    private int radius = 1;
    
    /**
     * Circle constructor : 
     * 
     * @param a the x coordinate of the center of the circle
     * @param b the y coordinate of the center of the circle
     */
    public Circle(int a,int b) //Notice there is NO return type for a class constructor.
    {
        x=a;
        y=b;
        circleCounter++;
    }
    
    /**
     * Circle constructor: (Having two constructors for Circle Class illustrates the idea of method overloading)
     * 
     * @param a the x coordinate of the center of the circle
     * @param b the y coordinate of the center of the circle
     * @param rad the radius of the circle
     * @param col the colour of the circle
     */
    public Circle(int a,int b, int rad, String col)//Notice there is NO return type for a class constructor.
    {
        x=a;
        y=b;
        radius = rad;
        colour = col;
        circleCounter++;
    }
    
    /**
     * This provides the x coordinate of the circle
     * @return the x coordiante of the circle.
     */
    public int getX(){
        return x;
    }
    
    /**
     * This sets the x coordinate of the circle
     * @param num the new value for the x coordinate of the circle.
     */
    public void setX(int num){
        x = num;
    }
    
    /**
     * This provides the y coordinate of the circle
     * @return the y coordiante of the circle.
     */    
    public int getY(){
        return y;
    }
    /**
     * This sets the y coordinate of the circle
     * @param num the new value for the y coordinate of the circle.
     */
    public void setY(int num){
        y = num;
    }
    
    /**
     * This provides the radius of the circle
     * @return the radius of the circle.
     */
    public int getRadius(){
        return radius;
    }
    
    /**
     * This sets the radius of the circle
     * @param num the new value for the radius of the circle.
     */
    public void setRadius(int num){
        radius = num;
    }
    /**
     * This sets the colour of the circle
     * @param num the new value for the colour of the circle.
     */  
    public void setColour(String colour){
        // the keyword "this" followed by the dot "." operator allows you to specify which variable you intend to use.
        this.colour = colour;    
    }    
    /**
     * This gets the colour of the circle
     * @return String the current value for the colour of the circle.
     */ 
    public String getColour(){
        return colour;
    }
}
