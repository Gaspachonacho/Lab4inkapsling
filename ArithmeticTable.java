package lab42;

// Säger att yAxis och xAxis är en int

public class ArithmeticTable{
	int xAxis;
	int yAxis;
	Operation op;
	
	// "Länkar" in 
	public ArithmeticTable(int xAxis, int yAxis, Operation op) {
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.op = op;
	}
	
	// printar hela metoden, aka Table-n
	public void print() {
		
		int width = op.width(xAxis, yAxis);
		//////////////////////////////////////////////////////////////
		
		////////////////////////////////////////////////////////////////
		
		System.out.printf("%" + width + "s", op.symbol());
		System.out.print(" |");
		
		for (int x = 0; x <= xAxis; x++) {
			System.out.printf("%" + width + "d", x);
		}
		
		System.out.println("");
		
		System.out.printf("%" + width + "s", "-");
		System.out.print("-+");
	
		int amountBindestreck = 0;
		String bindestreck = "";
		
		while (amountBindestreck != width) {
			bindestreck = bindestreck + "-";
			amountBindestreck = String.valueOf(bindestreck).length();
		}
		for (int a = 0; a <= xAxis; a++ ) {
			System.out.printf("%" + width + "s", bindestreck);
		}
		
		System.out.println("");
		//Printar endast ut dem fula linjerna

		// En for loop som printar ut varje räknesett beroende på vad man valde för operator
		
		// Använder sig av width för att bestämma avståndet mellan varje "resultat".
		for (int y = 0; y <= yAxis; y++) {
			System.out.printf("%" + width + "d", y);
			System.out.print(" |");
			
			for(int x = 0; x <= xAxis; x++) {
				if (op.symbol().equals("/") && y == 0) {
					System.out.printf("%" + width + "s", "-");
				}else {
				System.out.printf("%" + width + "d", op.evaluate(x,y));
				}
				}
			System.out.println("");
		}
		
	}

}
