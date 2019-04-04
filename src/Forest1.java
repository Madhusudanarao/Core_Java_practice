
class Tree{
	
}
class Pine extends Tree{
	
}

class Oak extends Tree{
	
}
public class Forest1 {

	
	
	public static void main(String[] args) {
		Tree  tree = new Pine();
		 if(tree instanceof Tree){
			System.out.println("Tree");
		} else if(tree instanceof Oak){
			System.out.println("Oak");
		}else if(tree instanceof Pine){
				System.out.println("Pine");
			}else{
			System.out.println("oops");
		}

		String s ="hello";
		 Object o=s;
		 if(o.equals(s)){
			 System.out.println("o");
		 }else{
			 System.out.println("s");
		 }
		
		 if(s.equals(o)){
			 System.out.println("s1");
		 }else{
			 System.out.println("o1");
		 }
		 Character lastCharector =  s.charAt(s.length() - 1);
		 System.out.println("asd " +lastCharector);
		 
		 
	}

}
