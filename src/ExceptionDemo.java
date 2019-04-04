import java.io.FileNotFoundException;

class ExceptionSuper {
	public void m1() throws Exception {
		System.out.println("Sasmita");
	}
}

class ExceptionSub extends ExceptionSuper {
	public void m1() throws FileNotFoundException {
		System.out.println("Sasmita");
		try {
			super.m1();
		} catch (Throwable e) {

		}
	}
}

public class ExceptionDemo extends ExceptionSuper {
	public static void main(String[] args) {
		System.out.println();
	}
}
