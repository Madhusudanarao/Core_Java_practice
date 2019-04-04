import java.util.Arrays;
import java.util.HashSet;

public class CommonElements {
	public static void main(String[] args) {
		String st1[] = {"Madhu","Uday","Jiknk","IOSHS"};
		 String st2[] = {"Madhu","Uday","ASDD","IOAAASHS"};
		 HashSet hs = new HashSet();
		 for(int i = 0; i<st1.length; i++){
			  for(int j=0; j<st2.length; j++){
				  if(st1[i] == st2[j]){
					  hs.add(st1[i]);
					  
				  }
			  }
		 }
		 System.out.println(hs);
		Integer[] i1 = {1, 2, 3, 4, 5, 4};
        Integer[] i2 = {3, 4, 5, 6, 7, 4};
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
        set1.retainAll(set2);
        System.out.println(set1); 
		 
	}

 
}
