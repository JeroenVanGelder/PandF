package builderClasses;

import java.util.ArrayList;
import java.util.List;

import fileTypes.*;

public class BuilderTester 
{

	public static void main(String[] args) 
	{
		String htmlName = "website";
		List htmlData = new ArrayList();
		htmlData.add("regel1");
		htmlData.add("regel2");
		
		FileBuilder htmlFileBuilder = new HTML();
		
		FileDirector fileDirector = new FileDirector(htmlFileBuilder);
		
		fileDirector.buildFile(htmlName, htmlData);

		File htmlFile = fileDirector.getFile();
		
		System.out.println("File beschreven");
		System.out.println("html : " + htmlFile.getFileSpecs());
		
	}

}
