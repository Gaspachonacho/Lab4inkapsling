package lab42;

public interface Operation {
	public String symbol();   
	public int width(int xAxis, int yAxis);   
	public int evaluate(int a, int b);
}
