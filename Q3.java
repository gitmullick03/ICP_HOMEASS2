import java.util.*;
/*
 Program: Write a java program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of a triangle 
 		  and displays its area. The formula for computing the area of a triangle is s = (side1 + side2 + side3)/2; 
 		  area=√𝑠∗(𝑠−𝑎)∗(𝑠−𝑏)∗(𝑠−𝑐)
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class Q3 
{
	public static void main(String args[])
	{
		Scanner w=new Scanner(System.in);
		System.out.print("For triangle ▲ABC, enter the requisite co-ordinates of each vertex:-\n");//Alt+30 for ▲
		System.out.print("1.  For point A-\n    Enter x1: ");double x1=w.nextDouble();
		System.out.print("    Enter y1: ");double y1=w.nextDouble();
		System.out.print("\n2.  For point B-\n    Enter x2: ");double x2=w.nextDouble();
		System.out.print("    Enter y2: ");double y2=w.nextDouble();
		System.out.print("\n3.  For point C-\n    Enter x3: ");double x3=w.nextDouble();
		System.out.print("    Enter y3: ");double y3=w.nextDouble();
		double a=Math.pow(Math.pow((int)(x3-x2),2)+Math.pow((int)(y3-y2),2),(1.0/2)),
		b=Math.pow(Math.pow((int)(x3-x1),2)+Math.pow((int)(y3-y1),2),(1.0/2)),
		c=Math.pow(Math.pow((int)(x2-x1),2)+Math.pow((int)(y2-y1),2),(1.0/2)),
		s=(a+b+c)/2,
		area=Math.pow((s*(s-a)*(s-b)*(s-c)),(1.0/2));
		System.out.print("The area of the triangle is "+area);
		w.close();
	}
}
