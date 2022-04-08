package src.HILLEL.hw6;

public class Task2DecomressRun1313 {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            size += nums[i];
        }
        int[] result = new int[size];
        int count = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            while (nums[i] > 0) {
                result[count] = nums[i + 1];
                count++;
                nums[i]--;
            }
        }
        return result;
    }
}
