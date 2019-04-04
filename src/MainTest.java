
public class MainTest {
	public static void doPrint(Parent b){
		b.test();
		b.m1();
	}
	public static void main(String[] args) {
		String s1 = "prmptaccessionCode";
		System.out.println(s1.length());
		System.out.println(s1.substring(0, 17));
		
		Parent p = new Parent();
		Child c = new Child();
		Parent pc = new Child();
		/*p.m1();
		p.test();
		pc.test();
		pc.m1();
		p.m2();
		c.m1();
		c.m2();*/
		doPrint(p);
		//doPrint(c);
		doPrint(pc);
	}

}
