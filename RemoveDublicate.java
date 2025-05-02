import java.util.*;
public class RemoveDublicate {
    

    public static void main(String[] args) {
        int[] nums = new int[]{1,4,2,1,3,4,6,6};
        int i=1;
        while(i!=0){
            System.out.println("===============DO AND GET=============");
            System.out.println("1.Get Array without dublicate\n2.Get array index of unique element");
            Scanner input = new Scanner(System.in);
            System.out.print("What you want plz Enter number::");
            int choice = input.nextInt();
            if(choice == 1){
                int[] result1 = Remove_Dublicate_Return_array(nums);
                System.out.println(Arrays.toString(result1));
            }
            else if(choice == 2){
                int result2 = Return_Unique_element_Index(nums);
                System.out.println(result2);
            }
            else{
                System.out.println("Opps!!! Plz Enetr vailide input");
            }
        }
    }

    public static int[] Remove_Dublicate_Return_array(int[] nums){
        int n = nums.length;
        int ind = 0;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(nums[ind]!=nums[i]){
                nums[++ind] = nums[i];
            }
        }
        int[] temp = new int[ind+1];
        for(int j=0; j<ind+1; j++){
            temp[j] = nums[j];
        }
        return temp;
    }

    public static int Return_Unique_element_Index(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int ind = 0;
        for(int i=0; i<n; i++){
            if(nums[ind]!=nums[i]) nums[++ind] = nums[i];
        }
        return ind+1;
    }
}
