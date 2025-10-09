public class Program1{
	public static double maxSubArr(int [] nums, int k){
		int n = nums.length;
		int sum = Integer.MIN_VALUE;
		for(int i = 0; i< k ; i++){
			sum += nums[i];
		}
		int maxSum = sum;
		for(int i = k; i< n; i++){
			sum -= nums[k];
			sum += nums[i-k];
			maxSum = Math.max(maxSum, sum);
		}
		return (double) maxSum/k;
	}
	public static void main(String[] args){
		int nums [] = {1,12,-5,-6,50,3};
		int k = 4;
		System.out.println(maxSubArr(nums,k));
	}
}