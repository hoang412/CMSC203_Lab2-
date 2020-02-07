import java.util.Scanner;
public class SphereVolume {
public static void main (String [] args) {
	Scanner input = new Scanner (System.in);
	double diam, r, v;
	System.out.println("This program will calculate the result of a mathematical formula");
	System.out.print("Enter the diameter of a sphere: ");
	//Ask user to enter diameter
	diam = input.nextDouble();
	
	//Calculate the radius
	r = diam/2;
	
	//Calculate the volume of sphere
	v = (Math.PI)*(Math.pow(r, 3))*4/3;
	System.out.println("The volume is " + v);
	
}
}
