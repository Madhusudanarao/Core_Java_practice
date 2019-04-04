
public class TestExpection extends RuntimeException{

	public static void main(String[] args) {
		throw new TestExpection();

	}

}


//if you extend Exception we have to throws or surround with try and catch