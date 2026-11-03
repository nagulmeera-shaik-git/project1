package project1;

public class StdTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 3; i++) {
		//	System.out.println(SingletonDemo.getSingletonObject().toString());
			System.out.println(SingletonDemo.getSingletonObject().hashCode());
		}
	}

}
