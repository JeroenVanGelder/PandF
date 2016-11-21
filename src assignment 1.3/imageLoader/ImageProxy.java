package imageLoader;

public class ImageProxy implements Image 
{
	private String imagePath;
	
	private Image proxifiedImage;
	
	public ImageProxy(String path)
	{
		this.imagePath = path;
	}

	public void showImage() 
	{
		
		proxifiedImage = new ImageHiRez(imagePath);
		
		proxifiedImage.showImage();
		
	}



}
