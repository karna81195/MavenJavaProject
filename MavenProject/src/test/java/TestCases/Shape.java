package TestCases;

// execute Shape class as java Application
public class Shape {
	double width;
	double height;
	Shape(double width, double height){
		this.width = width;
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5,6);
		Triangle tri = new Triangle(4,6);
		System.out.println("Area of Rectangle: "+ rect.area());
		System.out.println("Area of Triangle: "+ tri.area());
	}

}
class Rectangle extends Shape  {
	Rectangle(double width, double height){
		super(width, height);
	} 
	
	//Area of Rectangle
	public double area() {
		return (getWidth()*getHeight());
	}
}
class Triangle extends Shape  {
	Triangle(double width, double height){
		super(width, height);
	}
	//Area of Triangle
	public double area() {
		return (getWidth()*getHeight())/2;
	}

}

