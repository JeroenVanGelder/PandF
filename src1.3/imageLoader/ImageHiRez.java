package imageLoader;

public class ImageHiRez implements Image 
{
	private String image;
	
	public ImageHiRez(String path)
	{
		image = loadImage(path);
	}
	
	private String loadImage(String path)
	{
		return "image is te vinden op : " + path;
		
	}
	
	public void showImage() 
	{
		System.out.println("Image tonen : ");
		System.out.println("- " + image);
	}

}
