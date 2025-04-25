import java.util.*;
public class CheckArraySortOrNot {
    public static boolean ArraySort_orNot(int[] nums){
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]>nums[j]) return false;
            }
        }
        return true;
    }

    public static int[] ArraysSort(int[] nums){
        int n = nums.length;
        int count = 0;
        int piv = -1;
        for(int i=0; i<n-1; i++){
            if(nums[i] > nums[i+1]){
                count++;
                piv = i;
            }
            else if(count>1){
                return nums;
            }
        }
        int[] temp = new int[n];
        for(int j=0; j<n; j++){
            temp[j] = nums[(piv+1+j)%n];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,7,1,3,4,5};
        // boolean result = ArraySort_orNot(nums);
        // System.out.println(result);
        int[] temp = ArraysSort(nums);
        System.out.println(Arrays.toString(temp));
    }
}
