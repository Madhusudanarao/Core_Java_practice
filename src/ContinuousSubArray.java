import java.util.Arrays;

public class ContinuousSubArray {
	private static int number = 9;
	public static void main(String[] args) {
		finndContinuousSubArray(new int[]{10,2,3,4,5,67});
		
	}
	private static void finndContinuousSubArray(int[] arr) {
		//Initializing sum with the first element of the inputArray
		 
        int sum = arr[0];
 
        //Initializing starting point with 0
 
        int start = 0;
 
        //Iterating through inputArray starting from second element
 
        for (int i = 1; i < arr.length; i++)
        {
            //Adding inputArray[i] to the current 'sum'
 
            sum = sum + arr[i];
 
            //If sum is greater than inputNumber then following loop is executed until
 
            //sum becomes either smaller than or equal to inputNumber
 
            while(sum > number && start <= i-1)
            {
                //Removing starting elements from the 'sum'
 
                sum = sum - arr[start];
 
                //Incrementing start by 1
 
                start++;
            }
 
            //If 'sum' is equal to 'inputNumber' then printing the sub array
 
            if(sum == number)
            {
                System.out.println("Continuous sub array of "+Arrays.toString(arr)+" whose sum is "+number+" is ");
 
                for (int j = start; j <= i; j++)
                {
                    System.out.print(arr[j]+" ");
                }
 
                System.out.println();
            }
        }
   }
}
