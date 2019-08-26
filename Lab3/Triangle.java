package Lab3;

import java.util.Scanner;

public class Triangle extends Shape {
	public Double base ;
	public Double height ;
	Scanner scan = new Scanner(System.in);
	
	public Triangle () {
		super();
	}
	
	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Triangle ( Double base , Double height) {
		super ();
		this.setBase(base) ;
		this.setHeight(height) ;
	}
	public Triangle ( String color, Double base, Double height ) {
		super( color ) ;
		this.base = base ;
		this.height = height ; 
	}
	
	public void setDataTriangle() {
		System.out.println("Triangle : ");
		System.out.print("Color = ");
		this.color = scan.nextLine();
		System.out.print("Base = ");
		this.base = scan.nextDouble();
		System.out.print("Height = ");
		this.height = scan.nextDouble();
	}
	public Double areaTriangle() {
		return  base * height / 2 ;
		
	}	
	
	@Override
	public  String toString() {
		System.out.print("Triangle : " + "\n" +
	            "color : " + getColor() + "\n"
	            + "base = " + getBase() + "\n"
	            + "height = " + getHeight() + "\n"
	            + "area = " + areaTriangle() + "\n" ) ;
	 return "<3";
	}

	
}
