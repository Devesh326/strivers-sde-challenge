package Day_2;

public class Missing_Number {
    public static int missingNumber(int[] nums) {

        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }

        int curr = 0;
        for(int i=1; i<=nums.length; i++){
            curr += i;
        }

        return curr - sum;

    }

    public static void main(String[] args) {
        int num[] = {3,0,1};

        System.out.println(missingNumber(num));
    }
}
