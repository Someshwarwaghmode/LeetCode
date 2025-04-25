import java.util.*;
public class MargeIntervals {

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,3},{2,6},{8,10},{15,18}};
        int[][] nums1 = MargeArray(nums);
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums1[0].length; j++){
                System.out.print(nums1[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] MargeArray(int[][] nums){
        int row = nums.length;
        List<int[]> marge = new ArrayList<>();
        Arrays.sort(nums,(a,b) -> Integer.compare(a[0],b[0]));
        for(int i=0; i<row; i++){
            int start = nums[i][0];
            int end = nums[i][1];
            if(marge.isEmpty() || marge.get(marge.size()-1)[1] < start){
                marge.add(new int[]{start,end});
            }
            else{
                marge.get(marge.size()-1)[1] = Math.max(marge.get(marge.size()-1)[1],end);
            }
        }
        return marge.toArray(new int[marge.size()][]);
    }
}