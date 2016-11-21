package fileTypes;

import java.util.List;

import builderClasses.File;
import builderClasses.FileBuilder;


public class PDF implements FileBuilder {
	
	private File file;
	
	public PDF()
	{
		this.file = new File();
	}

	public void buildFileExtension() 
	{
		file.setExtension(".PDF");		
	}

	public void buildFileName(String name) {
		file.setFileName(name);	
	}
	public void buildFileData(List data) {
		file.setFileData(data);
	}


	public File getFile(){
		return this.file;
	}
}