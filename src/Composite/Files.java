package Composite;

public abstract class Files {
	String fileName;
	public Files(String name)
	{
		this.fileName = name;
	}
	
	abstract public void add(Files file);
	
}
