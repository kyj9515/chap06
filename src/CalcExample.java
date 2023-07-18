
public class CalcExample {
	static class Calc {
		int n1;
		int n2;
		
		Calc(int n1, int n2) {
			this.n1 = n1;
			this.n2 = n2;
		}
		
		int add() {
			
			return n1 + n2;
		}
		int add(int n3) {
			return add() + 3;
		}
		int add(int n3, int n4) {
			return add(n3) + n4;
		}
		int add(int ...nums) {
			
			return 0;
		}
		int sum(int ...nums) {
			int sum = 0;
			for (int n:nums)
				sum +=n;
			return sum + n1 + n2;
		}
		
		void print() {
			
		}
	}

	public static void main(String[] args) {
		Calc c1 = new Calc(10, 20);
		Calc c2 = new Calc(3, 5);
		
		System.out.println(c1.add() + 10);
		
		System.out.println(c2.sum(10, 5, 6, 9, 10));
		System.out.println(c2.sum(10, 5));
		System.out.println(c2.sum(10, 5, 6, 9, 10, 10 ,11, 12, 13, 14, 15, 16));
		
		int[] nums = {1,2,3,4};
		System.out.println(c2.sum(nums));
		
		System.out.printf("%d\n", 10);
		System.out.printf("%d %d\n", 10,20);
		System.out.printf("%d %d %d\n", 10, 20, 30, 40, 50);
		
		System.out.println(10);
		System.out.println(10.5);
		System.out.println("Hello");
		}

	}


