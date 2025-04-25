import java.util.*;

public class Hash{
    public static void main(String[] args) {
        int[] nums = {7,86,4,12};
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0));
        }
        System.out.println(map);
    }

    public static void Largestnum(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num))
        }
    }
}