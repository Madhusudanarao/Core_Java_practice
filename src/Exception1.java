import java.io.IOException;

public class Exception1 {

	public static void main(String[] args) {
		System.out.println("Main");

	}
	public void m1()throws IOException{
		try{
			int x= 10/0;
		}catch(Exception e){
			
		}
	}

}
