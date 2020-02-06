
public class LeastPrimeNumber {
	
	public static int[] find(int a[], int b[]) {
		
		int result[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			int rem=a[i]%b[i];
			
			if(rem==0) {
				result[i]=0;
			}
			else if (b[i]-rem==1) {
				result[i]=1;
			}
			else {
				int add=b[i]-rem;
				
				if(!isPrime(add)) {
					
					while(!isPrime(add)) {
						add=add+b[i];
					}
				}
				result[i]=add;
				
			}
		}
		
		return result;
	}

	private static boolean isPrime(int rem) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		for(int i=1;i<=rem;i++) {
			if(rem%i==0)
				count++;
			if(count>2) {
				return false;
			}
		}
		
		if(count==2) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {25,7};
		int b[]= {11,5};
		
		int result[]=find(a,b);
		
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}

	}

}
