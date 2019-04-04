
class A1{
	public void m1(int... i){
		System.out.println("Parent");
	}
}
class B1 extends A1{
	public void m1(int i){
		System.out.println("Child");
	}
}
public class OverloadTest {

	public static void main(String[] args) {
		A1 a = new A1();
		a.m1(10);
		
		B1 b = new B1();
		b.m1(10);
		
		A1 ab = new B1();
		ab.m1(10);
		

	}

}
