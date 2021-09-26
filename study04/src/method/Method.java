package method;

public class Method {
	
	// 메서드 정의
	public static void numbering() {
		
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
			
		}
	}
	
	// 메서드 호출
	public static void main(String[] args) {
		// 3번 호출 할때
		numbering();
		numbering();
		numbering();
		
	}

}
