package Polymorphism;

public class Child extends Parent {
	public void move() {
		System.out.println("Child class");
	}
	public void a() {
		this.move();
	}
	public void b() {
		super.move();
	}
	public static void add(int a, int b) {
		System.out.println(a + b + " :: 2 params");
	}
	public static void add(int a, int b, int c) {
		System.out.println(a + b + c + " :: 3 params");
	}
	public static void add(int a, int b, int c, int d) {
		System.out.println(a + b + c + d + " :: 4 params");
	}
	
	public static void main (String next[]) {
		// Overriding
		new Child().a();
		new Child().b();
		// Overloading
		add(3, 7);
		add(2, 7, 6);
		add(2, 7, 6, 5);
		
	}

}
