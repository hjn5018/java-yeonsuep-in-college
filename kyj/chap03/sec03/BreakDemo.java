package sec03;

public class BreakDemo {
	public static void main(String[] args) {
		int i = 1, j = 5;
		
		while (true) {
			System.out.print(i++); // 1234
			if (i >= j)
				break;
		}
	}
}
