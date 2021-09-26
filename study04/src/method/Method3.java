package method;

public class Method3 {
	
	// 메서드를 사용하지 않고, 반복문 중첩 사용(5번 반복)
	public static void main(String[] args) {
		
		int j = 0;
		
		while (j < 5) {
			
			int i = 0;
			
			while (i < 10) {
				System.out.println(i);
				i++;
				
			} // while (i < 10)
			
			j++;
			
		} // while (j < 5)
		
	} // main

} // class