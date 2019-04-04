
public class PairsOfElementsInArray {

	public static void main(String[] args) {
		findPairs(new int[] { 1, 3, 5, 6, 8, 2 });

	}

	private static void findPairs(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 8) {
					System.out.println(arr[i] + "," + arr[j]);
				}
			}
		}

	}

}
