package Singleton;

public class EasySingleton {
	private EasySingleton(){
		
	}
	
	private static EasySingleton singleton = null;
	
	public static  synchronized  EasySingleton getInstance()
	{
		if(singleton == null)
			singleton = new EasySingleton();
		return singleton;
	}
}
