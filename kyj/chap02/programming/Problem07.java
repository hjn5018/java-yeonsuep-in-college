package programming;

import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {
		int input_num;
		boolean divided_4and5;
		boolean divided_4or5;
		boolean divided_4or5_not4and5;
		Scanner in = new Scanner(System.in);

		System.out.print("숫자(정수)를 입력하세요: ");
		input_num = in.nextInt();

		divided_4and5 = input_num % 4 == 0 && input_num % 5 == 0;
		divided_4or5 = (input_num % 4 == 0) || (input_num % 5 == 0);
		divided_4or5_not4and5 = divided_4or5 && !divided_4and5;

		System.out.println("4와 5로 나누어지는가?: " + divided_4and5);
		System.out.println("4또는 5로 나누어지는가?: " + divided_4or5);
		System.out.println("4또는 5로 나누어지지만 4와 5 모두로는 나누어지지 않는가?: " + divided_4or5_not4and5);
	}
}
/*
 * package programming;
 * 
 * import java.util.Scanner;
 * 
 * public class Problem07 { public static void main(String[] args) { int
 * inputNum; boolean isDivisibleBy4And5; boolean isDivisibleBy4Or5; boolean
 * isDivisibleBy4Or5ButNotBoth;
 * 
 * Scanner in = new Scanner(System.in);
 * 
 * System.out.print("숫자(정수)를 입력하세요: "); inputNum = in.nextInt();
 * 
 * isDivisibleBy4And5 = inputNum % 4 == 0 && inputNum % 5 == 0;
 * isDivisibleBy4Or5 = inputNum % 4 == 0 || inputNum % 5 == 0;
 * isDivisibleBy4Or5ButNotBoth = isDivisibleBy4Or5 && !isDivisibleBy4And5;
 * 
 * System.out.println("4와 5로 나누어지는가?: " + isDivisibleBy4And5);
 * System.out.println("4 또는 5로 나누어지는가?: " + isDivisibleBy4Or5);
 * System.out.println("4 또는 5로 나누어지지만, 4와 5 모두로 나누어지지는 않는가?: " +
 * isDivisibleBy4Or5ButNotBoth);
 * 
 * in.close(); // Scanner 닫기 } }
 */