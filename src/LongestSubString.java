
public class LongestSubString {

	public static void main(String[] args) {
		String s = "I am from as we can from above";
		String longest = "";
		int maxLength = 0;
		String arr[] = s.split("a");
		for (int i = 1; i < arr.length; i++) {
			System.out.println("asd " + arr[i]);
			if (maxLength < arr[i].length()) {
				maxLength = arr[i].length();
				longest = arr[i];
			}

		}
		System.out.println(longest);
		;
	}

}
