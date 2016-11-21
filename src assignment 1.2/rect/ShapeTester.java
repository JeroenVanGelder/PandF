package rect;

public class ShapeTester 
{

	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle();
		Square skwere = new Square();

		Shape squareAdapter = new SquareAdapter(skwere);
		
		int x = 11;
		int y = 12;
		int height = 111;
		int width = 112;
		
		System.out.println("Rect");
		rect.display(x, y, width, height);
		
		System.out.println("Square");
		skwere.display(width, height, x, y);
		
		System.out.println("SquareAdapter");
		squareAdapter.display(x, y, width, height);
	}

}
