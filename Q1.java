import java.util.*;
/*
 Program: Write a java program that prompts the user to enter the minutes (e.g., 1 billion),
  		  and displays the number of years and days for the minutes. For simplicity, assume 
  		  a year has 365 days.
 Author name: SWASTIK MULLICK
 Registration no.: 2241013379
 */
public class Q1 
{
	public static void main(String args[])
	{
		Scanner j=new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int min=j.nextInt(),year=min/(365*24*60),day=(min/(24*60))-(year*365);
		System.out.print(min+" minutes is approximately "+year+" year(s) and "
				+day+" day(s).");
		j.close();
	}
}
