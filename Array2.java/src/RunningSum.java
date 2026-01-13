public class RunningSum {
    public void RunningSum(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;

        }
    }

