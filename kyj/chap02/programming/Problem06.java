package programming;

import java.util.Scanner;

public class Problem06 {
	public static void main(String[] args) {
		// C = 5/9 * (F-32)
		double F;
		double C;
		Scanner in = new Scanner(System.in);

		System.out.print("화씨온도(ºF)를 입력하세요: ");
		F = in.nextInt();

		C = 5.0 / 9.0 * (F - 32);
		System.out.printf("섭씨온도(ºC): %.1f", C);
	}
}
