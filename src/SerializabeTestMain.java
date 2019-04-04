import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializabeTestMain {

	public static void main(String[] args) {
		SerializabeTest employee = new SerializabeTest();
	        employee.setName("Ashintha");
	        employee.setNumberl(10);
	        FileOutputStream fout = null;
			try {
				fout = new FileOutputStream("/users/krishantha/employee.obj");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	        ObjectOutputStream oos = null;
			try {
				oos = new ObjectOutputStream(fout);
			} catch (IOException e) {
				e.printStackTrace();
			}
	        try {
				oos.writeObject(employee);
			} catch (IOException e) {
				e.printStackTrace();
			}
	        try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	        System.out.println("Process complete"); 
		
	}

}
