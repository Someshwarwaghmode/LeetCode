import java.util.*;
public class TwoSum {
    public static List<List<Integer>> two_sum(int[] nums, int target){
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        int start = 0;
        int end  = n-1;
        while(start<end){
            int sum = nums[start]+nums[end];
            if(start > 0 && nums[start]==nums[start-1]){
                start++;
                continue;
            }
            if(sum < target){
                start++;
            }
            else if(sum > target){
                end--;
            }
            else{
                list.add(Arrays.asList(nums[start],nums[end]));
                start++;
                end--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,7,8,2,2,4};
        List<List<Integer>> list = two_sum(nums, 8);
        System.out.println(list);
    }
}
