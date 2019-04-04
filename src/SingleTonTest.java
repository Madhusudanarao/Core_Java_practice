
public class SingleTonTest implements Cloneable{
	private static SingleTonTest st = null;

	private SingleTonTest() {

	}

	public static SingleTonTest getInstance() {
		if (st == null) {
			synchronized (SingleTonTest.class) {
				if (st == null) {
					st = new SingleTonTest();
				}
			}
		}
		return st;
	}

}
