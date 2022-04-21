//This a Circle class

package za.ac.wsu.s219325561;		//Package named za.ac.wsu.s219325561

/*
 * @author 219325561
 */

public class Circle {
	//Properties 
	private float radius;		// Radius of circle
	private int x;				// x coordinates of the circle
	private int y;				// x coordinates of the circle
	
	//methods
	public float calculateArea(){
		/*
		 * if the radius is great or equal to 0 
		 * then return the formula of the Area
		 * and compute the Area
		 * else return 0
		 */
		if(radius >= 0) {						
			return (float) (radius*radius*3.14);  
		}
		
		else {
			return 0;
		}
		
	}
	public float calculateCircumference(){
		/*
		 * if the Circumference is great or equal to 0 
		 * then return the formula of the Circumference
		 * and compute the Circumference
		 * else return 0
		 */
		if(radius >= 0) {
			return (float) (2*3.14*radius);
		}
		else {
			return 0;
		}
	}
	public float calculateDiameter(){
		/*
		 * if the Diameter( is great or equal to 0 
		 * then return the formula of the Diameter
		 * and compute the Diameter
		 * else return 0
		 */
		if(radius >= 0) {
			return (float) (2*radius);

		}
		else {
			return 0;
		}
		
	}
	
	//Setter
	public void setRadius(float radius) {
		this.radius = radius;			//Sets the value of the radius
	}
	
	public void setX(int x) {
		this.x = x;						//Sets the value of the x
	}
	
	public void setY(int y) {
		this.y = y;						//Sets the value of the y
	}
	
	//Getter
	public float getRadius() {
		return radius;					//Sets the value of the radius to call a function 
	}

	public int getX() {
			return x;					//Sets the value of the x to call a function 
	}

	public int getY() {
		return y;						//Sets the value of the y to call a function 
	}
}
