package palindrome_string_check_without_temp;

/*"Write a function to check if a given string is a palindrome without using a temporary string."
   Input: "abba"
   Output: TRUE*/

public class PalindromeStringCheck 
{
	public static void main(String[] args) 
	{
		String str1 = "abba";
		String palindromeCheck = palindromeCheck(str1);
		System.out.println(palindromeCheck);
	}
	
	public static String palindromeCheck(String str1){
		
		//1st Approach
		
		/*StringBuilder sb = new StringBuilder(str1);
		sb.reverse();
		sb.toString();
		if(str1.equals(sb.toString())){
			return "TRUE";
		}
		return "FALSE";*/
		
		//2nd approach
		
		int last = str1.length()-1;
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i)==str1.charAt(last)){
				count++;
				last--;
			}
		}
		if(count==str1.length()){
			return "TRUE";
		}else{
			return "FALSE";
		}
	}
}
