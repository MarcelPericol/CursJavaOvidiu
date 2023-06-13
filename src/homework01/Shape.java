package homework01;

public class Shape {
	public Shape(int lenght) {
		//int x = calculateSquareArea(lenght);
		System.out.println(calculateSquareArea(lenght));
	}	
	public Shape(int lenght, int width) {
		//int x = calculateRectangleArea(lenght, width);
		System.out.println(calculateRectangleArea(lenght, width));
	}
	public Shape(double radius) {
		
		//double x = radius * radius * Math.PI;
		System.out.println(radius * radius * Math.PI);
	}
	public int calculateSquareArea(int lenght) {
		return lenght * lenght;	
	}
	public int calculateRectangleArea(int lenght, int width) {
		return lenght * width;	
	}
	
}
