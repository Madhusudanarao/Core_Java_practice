
public class MaxDiffBwTwoElements {
static int maxDiff =0;
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,9,11,23,4};
		
		for(int i =0; i < arr.length; i++){
			for(int j = i+1; j< arr.length; j++){
				if(maxDiff < arr[j]-arr[i]){
					maxDiff = arr[j] - arr[i];
				}
			}
			
		}
		System.out.println(maxDiff);

	}

}
