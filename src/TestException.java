class Test extends Exception { }
  
public class TestException {
   public static void main(String args[]) { 
	   String s= "Madhu";
	   String s1= "Madhu";
	   System.out.println(s==s1);
      try {
         throw new TestAA();
      }
      catch(TestAA t) {
         System.out.println("Got the Test Exception");
      }
      finally {
         System.out.println("Inside finally block ");
      }
  }
}

