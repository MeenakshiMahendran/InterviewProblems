
public class MinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,7,-9,8,3};
		System.out.println("Min sum is - "+findingMinSum(arr));
	}

	private static int findingMinSum(int[] arr) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int minPositive=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				sum=sum+arr[i];
			}
			else {
				if(arr[i]<minPositive) {
					minPositive=arr[i];
				}
			}
		}
		
		if(sum<0) {
			return sum;
		}
		else {
			return minPositive;
		}
		
	}

}
