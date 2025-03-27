package programming;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		int second_input;
		int hour;
		int minute;
		int second;

		Scanner in = new Scanner(System.in);

		System.out.print("초 단위 정수를 입력하세요 : ");
		second_input = in.nextInt();

		hour = second_input / 3600;
		minute = second_input / 60 % 60; // 1. second to minute 2. minute % 60
		second = second_input % 60;

		System.out.print(hour + "시간 " + minute + "분 " + second + "초");
	}
}

//package programming;
//
//import java.util.Scanner;
//
//public class Problem04 {
//	public static void main(String[] args) {
//		int second_input; // 입력된 초
//		int hour, minute, second; // 시, 분, 초 변수
//
//		Scanner in = new Scanner(System.in);
//
//		System.out.print("초 단위 정수를 입력하세요 : ");
//		second_input = in.nextInt();
//
//		// 시간 계산
//		hour = second_input / 3600; // 전체 초를 3600(1시간)으로 나눈 몫
//		minute = (second_input % 3600) / 60; // 남은 초를 60(1분)으로 나눈 몫
//		second = second_input % 60; // 남은 초
//
//		// 결과 출력
//		System.out.println(hour + "시간 " + minute + "분 " + second + "초");
//
//		in.close(); // Scanner 닫기
//	}
//}
