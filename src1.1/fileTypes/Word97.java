package fileTypes;

import java.util.List;

import builderClasses.File;
import builderClasses.FileBuilder;


public class Word97 implements FileBuilder {
	
	private File file;
	
	public Word97()
	{
		this.file = new File();
	}

	public void buildFileExtension() 
	{
		file.setExtension(".wrd97");		
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