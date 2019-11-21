package lab42;

public class AdditionOperation implements Operation{

	public String symbol() {
		// TODO Auto-generated method stub
		return "+";
	}

	public int width(int xAxis, int yAxis) {
		int width = 0;
		width = String.valueOf(xAxis + yAxis).length() + 1;
		return width;
	}

	public int evaluate(int x, int y) {
		// TODO Auto-generated method stub
		return (x+y);
	}

}
