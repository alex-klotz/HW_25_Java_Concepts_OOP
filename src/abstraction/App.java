package abstraction;

public class App extends AbstractClass {
	void method() {
		System.out.println("This is the method from App");
	}
	public static void main(String next[]) {
		new App().method();
	}

}
