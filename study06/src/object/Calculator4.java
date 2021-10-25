package object;

class Calculator01 {

	int left, right;
	
	public void setOperands(int left, int right) {
		// this.는 Calculator01 class를 정의 할때 인스턴스 자신을 의미한다.
		// this.left는 Calculator01 class의 left이다.
		// this.이 붙지 않은 것은 매개변수이다.
		this.left = left;
		this.right = right;
		
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
	
}

	public class Calculator4 {
		
		public static void main(String[] args) {
			
			Calculator01 c1 = new Calculator01();
			c1.setOperands(10,20);
			c1.sum();
			c1.avg();
			
			Calculator01 c2 = new Calculator01();
			c2.setOperands(20, 40);
			c2.sum();
			c2.avg();
		}
	}