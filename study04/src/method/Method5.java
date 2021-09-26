package method;

public class Method5 {
	
	// (고정적)메서드 정의
	public static void numbering(int init, int limit) { 
		
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
			
		}
	}
	
	// 메서드 호출
	public static void main(String[] args) {
		
		numbering(1,5);
		numbering(3,5);
		
	}

}
