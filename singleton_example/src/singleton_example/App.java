package singleton_example;

public class App {

	
	private static App app;
	
	
	private App () {
		//no other class can create object for this class
		
		System.out.println("singleton class here ;  ");
	}
	
	public static App getInstance() {
		
		if(null == app) {
			app = new App();
		}
		
		return app;
	}
	
}
