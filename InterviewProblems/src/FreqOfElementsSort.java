/*
 * Sort the array elements in descending order according to their frequency of occurrence
 * sort single occurrence elements in ascending order
 */
public class FreqOfElementsSort {
	
	public static void sort(int arr[]) {
		
		int freq[]=new int[101];
		int hi=0;
		
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
			if(freq[arr[i]]>hi) {
				hi=freq[arr[i]];
			}
		}
		
		for(int j=hi;j>=1;j--) {
			for(int k=0;k<freq.length;k++) {
				if(freq[k]==j) {
					for(int x=0;x<j;x++) {
						System.out.print(k+" ");
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2, 2, 3, 4, 5, 12, 2, 3, 3, 3, 12};
		sort(arr);
		
	}

}
