package challenges;

public class NumberOfSubarraysBoundedMax {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {

        return countArray(nums, right) - countArray(nums, left - 1);
    }

    private int countArray(int[] nums, int boundary) {
        int count = 0;
        int temp = 0;

        for (int num : nums) {
            if (num <= boundary) {
                temp = temp + 1;
                count = count + temp;
            } else {
                temp = 0;
            }
        }
        return count;
    }

}
