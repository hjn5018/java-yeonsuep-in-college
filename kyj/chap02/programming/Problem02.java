package programming;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		int input;

		System.out.print("정수를 입력하세요: ");
		Scanner in = new Scanner(System.in);
		input = in.nextInt();

		System.out.printf("%d의 제곱은 %d", input, input * input);
	}
}
