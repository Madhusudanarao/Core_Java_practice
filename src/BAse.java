
public class BAse {

		public static void main(String... args) {
			System.out.println("we can run java program without String[]");
			String s1 = "abc";
	        String s2 = "abc";
	        String s3 = new String("abc");
	        String s4 = new String("abc");
	        System.out.println("s1 == s2 ? "+(s1==s2)); //true
	        System.out.println("s1 == s3 ? "+(s1==s3)); //false
	        System.out.println("s1 == s4 ? "+(s1==s4)); //false
	        System.out.println("s3 == s4 ? "+(s3==s4)); //false
	        System.out.println("s1 equals s3 ? "+(s1.equals(s4))); //true
	        System.out.println("s2 equals s4 ? "+(s2.equals(s4))); //true
	        System.out.println("s1 equals s2 ? "+(s1.equals(s2))); //true
	        System.out.println("s3 equals s4 ? "+(s3.equals(s4))); //true
	        //new BAse().foo(null);
	        
	        
		}
		
			public  void foo(String s) {
	       	 	System.out.println("String");
	       	 }

	       	 public void foo(StringBuffer sb){
	       		 System.out.println("StringBuffer");
	       	 }

		int m1() {
			return 0;
		}
}
