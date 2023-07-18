
public class CarExample {
	static class Car {
	
	}
	
	public static void main(String[] args) {
		String str = "Hello";
		String str2 = new String("Hello");
		
		Car c1 = null;
		Car c2 = new Car();	// 인스턴스 화
		Car c3 = new Car();
		c2 = null;
	}

	public static void main2(String[] args) {
		System.out.println("Hello OOP!");
	}

}
