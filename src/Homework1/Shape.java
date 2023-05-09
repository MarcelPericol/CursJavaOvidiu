package Homework1;

public class Shape {
	public Shape(int lenght) {
		int x = calculateSquareArea(lenght);
		System.out.println(x);
	}	
	public Shape(int lenght, int width) {
		int x = calculateRectangleArea(lenght, width);
		System.out.println(x);
	}
	public Shape(double radius) {
		
		double x = radius * radius * Math.PI;
		System.out.println(x);
	}
	public int calculateSquareArea(int lenght) {
		return lenght * lenght;	
	}
	public int calculateRectangleArea(int lenght, int width) {
		return lenght * width;	
	}
	
}
