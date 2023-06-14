package Day_1;

public class maximum_sum_subarray {
    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long sum=0;
        long maxSum=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum<0) sum=0;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 7, -4, 3, 2, -10, 9, 1};

        System.out.println(maxSubarraySum(arr, arr.length));
    }
}
