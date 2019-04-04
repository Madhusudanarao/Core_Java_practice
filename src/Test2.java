
class Father {
 public Father(String str) {
  System.out.println("Created a Father " +str);
 }
 public Father(){
	 
 }
}
public class Test2 extends Father {
 private Test2(String str) {
  System.out.println("Inside child");
 }
 public static void main(String args[]) {
  super("Hi");
  new Test2("Bye");
 }
}
