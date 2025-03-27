package sec05;

import java.util.Scanner;

public class ChallengeTask2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int input = in.nextInt();
		
		if (input % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
	}
}
