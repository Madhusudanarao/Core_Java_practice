public class OverLoading {
	public void f1(Integer i) {
		System.out.println("inside 1");
	}

	public void f1(int i) {
		System.out.println("inside 2");
	}

	public void m1(String s) {
		System.out.println("S " + s);
	}

	public void m1(Integer i) {
		System.out.println("S " + i);
	}

	public void m1(char[] ch) {
		System.out.println("S " + ch);
	}

	public void m1(Object o) {
		System.out.println("S " + o);
	}

	public static void main(String args[]) {
		new OverLoading().f1(8);
		// new OverLoading().m1(null);
	}
}