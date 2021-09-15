package arithmetic;

public class Division {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		// 정수 나누기 정수는 정수
		System.out.println(a/b);
		// 실수 나누기 실수는 실수
		System.out.println(c/d);
		// 실수가 하나라도 있으면 값은 실수이다.
		System.out.println(a/d); 

	}

}
