package SampleShape;

import java.util.Scanner;

public class ShapeMain {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length:");
		int length = scan.nextInt();
		Shape obj = new Shape();
		obj.setLength(length);
		System.out.println("Enter width:");
		int width = scan.nextInt();
		obj.setWidth(width);
		System.out.println("Area of rectangle is:"+obj.CalculateArea());
		scan.close();
		
	}

}
