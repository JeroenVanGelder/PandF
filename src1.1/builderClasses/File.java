package builderClasses;

import java.util.List;

public class File implements FileTemplate {

	private String extensie;
	private String naam;
	private List data;
	
	public void setExtension(String ext) 
	{
		this.extensie = ext;
	}

	public String getFileExtension()
	{
		return this.extensie;
	}
	public void setFileName(String name) 
	{
		this.naam = name;
	}
	
	public String getFileName()
	{
		return this.naam;
	}

	public void setFileData(List data) 
	{
		this.data = data;
		
	}
	
	public String getFileSpecs()
	{
		return this.naam + this.extensie;
	}


}
