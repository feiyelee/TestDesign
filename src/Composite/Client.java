package Composite;

public class Client {
	public static void main(String args[])
	{
		Files dir = new DirFile("root");
		Files secdir = new DirFile("secroot");
		Files thidir = new DirFile("thiroot");
		Files rootfile = new RealFile("rootfile");
		Files secfile = new RealFile("secfile");
		
		
	}
}
