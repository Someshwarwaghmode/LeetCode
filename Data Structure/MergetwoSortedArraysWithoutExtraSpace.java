import java.util.*;
public class MergetwoSortedArraysWithoutExtraSpace {
  public static void main(String[] args) {
    int[] nums1 = new int[]{1,4,8,10};
    int[] nums2 = new int[]{2,3,9};
    int n = nums1.length;
    int m = nums2.length;
    solution1(nums1, nums2, n, m);
  }

  public static void solution1(int[] nums1,int[] nums2,int n,int m){
    int left = n-1;
    int rigth = 0;
    while(left>=0 && rigth<m){
        if(nums1[left]>nums2[rigth]){
            int temp = nums1[left];
            nums1[left] = nums2[rigth];
            nums2[rigth] = temp;
        }
        else{
            break;
        }
        left--;
        rigth++;
    }
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    System.out.println(Arrays.toString(nums1));
    System.out.println(Arrays.toString(nums2));
  }

  public static void solution2(int[] nums1,int[] nums2,int n,int m){
    
  }
}
