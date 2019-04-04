import java.util.HashMap;
import java.util.Map.Entry;

public class SocketMerchant {
	static int sockMerchant(int n, int[] ar) {
		int counter = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		for (int i = 0; i <= ar.length - 1; i++) {
			if (!map.containsKey(ar[i])) {
				map.put(ar[i], 1);
			} else {
				map.put(ar[i], map.get(ar[i]) + 1);

				if (map.get(ar[i]) % 2 == 0) {
					if (!map1.containsKey(ar[i])) {
						map1.put(ar[i], 1);
					} else {
						map1.put(ar[i], map1.get(ar[i]) + 1);
					}
				}
			}

		}
		for (Entry<Integer, Integer> entry : map1.entrySet()) {
			counter = counter + entry.getValue();
		}

		return counter;

	}
	public static void main(String[] args) {
		int ar[] = {10 ,20, 20, 10, 10, 30 ,50, 10, 20};
		System.out.println(sockMerchant(9,ar));
		String s =  "madhu";
		System.out.println(s.substring(3));
		char ch = s.charAt(0);
		String chs = Character.toString(ch).toUpperCase();
		System.out.println(s.replace(s.charAt(0), s.charAt(0)));
				
	}

}
