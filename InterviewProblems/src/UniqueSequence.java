import java.util.Scanner;

/*
 * need to find number of unique subsequences of "abcdefghijklmnopqrstuvwxyz"
 * in given input string
 * for eg: input "abcdefghijklmnopqrstuvwxyzz" has 2 subsequence occurences
 */

public class UniqueSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++){
			int n=sc.nextInt();
			String str=sc.next();
			System.out.println(findSubSeq(n,str));
		}
	}

	private static int findSubSeq(int n, String str) {
		// TODO Auto-generated method stub
		
		int count[]=new int[27];
		int out=0;
		int c=1;
		
		if(n<26) {
			return 0;
		}
		
		for(int i=0;i<n;i++) {
			int thisChar=str.charAt(i);
			int index=thisChar-96;
			count[index]++;
		}
		
		for(int j=1;j<=26;j++) {
			if(count[j]==0) {
				return 0;
			}
			else {
				if(count[j]>1) {
					c=c*count[j];
				}
				out=out+count[j];
			}
		}
		
		
			return c;
		
	}

}
