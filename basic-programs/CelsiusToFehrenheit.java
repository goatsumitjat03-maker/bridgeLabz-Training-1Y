import java.util.Scanner;
public class CelsiusToFehrenheit {
    public static void main(String[] args){
	  Scanner sc= new Scanner(System.in);
	  System.out.print("Enter temp in Celsius: ");
	  double celsius = sc.nextDouble();
	  double fehrenheit =(celsius* 9/5)+32;
	  System.out.println("temp in Fahrenheit: " + fehrenheit);
    }
}	