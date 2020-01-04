import java.util.HashMap;
import java.util.Map;

/*Question:
 * We need to calculate the telephone bill in cents. The input is a String of format:
 * 
 * 00:05:08,900-800-700
 * 00:04:17,800-700-600
 * 00:01:01,800-700-600
 * 
 * If mins > 5 , then mins * 150 cents . Eg - if 05:01, then (5+1)*150
 * If min < 5, then seconds*3 cents
 * 
 * Additional Offer - the amount for the phone number with the highest talk time is reduced from the bill 
 */
public class TelephoneBill {
	
	public static int calculateBill(String s) {
		
		String arr[]=s.split("\n");
		int longest=0;
		String longestPhone=s.substring(9,20);
		
		int cents=0;		
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			String phone=arr[i].substring(9,20);
			int mins=Integer.parseInt(arr[i].substring(3,5));			
			int seconds=Integer.parseInt(arr[i].substring(6,8));						
			int sec=(mins*60)+seconds;
			
			if(map.containsKey(phone)) {
				int secMap=map.get(phone);
				sec=sec+secMap;
				if(sec>longest) {
					longest=sec;
					longestPhone=phone;
				}
			}	
			map.put(phone,sec);						
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String phone=entry.getKey();
			int secs=entry.getValue();
			
			if(!phone.equalsIgnoreCase(longestPhone)) {
				int min=secs/60;
				int se=secs%60;
				
				if(min>5) {
					if(se>0) {
						cents=cents+((min+1)*150);
					}
					else {
						cents=cents+(min*150);
					}
				}
				else {
					cents=cents+(secs*3);
				}
			}
		}
		return cents;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="00:05:08,900-800-700\n00:04:17,800-700-600\n00:01:01,800-700-600";
		System.out.println(calculateBill(s));
		
	}

}
