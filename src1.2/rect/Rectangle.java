package rect;

public class Rectangle implements Shape
{

	public Rectangle(){}; 
	
	public void display(int x, int y, int width, int height) 
	{
		System.out.println("Be there or be Rectangle");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("width : " + width);
		System.out.println("height : " + height);
	};

}
