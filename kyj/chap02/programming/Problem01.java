package programming;

public class Problem01 {
	public static void main(String[] args) {
		int height = 6;
		for (int i = 1; i <= height; i++) {
			for (int j = height - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//
//import java.util.Scanner;
//
//public class TreePattern {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("트리 높이 입력: ");
//        int height = scanner.nextInt();
//        
//        for (int i = 1; i <= height; i++) {
//            // 공백 출력 (왼쪽 정렬)
//            for (int j = height - i; j > 0; j--) {
//                System.out.print(" ");
//            }
//            // 별 출력
//            for (int j = 0; j < (2 * i - 1); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        scanner.close();
//    }
//}
