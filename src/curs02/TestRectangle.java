package curs02;

public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle(4, 6);
		rectangle1.calculateArea();
		System.out.println(rectangle1.calculateArea());
		
		Rectangle rectangle2 = new Rectangle(5, 10);
		rectangle2.calculateArea();
		System.out.println(rectangle2.calculateArea());
		
		Rectangle rectangle3 = new Rectangle(7, 3);
		rectangle3.calculateArea();
		System.out.println(rectangle3.calculateArea());

	}

}
