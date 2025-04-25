
import java.util.*;
public class TreeSumProblem {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = Brute(nums);
        System.out.print(list);
    }

    public static List<List<Integer>> Brute(int[] nums){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int start = 0; start<n; start++){
            if(start > 0 && nums[start]==nums[start-1]) continue;
            int end = n-1;
            int mid = start+1;

            while(mid < end){
                int sum = nums[start]+nums[mid]+nums[end];
                if(sum == 0){
                    list.add(Arrays.asList(nums[start],nums[mid],nums[end]));
                    while(mid < end && nums[mid]==nums[mid+1]) mid++;
                    while(mid < end && nums[end]==nums[end-1]) end--;
                    mid++;
                    end--;
                }
                if(sum > 0) end--;
                if(sum < 0) mid++;
            }
        }
        return list;
        
    }

}
