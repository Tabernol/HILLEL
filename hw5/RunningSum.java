package src.HILLEL.hw5;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] arrayResult = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int element = 0;
            for (int j = 0; j <= i; j++) {
                element += nums[j];
                arrayResult[i] = element;
            }
        }
        return arrayResult;
    }
}
