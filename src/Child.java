
class Parent {
	void m1(){
		System.out.println("m1 Parent");
	}
	void test() {
		System.out.println("Parent");
	}
}

public class Child extends Parent {
	/*void m2(){
		System.out.println("m2 Child");
	}*/
	void m1(){
		System.out.println("m1 Child");
	}
	
	void test() {
		System.out.println("child");
	}

	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child();
		//p.m1();
		//p.test();
		pc.test();
		pc.m1();
		//p.m2();
		c.m1();
		//c.m2();

	}

}
