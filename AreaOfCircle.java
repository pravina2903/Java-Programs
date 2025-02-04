
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {

		double area,radius;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter area of circle : ");
		
		radius=sc.nextDouble();
		sc.close();
		
		area= Math.PI * radius * radius;
		System.out.println("Area of circle is : " +area);
		
		
	}

}
