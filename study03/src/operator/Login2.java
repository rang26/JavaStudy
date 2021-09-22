package operator;

public class Login2 {

	public static void main(String[] args) {
		
		 String id =  args[0];
		 String passwor =  args[1];
		 
		 if (id.equals("egoing")) {
			 
			if (passwor.equals("111111")) {
				
				System.out.println("right");
			
			} else {
				
				System.out.println("wrong");

			} // else
		} else {
			
			System.out.println("wrong");
			
		} // else
		 
	}

}
