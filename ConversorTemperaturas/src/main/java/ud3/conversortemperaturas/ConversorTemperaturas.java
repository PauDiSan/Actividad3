package ud3.conversortemperaturas;

import java.util.Scanner;
public class ConversorTemperaturas {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("\n\tBienvenido al conversor de temperaturas\n");
	System.out.println("Enter value which you want to convert : ");
	float value = scan.nextFloat();
	System.out.println("  Enter 1 for Celsius to Fahrenheit converter....");
	System.out.println("  Enter 2 for Fahrenheit to Celsius converter....");
	System.out.println("\nEnter your value here...   ");
	int ans = scan.nextInt();
	if (ans == 1) {
		float value1 = (float) ((value*(1.8))+32);
		System.out.println("Your conversion is here.. "+value1+"ºF");
		}
	if (ans == 2) {
			float value2 = (float) (value-32);
			float value3 = (float) (value2*(5)/9);
			System.out.print("Your conversion is here.. "+value3+"ºC");
		}
	System.out.println("\n\tThank You!!..");
	}
}
