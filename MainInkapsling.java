package lab42;

import java.util.Scanner;

public class MainInkapsling{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// Skannar in x och y värdet
		System.out.print("x: ");
		int xAxis = scan.nextInt();
		
		System.out.print("y: ");
		int yAxis = scan.nextInt();
		
		// Ber användaren vilket räknesätt de vill använda
		System.out.println("Välj räknesätt: +-/*");
		scan.nextLine();
		String raknesatt = scan.nextLine();
		
		scan.close();
		
		ArithmeticTable table = null;
		
		switch (raknesatt) {
		case "+":
			Operation add = new AdditionOperation();
			table = new ArithmeticTable(xAxis, yAxis, add);
			break;
		case "-":
			Operation sub = new SubtractionOperation();
			table = new ArithmeticTable(xAxis, yAxis, sub);
			break;
		case "*":
			Operation multi = new MultiplikationOperation();
			table = new ArithmeticTable(xAxis, yAxis, multi);
			break;
		case "/":
			Operation div = new DivisionOperation();
			table = new ArithmeticTable(xAxis, yAxis, div);
			break;
		}
		table.print();
	
		
	}
}
