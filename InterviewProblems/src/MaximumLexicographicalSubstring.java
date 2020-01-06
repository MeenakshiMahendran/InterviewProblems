/* Need to find the maximum substring which has a lexicographic/alphabetical higher value
 * 
 */

public class MaximumLexicographicalSubstring {
	
	public static String findMax(String str) {
		
		String maxStr="";
		
		for(int i=0;i<str.length();i++) {
			if(maxStr.compareTo(str.substring(i))<=0) {
				maxStr=str.substring(i);
			}
		}
		
		return maxStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The maximum lexicographical substring is - "+findMax("abaca"));
	}
}
