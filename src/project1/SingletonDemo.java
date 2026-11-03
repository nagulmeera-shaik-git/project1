package project1;

public class SingletonDemo {
	
	private static SingletonDemo std;
	
	private SingletonDemo() {
		System.out.println("singleton Demo object");
	}
	
	public static synchronized SingletonDemo getSingletonObject() {
		if(std== null) {
			std= new SingletonDemo();
		}
		return std;
	}
}
