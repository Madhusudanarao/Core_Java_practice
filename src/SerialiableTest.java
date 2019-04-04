import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo1 {
	int y = 20;
}

class SerTest extends Demo1 implements Serializable{
	int x = 10;
}

public class SerialiableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerTest st = new SerTest();
		FileOutputStream fos = new FileOutputStream("C://Madhu//abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(st);
		
		FileInputStream fis = new FileInputStream("C://Madhu//abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerTest st1 = (SerTest)ois.readObject();
		System.out.println(st1.x);
		System.out.println(st1.y);
		

	}

}
