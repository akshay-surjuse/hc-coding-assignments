package com.humancloud.sum_of_largest_three_numbers;

//"Given an array of integers, find the sum of the three largest numbers.	"

public class SumOfLargestThreeNumbers 
{
	public static void main(String[] args) throws Exception
	{
		int[] x = {1, 1, 2, 4, 5, 5, 3, 3};
		int sum = sumOfLargestThreeNumbers(x);
		System.out.println(sum);
	}
	
	//1st Approach
	
	/*public static int sumOfLargestThreeNumbers(int[] nums) throws Exception{
		if(nums.length!=0 && nums.length>=3){
			int max = nums[0];
			int second = nums[0];
			int third = nums[0];
			
			if(nums.length==3){
				int sum = 0;
				for (int i = 0; i < nums.length; i++) {
					sum = sum + nums[i];
				}
				return sum;
			}
			else{
				for(int i=0; i<nums.length; i++){
					if(nums[i]>max){
						max = nums[i];
					}
				}
				
				for (int i = 0; i < nums.length; i++) {
					if(nums[i]>second){
						if(nums[i]<max){
							second = nums[i];
						}
					}
				}
				
				for (int i = 0; i < nums.length; i++) {
					if(nums[i]>third){
						if(nums[i]<second){
							third = nums[i];
						}
					}
				}	

				return max+second+third;
			}
		}else{
			throw new Exception("Array is empty or there must be atleast three elements in an array");
		}
	}*/
	
	
	//2nd Approach
	
	public static int sumOfLargestThreeNumbers(int[] nums) throws Exception{
		if(nums.length!=0 && nums.length>=3){
			if(nums.length==3){
				int sum = 0;
				for (int i = 0; i < nums.length; i++) {
					sum = sum + nums[i];
				}
				return sum;
			}else{
				int first = nums[0];
				int second = nums[0];
				int third = nums[0];
				
				for (int i = 0; i < nums.length; i++) {
					if(nums[i]>first){
						third = second;
						second = first;
						first = nums[i];
					}
					else if(nums[i]>second && nums[i]<first){
						third = second;
						second = nums[i];
					}
					else if(nums[i]>third && nums[i]<second){
						third = nums[i];
					}
				}
				
				return first + second + third;
			}
		}else{
			throw new Exception("Either Array is empty or Array length is less than three");
		}
	}
}
