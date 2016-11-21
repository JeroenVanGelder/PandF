package rect;

public class SquareAdapter implements Shape  
{
	private Square shape;

	public SquareAdapter(Square squ)
	{
		this.shape = squ;
	}
	
	public void display(int x, int y, int width, int height) 
	{
		shape.display(width, height, x, y);
	}
	
}
