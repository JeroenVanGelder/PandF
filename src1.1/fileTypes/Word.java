package fileTypes;

import java.util.List;

import builderClasses.File;
import builderClasses.FileBuilder;


public class Word implements FileBuilder {
	
	private File file;
	
	public Word()
	{
		this.file = new File();
	}

	public void buildFileExtension() 
	{
		file.setExtension(".XML");		
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