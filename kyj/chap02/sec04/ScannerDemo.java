package sec04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt(); // 10
		int y = in.nextInt(); // 20
		
		// 10 * 20은 200입니다.
		System.out.printf("%d * %d은 %d입니다.\n", x, y, x * y);
	}

}
