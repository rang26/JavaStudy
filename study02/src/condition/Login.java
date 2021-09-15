package condition;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		String id = args[0];
		
		if (id.equals("egoing")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
		
	}

}
