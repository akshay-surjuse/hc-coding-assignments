package two_sum_problem;

//Given an array of integers and a target sum, return the indices of the two numbers that add up to the target sum
/*Input: "array -> [2, 7, 11, 15]
          target sum - 9	"
*/
//output: 0 1
public class TwoSumProblem 
{
	public static void main(String[] args) 
	{
		int[] nums = {2, 7, 11, 15};
		int targetSum = 9;
		int[] returnIndices = returnIndices(nums, targetSum);
		System.out.println(returnIndices[0] + " " + returnIndices[1]);
	}
	
	public static int[] returnIndices(int[] nums, int targetSum){
		int[] indices = new int[2];
		for(int i=0; i<nums.length; i++){
			for (int j = 0; j < nums.length; j++) {
				if(nums[i] + nums[j] == targetSum){
					indices[0] = j;
					indices[1] = i;
				}
			}
		}
		return indices;
	}
}
