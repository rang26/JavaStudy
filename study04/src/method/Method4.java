package method;

public class Method4 {
	
	// (고정적)메서드 정의
	public static void numbering(int limit) { 
		
		int i = 0;
		while (i < limit) {
			System.out.println(i);
			i++;
			
		}
	}
	
	// 메서드 호출
	public static void main(String[] args) {
		
		numbering(5);
		numbering(2);
		
	}

}
