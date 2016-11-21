package builderClasses;

import java.util.List;


public class FileDirector 
{
	private FileBuilder fileBuilder;
	
	FileDirector(FileBuilder filebuilder)
	{
		this.fileBuilder = filebuilder;
	}
	
	public File getFile()
	{
		return fileBuilder.getFile();
	}
	
	public void buildFile(String name, List data)
	{
		this.fileBuilder.buildFileExtension();
		this.fileBuilder.buildFileName(name);
		this.fileBuilder.buildFileData(data);
		
	}
}
