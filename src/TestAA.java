import java.io.IOException;

class AA {
	public AA(){
		System.out.println("AA Parent");
	}
	public  void AAA(){
		System.out.println("AAA");
	}
}

class BA extends AA {
	public BA(){
		System.out.println("BA Parent");
	}
	public void BBB() {
		System.out.println("BBB");
	}
	public void AAA()  {
		System.out.println("AAA");
	}
}

class CA extends BA {
	public CA(){
		System.out.println("CA Parent");
	}
	public void CCC() {
		System.out.println("CCC");
	}
}

class DA extends CA {
	public DA(){
		System.out.println("DD Parent");
	}
	public void DDD() {
		System.out.println("DDD");
	}

	public void AAA() {
		System.out.println("DDD");
	}
}

public class TestAA {

	public static void main(String[] args) {
		DA da = new DA();
		//AA a1 = new DA();
		//a1.AAA();
	}

}
