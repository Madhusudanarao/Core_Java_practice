import java.util.LinkedHashSet;

public class TestClass {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("T");
		lhs.add("U");
		lhs.add("t");
		lhs.add("u");
		System.out.println(lhs);
	}

}
