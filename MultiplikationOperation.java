package lab42;

public class MultiplikationOperation implements Operation{

	@Override
	public String symbol() {
		// TODO Auto-generated method stub
		return "*";
	}

	@Override
	public int width(int xAxis, int yAxis) {
		int width = 0;
		width = String.valueOf(xAxis * yAxis).length() + 1;
		return width;
	}

	@Override
	public int evaluate(int x, int y) {
		// TODO Auto-generated method stub
		return (x*y);
	}

}
