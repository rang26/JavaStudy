package method;

public class Return4 {
	
	public static String[] getMembers() {
		String[] members = { "최진혁", "최유빈", "한이람" };
		return members;
	}
		
	
	public static void main(String[] args) {
		String[] members = getMembers();
		System.out.println(members[0]);
		System.out.println(members[1]);
		System.out.println(members[2]);
		System.out.println(members.length);
	}

}
