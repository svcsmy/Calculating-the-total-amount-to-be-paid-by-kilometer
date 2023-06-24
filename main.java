import java.util.Scanner;

public class main {

 public static void main(String[] args) {
	
//Calculating the total amount to be paid by kilometer
	 
Scanner scanner = new Scanner(System.in);

 System.out.println("How much does your car burn per kilometer? (Example: 0.32)");
 double cost = scanner.nextDouble();
 
 System.out.println("How many kilometers did you travel with your car?");
 int km = scanner.nextInt();
 
 System.out.println("Total amount you have to pay: " + (cost *km ));
 

	
	
 }
}
