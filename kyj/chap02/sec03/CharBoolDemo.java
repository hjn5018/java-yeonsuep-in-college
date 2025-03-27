package sec03;

public class CharBoolDemo {
	public static void main(String[] args) {
		char ga1 = '가';
		char ga2 = '\uac00';
		
		boolean cham = true;
		boolean geojit = false;
		
		System.out.println(ga1);
		System.out.println((int)ga1);
		System.out.println(ga2);
		System.out.println(++ga2);
		System.out.println(cham + "가 아니면 " + geojit + "입니다.");
		char n1 = '한';
		char n2 = '진';
		char n3 = '용';
		
		System.out.println();
		
		System.out.println("한 = \\ud55c");
		System.out.println("진 = \\ud55c");
		System.out.println("용 = \\ud55c");
//		String s1 = Integer.toHexString(n1);
//		System.out.println(n1 + " = \\u" +s1);
//		String s2 = Integer.toHexString(n2);
//		System.out.println(n2 + " = \\u" +s1);
//		String s3 = Integer.toHexString(n3);
//		System.out.println(n3 + " = \\u" +s1);
	}
}
