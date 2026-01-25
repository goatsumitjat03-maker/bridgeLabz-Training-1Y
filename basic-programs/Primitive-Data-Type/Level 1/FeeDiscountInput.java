import java.util.Scanner;
public class FeeDiscountInput{
    public static void main(String[] args){
	   Scanner input = new Scanner(System.in);
	   System.out.print("enter the cource fee(INR): ");
	   double fee = input.nextDouble();
	   
	   System.out.print("enter discount percentage: ");
	   double discountPercent = input.nextDouble();
	   
	   double discountAmount= (discountPercent/100)*fee;
	   double finalFee= fee - discountAmount;
	   
	   System.out.println("The discount amount is INR " + discountAmount + " final discount fee is INR " + finalFee);
	}
}	
	    
		