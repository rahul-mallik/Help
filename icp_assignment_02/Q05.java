/*  Write a java program that reads the radius of a hemisphere and computes the surface area
	and volume using the following formulas:
	Surface Area of Hemisphere = 3 π r 2 . Volume of a hemisphere = (2/3)πr 3
	Where π is a constant whose value is equal to 3.14 approximately. “r” is the radius of the
	hemisphere. Hint: Use Math.PI.
	Here is a sample run:
	Enter the radius of the hemisphere: 7.0
	The surface area of the hemisphere is 461.814
	The volume area of the hemisphere is 718.377
*/





import java.util.Scanner;
public class Q05 {
	public static void main(String[] args) {
		Scanner kaishi= new Scanner(System.in);
		System.out.print("Enter the radius of the hemisphere:");
		double r = kaishi.nextDouble();
		double surf, vol , pi = Math.PI;
		
		surf = 3 * pi *(r*r);
		vol = (pi*(r*r*r))*2/3;
		System.out.println("The surface area of the hemisphere is " + surf);
		System.out.println("The volume area of the hemisphere is "+vol);
		
		
		
	}
}
