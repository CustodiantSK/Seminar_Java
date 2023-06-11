package Seminar.sem_002;

public class task005 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        int[] res = runningSum(arr);
        for (int n : res) {
            System.out.print(n + ", ");
        }
    }

    /**
     * @apinote Implement pow(x, n), which calculates x raised to the power n (i.e.,
     *          xn).
     * @param nums
     * @return
     */

    public static int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
