//Using the Static method for interface from java 8


import java.util.Scanner;
public interface Circle {
	String status=new String();
	void typeOfColor(String c);  
	static void display() {
		System.out.println("The colors are 1. Green  2. Red  3.Grey ");
	}
}

  
class Color implements Circle{  
    public void typeOfColor(String c){
    	switch(c) {
    		case "Green": System.out.println("Active");
    					  break;
    		case "Red":   System.out.println("Break");
    		              break;
    		case "Grey":  System.out.println("Inactive");
    		              break;
    		default: System.out.println("");
    	}
    	
    }

	  
}  
  
class TestingColor{  
	public static void main(String args[]){  
		Circle d=new Color();
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("When a user log on to the app, it displays a color representing status.Enter the color? ");
		
		
		Circle.display();
		String status=s.nextLine();
		d.typeOfColor(status);
		}}


//Output
/*
When a user log on to the app, it displays a color representing status.Enter the color? 
The colors are 1. Green  2. Red  3.Grey 
Red
Break
*/
