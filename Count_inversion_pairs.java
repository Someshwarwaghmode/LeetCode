public class Count_inversion_pairs{
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int result = brute(nums);
        System.out.println(result);
    }

    public static int brute(int[] nums){
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j = i; j<n; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}