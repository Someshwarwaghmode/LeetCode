import java.util.Arrays;

public class ThreeSumClosestMax {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                int diffCurrent = Math.abs(target - sum);
                int diffClosest = Math.abs(target - closestSum);

                if (diffCurrent < diffClosest ||
                    (diffCurrent == diffClosest && sum > closestSum)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {-7, 9, 8, 3, 1, 1};
        int target1 = 2;
        System.out.println(threeSumClosest(arr1, target1)); // Output: 2

        int[] arr2 = {5, 2, 7, 5};
        int target2 = 13;
        System.out.println(threeSumClosest(arr2, target2)); // Output: 14
    }
}
