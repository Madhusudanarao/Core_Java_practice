
public class ThreadDemo extends Thread{
	
	public void run(){
		for(int i = 0; i<5; i++){
			System.out.println(i);
		}
	}

	public void start(){
			System.out.println("inside start");
	}
	public static void main(String[] args) {
		ThreadDemo tdm = new ThreadDemo();
		tdm.start();
		tdm.run();
	}

}
