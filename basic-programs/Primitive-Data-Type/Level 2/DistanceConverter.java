import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter distance in feet: ");
		double distanceInFeet = sc.nextDouble();
		
		double yards = distanceInFeet/3;
		double miles = yards / 1760;
		
		System.out.println("Distance in yards = " + yards);
		System.out.println("Distance in miles = " + miles );
		
    }
}	
		