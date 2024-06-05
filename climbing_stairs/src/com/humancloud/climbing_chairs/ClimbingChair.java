package com.humancloud.climbing_chairs;

//"Given a number of steps n, write a function to determine the number of distinct ways to climb to the top, taking 1 or 2 steps at a time."


public class ClimbingChair 
{
	// 1st Approach using fibonacci
	
 /* public static int numberOfDistinctWaysToClimb(int n){
		if(n==1 || n==2){
			return n;
		}
		else{
			int step1 = 1;
			int step2 = 2;
			int step3 = step1 + step2;
			
			for(int i = 3; i<n; i++){
				step1 = step2;
				step2 = step3;
				step3 = step1 + step2;
			}
			return step3;
		}
	}*/
	
	//2nd Approach using Recursion
	
	public static int numberOfDistinctWaysToClimb(int n){
		if(n==1 || n==2){
			return n;
		}
		else{
			int recursiveCall1 = numberOfDistinctWaysToClimb(n-1);
			int recursiveCall2 = numberOfDistinctWaysToClimb(n-2);
			return recursiveCall1 + recursiveCall2;
		}
	}
	
	public static void main(String[] args) 
	{
		int numberOfDistinctWaysToClimb = numberOfDistinctWaysToClimb(4);
		System.out.println("Number of distinct ways to climb given stairs are: " + numberOfDistinctWaysToClimb);
	}
}
