import java.lang.reflect.Constructor;

public class SingleTonImplTest {

	public static void main(String[] args) {
		SingleTonTest st = SingleTonTest.getInstance();
		SingleTonTest st1 =null;
		System.out.println(st);
		try {
			Constructor ct = SingleTonTest.class.getDeclaredConstructor();
			ct.setAccessible(true);
				st1 = (SingleTonTest)ct.newInstance();
				System.out.println(st1);
		} catch (Exception e) {
		}
	}

}
