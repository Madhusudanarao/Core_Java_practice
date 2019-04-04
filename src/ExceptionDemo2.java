import java.io.IOException;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		ExceptionDemo2 em = new ExceptionDemo2();
		try {
			em.check();
		} catch (Exception e) {
			System.out.println("Catch block 1");
		}

	}

	void check() {
		try {
			throw new Exception();
		} catch (IOException ioe) {
			System.out.println("Catch block 2");
			//throw new Exception();
		} catch (Exception ioe) {
			System.out.println("Catch block 3");
		}finally {
			System.out.println("finally block 3");
		}

	}

}
