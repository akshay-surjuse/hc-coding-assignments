package com.humancloud.most_frequent_character_in_string;

import java.util.HashMap;
import java.util.Map;

/*Given a string, find the character that appears the most frequently. If multiple characters have the same frequency, 
  return any one of them.
  Input : "abracadabra"
  Output: a
*/

public class MostFrequesthCharacterInString 
{
	
	public static Character findingFrequestCharacterInString(String str){
		if(str==null){
			throw new NullPointerException("String is null");
		}
		else{
			if(str.contains(" ")){
				String str1 = "";
				for(int i=0; i<str.length(); i++){
					if(str.charAt(i)!=' '){
						str1 = str1 + str.charAt(i);
					}
				}
				Map<Character, Integer> map = new HashMap<>();
				
				for(int i=0; i<str1.length(); i++){
					char ch = str1.charAt(i);
					if(map.containsKey(ch)){
						Integer value = map.get(ch);
						value = value + 1;
						map.put(ch, value);
					}else{
						map.put(ch, 1);
					}
				}
				Character max = str1.charAt(0);
				for(Character key : map.keySet()){
					if(map.get(key)>map.get(max)){
						max = key;
					}
				}
				return max;
			}
			
			else{			
				Map<Character, Integer> map = new HashMap<>();
				
				for(int i=0; i<str.length(); i++){
					char ch = str.charAt(i);
					if(map.containsKey(ch)){
						Integer value = map.get(ch);
						value = value + 1;
						map.put(ch, value);
					}else{
						map.put(ch, 1);
					}
				}
				Character max = str.charAt(0);
				for(Character key : map.keySet()){
					if(map.get(key)>map.get(max)){
						max = key;
					}
				}
				return max;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		String str = null;
		
		Character mostOccuredChar = findingFrequestCharacterInString(str);
		System.out.println(mostOccuredChar);
	}

}
