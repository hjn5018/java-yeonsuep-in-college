package sec03;

public class CastDemo {
	public static void main(String[] args) {
		int i;
		double d;
		byte b;
		
		i = 7 / 4;
		System.out.println(i); // 1
		d = 7 / 4;
		System.out.println(d); // 1.0
		d = 7 / (double) 4;
		System.out.println(d); // 1.75
		
//		i = 7 / (double) 4;
		
		i = 300;
		if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
			System.out.println("byte 타입으로 변환할 수 없습니다.");
		else
			b = (byte) i;
		
	}
}
