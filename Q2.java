import java.util.*;
/*
 Program: If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. 
 		  (This is essentially the definition of the / and % operators for integers.) 
 		  Write a java program that asks the user how many eggs she has and then tells 
 		  the user how many dozen eggs she has and how many extra eggs are left over. 
 		  A gross of eggs is equal to 144 eggs. Extend your program so that it will tell 
 		  the user how many gross, how many dozen, and how many left over eggs she 
 		  has. For example, if the user says that she has 1342 eggs, and then your program 
 		  would respond with Your number of eggs is 9 gross, 3 dozen, and 10.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class Q2 
{
	public static void main(String args[])
	{
		Scanner o=new Scanner(System.in);
		System.out.print("Enter the number of eggs you have: ");
		int tegg=o.nextInt(),gross=tegg/144,dozen=(tegg/12)-((gross*144)/12),left=(tegg%12);
		System.out.print("\nYour number of eggs is "+gross+" gross, "+dozen+" dozen, and "+left);
		o.close();
	}
}
