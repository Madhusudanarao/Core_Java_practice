
public class LeaderOfTheArray {
	public static void main(String[] args) {
		LeaderOfTheArray la = new LeaderOfTheArray();
		int arr[]  = new int[]{10,34,5,15,9,2};
		
		int n = arr.length;
		la.printLeaders(arr,n);
		
	}

	private void printLeaders(int[] arr, int n) {
		// TODO Auto-generated method stub
		int maxFromRight = arr[n-1];
		System.out.println("maxFromRight" +maxFromRight);
		for(int i = n-2; i>=0; i--){
			if(maxFromRight < arr[i]){
			maxFromRight = arr[i] ;
			System.out.println("" +maxFromRight);
			}
			
		}
	}
	

}
