import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SeperateZeorsfromNOnZeros {

	public static void main(String[] args) {
		//separeateZeros(new int[] { 10, 23, 0, 3, 0, 30, 0 });
		
		String str= "welcometojava";
		Set<String> stList  = new HashSet<String>();
		for (int i = 0; i < str.length()-1;) {
			   for (int j = i+3; j <= str.length()-1; j++) {
				   stList.add(str.substring(i,j));
			         i = i +1;
			  
			   }
		}
		System.out.println(stList);
	}

	private static void separeateZeros(int[] arra) {
		int counter = 0;
		for (int i = 0; i < arra.length; i++) {
			if (arra[i] != 0) {
				arra[counter] = arra[i];
				counter++;
			}

		}

		while (counter < arra.length) {
			arra[counter] = 0;
			counter++;

		}
		 System.out.println(Arrays.toString(arra));
	}

}
