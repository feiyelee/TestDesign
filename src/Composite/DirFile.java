package Composite;

import java.util.*;

public class DirFile extends Files{
	public DirFile(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	List<Files> files = new ArrayList<Files>();
	public void add(Files file)
	{
		files.add(file);
	}
}
