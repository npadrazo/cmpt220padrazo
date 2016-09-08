import java.util.Scanner;
public class prob3 {
	public static void main (String[] Strings) {
		double gratuityRate, gratuityTotal, total, subtotal;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rates: ");
		subtotal = input.nextDouble();
		gratuityRate = input.nextDouble();
		gratuityTotal = subtotal * gratuityRate * .15;
		total = subtotal + gratuityTotal; 
		System.out.print("The gratuity is $" + gratuityTotal + " and the total is $" + total);
	}
}