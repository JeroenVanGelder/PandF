package builderClasses;

import java.util.List;

public interface FileBuilder 
{

	public void buildFileName(String name);
	
	public void buildFileExtension();
	
	public void buildFileData(List data);
	
	public File getFile();
}
