package practice;

public class Practice14 {
	public static void main(String[] args) {
		int x = 1, y = 2;
		System.out.println(x++); // 1
		System.out.println(++x + y--); // 3 + 2 = 5
		System.out.println(++x / 3 + x * ++y); // 4 / 3 + 4 * 2 = 1.333...(X) + 8 = 9.333...(X)
												// 4 / 3 -> 1 (c, c++, java에서 정수 나눗셈은 몫만 취한다.)

	}
}
