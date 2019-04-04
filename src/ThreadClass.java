
public class ThreadClass {
	public static void main(String[] args) {
	    new ThreadClass().doSomething();
	  }

	  public void doSomething(){
	    int i=5;
	    Thread t = new Thread(new Runnable(){
	      public void run(){
	        for(int j=0;j<=i;j++){
	          System.out.print(" "+j);
	        }
	      }
	    });
	    t.start();
	  }

}
