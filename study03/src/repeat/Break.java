package repeat;

public class Break {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
			if(i == 5) // 구문이 한줄일 경우 중괄호는 안 써주어도 된다. 
				
				break;
			
			System.out.println("Coding Everybody" + i);
			
		}
	}

}
