package programming;

import java.util.Scanner;

public class Problem03 {
	public static void main(String[] args) {
		int radius;
		int height;
//		double volumn;
		Scanner in = new Scanner(System.in);

		System.out.print("원기둥의 밑면 반지름은? ");
		radius = in.nextInt();
		System.out.print("원기둥의 높이는? ");
		height = in.nextInt();

//		volumn = 3.14 * radius * radius * height;
//		System.out.printf("원기둥의 부피는 %.1f", volumn);
		System.out.printf("원기둥의 부피는 %.1f", 3.14 * radius * radius * height);

	}
}
