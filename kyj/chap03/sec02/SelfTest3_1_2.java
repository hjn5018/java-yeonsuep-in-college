package sec02;

public class SelfTest3_1_2 {
	public static void main(String[] args) {
		int x = 5;
		
		if (x > 0)
			System.out.println(x - 1); // 4
		if (x > 1)
			System.out.println(x - 2); // 3
		if (x < 0)
			System.out.println(x - 3); // 실행 X
	}
}
