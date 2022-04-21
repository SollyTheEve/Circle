import za.ac.wsu.s219325561.Circle; 

public class CircleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(); 	// creates an object c1 circle 1
		c1.setRadius(-1);			// Set radius to object c1
		c1.setX(0);					// Set x to object c1
		c1.setY(0);					// Set y to object c1
		
		Circle c2=new Circle(); 	// creates an object c2 circle 2
		c2.setRadius(0);			// Set radius to object c2
		c2.setX(1);					// Set x to object c2
		c2.setY(2);					// Set y to object c2
		
		Circle c3=new Circle(); 	// creates an object c3 circle 3
		c3.setRadius(3);			// Set radius to object c3
		c3.setX(3);					// Set x to object c3
		c3.setY(4);					// Set y to object c3
		
		System.out.println("Radius	 	: "+c1.getRadius());									//Retrieve Radius that you set in object c1 and print the radius
		System.out.println("x - coordinates : "+c1.getX());										//Retrieve x that you set in object c1 and print the x
		System.out.println("y - coordinates : "+c1.getY());										//Retrieve y that you set in object c1 and print the y
		System.out.println();
		System.out.println("Radius		 : "+c2.getRadius());									//Retrieve Radius that you set in object c2 and print the radius
		System.out.println("x - coordinates : "+c2.getX());										//Retrieve x that you set in object c2 and print the x
		System.out.println("y - coordinates : "+c2.getY());										//Retrieve y that you set in object c2 and print the y
		System.out.println();
		System.out.println("Radius		 : "+c3.getRadius());									//Retrieve Radius that you set in object c3 and print the radius
		System.out.println("x - coordinates : "+c3.getX());										//Retrieve x that you set in object c3 and print the x
		System.out.println("y - coordinates : "+c3.getY());										//Retrieve Radius that you set in object c3 and print the y
		
		System.out.println("==================================================");
		System.out.println("		Circle 1");
		System.out.println("==================================================");
		
		System.out.println("Area		: "+c1.calculateArea());								//Print the computed Area  
		System.out.println("Circumference	: "+c1.calculateCircumference());					//Print the computed Circumference 
		System.out.println("Diameter	: "+c1.calculateDiameter());							//Print the computed Diameter 
		System.out.println();
		System.out.println("==================================================");
		System.out.println("		Circle 2");
		System.out.println("==================================================");
				
		System.out.println("Area		: "+c2.calculateArea());								//Print the computed Area  
		System.out.println("Circumference	: "+c2.calculateCircumference());					//Print the computed Circumference 
		System.out.println("Diameter	: "+c2.calculateDiameter());							//Print the computed Diameter 
		System.out.println();
		System.out.println("==================================================");
		System.out.println("		Circle 3");
		System.out.println("==================================================");
		
		System.out.println("Area		: "+c3.calculateArea());								//Print the computed Area  
		System.out.println("Circumference	: "+c3.calculateCircumference());					//Print the computed Circumference 
		System.out.println("Diameter	: "+c3.calculateDiameter());							//Print the computed Diameter 
	}

}
