import java.util.Scanner;
public class KmTOMiles{
   public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
	  System.out.print("Enter distance in KM: ");
	  double Kilometers = sc.nextDouble();
	  double miles = Kilometers*0.621371;
	  System.out.println("Distance in miles: " + miles);
	}
}	