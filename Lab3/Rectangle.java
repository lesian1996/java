package Lab3;

import java.util.Scanner;

public class Rectangle extends Shape {
	public Double length ;
	public Double width ;
	Scanner scan = new Scanner(System.in);
	
	public Rectangle () {
		super();
	}
	
	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}
	
	public Rectangle ( Double length , Double width) {
		super ();
		this.setLength(length) ;
		this.setWidth(width) ;
	}
	public Rectangle ( String color, Double length, Double width ) {
		super( color ) ;
		this.length = length ;
		this.width = width ; 
	}
	
	public void setDataRectangle() {
		System.out.println("Rectangle : ");
		System.out.print("Color = ");
		this.color = scan.nextLine();
		System.out.print("Length = ");
		this.length = scan.nextDouble();
		System.out.print("Width = ");
		this.width = scan.nextDouble();
	}
	public Double areaRectangle() {
		return length * width ;
		
	}	
	
	@Override
	public  String toString() {
		System.out.print("Rectangle : " + "\n" +
	            "color : " + getColor() + "\n"
	            + "length = " + getLength() + "\n"
	            + "width = " + getWidth() + "\n"
	            + "area = " + areaRectangle() + "\n" ) ;
	 return "<3";
	}

	
}
