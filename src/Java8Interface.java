
public interface Java8Interface {

	int x = 12;

	void show();

	default void display() {

		System.out.println("default method of interface");

	}

	static void print(String str) {

		System.out.println("Static method of interface:" + str);

	}

}
//There is no compile time error

