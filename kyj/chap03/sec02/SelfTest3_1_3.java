package sec02;

public class SelfTest3_1_3 {
	public static void main(String[] args) {
		int x = 5;
		
		if (x > 0)
			System.out.println(x - 1); // 4
//		else (x > 1) // else if를 사용해야한다.
//		    System.out.println(x - 2);
		else if (x > 1)
			System.out.println(x - 2);
	}
}
