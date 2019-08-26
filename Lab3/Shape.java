/**
 * 
 */
/**
 * @author Admin
 *
 */
package Lab3;

import java.util.Scanner;

public class Shape {
	public String color ;
	Scanner scan = new Scanner(System.in);
	
	public Shape() {
		super();
	}
	
	public Shape (String color) {
		super();
		this.color = color ;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		System.out.print("Color = ");
		this.color = scan.nextLine();
	}
	
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
}