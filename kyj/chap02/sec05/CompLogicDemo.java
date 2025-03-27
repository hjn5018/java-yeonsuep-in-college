package sec05;

public class CompLogicDemo {
	public static void main(String[] args) {
		int x = 0, y = 1;
		System.out.println((x < 1) || (y-- < 1)); // true || short circuit으로 실행 x
		System.out.println("x = " + x + ", y = " + y); // x = 0, y = 1
		
		x = 0;
		y = 1;
		System.out.println((x < 1) | (y-- < 1)); // true || false
		System.out.println("x = " + x + ", y = " + y); // x = 0, y = 0 
	}
}
