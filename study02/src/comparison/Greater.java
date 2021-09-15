package comparison;

public class Greater {

	public static void main(String[] args) {
		
		// false
		System.out.println(10 > 20);
		//true
		System.out.println(10 > 2);
		// false
		System.out.println(10 > 10);
		
		// false
		System.out.println(10 >= 20);
		//true
		System.out.println(10 >= 2);
		//true
		System.out.println(10 >= 10);
		
		String a = "Hello world";
		String b = new String("Hello world");
		// false
		System.out.println(a == b);
		//true (자바는 String 등호로 할 수 없고, equals를 써야한다.)
		System.out.println(a.equals(b));
	}

}
