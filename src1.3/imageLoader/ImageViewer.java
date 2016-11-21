package imageLoader;

public class ImageViewer 
{
	

	public static void main(String[] args) 
	{
		Image afbeelding1 = new ImageProxy("images/DogPicture1.jpx");
		Image afbeelding2 = new ImageProxy("images/CatWithHatPicture1.jpx");
		Image afbeelding3 = new ImageProxy("images/CatWithHatPicture2.jpx");
		
		afbeelding1.showImage();
		afbeelding2.showImage();
		afbeelding3.showImage();

	}

}
