import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithOutSplit {
	public static void main(String[] args) {
		String s = "D00000000055027285";
		String sub = s.substring(1, 18);
		System.out.println(sub);
		longestSubString("JAVACONCEPTOFTHEDAY");
		String s1 = "MAD";
		String s2 =  "SUD";
				
		
			s1 = s1 + s2;
        
        s2 = s1.substring(0, s1.length()-s2.length());
        
        s1 = s1.substring(s2.length());
        System.out.println(" S2" +s2+"  s1"+s1);

	}

	private static void longestSubString(String input) {
		String longestSubString  = null;
		int longestSubStringLen = 0;
		char inputArray[] = input.toCharArray();
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		for(char ch : inputArray){
			if(!charMap.containsKey(ch)){
				charMap.put(ch,1);
			}else{
				charMap.clear();
			}
			
			if(charMap.size() >  longestSubStringLen){
				longestSubString = charMap.keySet().toString();
				longestSubStringLen = charMap.keySet().size();
			}
		}
		System.out.println("longestSubString "+longestSubString);

	}

}
