package palindrome_number_check;

import java.util.Arrays;

/*Write a function to check if a given number is a palindrome. Additionally, print all palindrome numbers in a given array.
  121
  [123, 121, 454, 567]
*/

public class PalindromeNumberCheck 
{
	
	public static boolean checkPalindrome(int number){
		
		//1st Approach
		
		int raw = number;
		int reverse = 0;
		while(raw>0){
			reverse = reverse*10 + raw%10;
			raw = raw/10;
		}
		if(number==reverse){
			return true;
		}else{
			return false;
		}
		
		//2nd Approach
		
//		int raw = number;
//		String strNum = String.valueOf(raw);
//		String reverseStr = "";
//		for(int i=strNum.length()-1; i>=0; i--){
//			reverseStr = reverseStr + strNum.charAt(i);
//		}
//		Integer reverseNum = Integer.valueOf(reverseStr);
//		if(number==reverseNum){
//			return true;
//		}else{
//			return false;
//		}
	}
	
	public static void printPalindrome(Integer[] numbers){
//		for(int i=0; i<numbers.length; i++){
//			int raw = numbers[i];
//			int reverse = 0;
//			while(raw>0){
//				reverse = reverse*10 + raw%10;
//				raw = raw/10;
//			}
//			if(reverse==numbers[i]){
//				System.out.println(numbers[i]);
//			}
//		}
		
		//using Java 8
		
		Arrays.stream(numbers).forEach(num -> {
			int raw = num;
			int reverse = 0;
			while(raw>0){
				reverse = reverse*10 + raw%10;
				raw = raw/10;
			}
			if(reverse==num){
				System.out.println(num);
			}
		});
	}
	
	public static void main(String[] args)
	{
		boolean checkPalindrome = checkPalindrome(121);
		System.out.println(checkPalindrome);
		
		Integer[] nums = {123, 121, 454, 567};
		printPalindrome(nums);
	}

}
