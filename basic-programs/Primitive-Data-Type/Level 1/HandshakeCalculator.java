import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Enter number of students: ");
	  int numberofStudents = sc.nextInt();
	  
	  int handshakes = (numberofStudents * (numberofStudents - 1)) / 2;
      System.out.println("Maximum number of handshakes among " + numberofStudents + " students is: " + handshakes);
    }
}	