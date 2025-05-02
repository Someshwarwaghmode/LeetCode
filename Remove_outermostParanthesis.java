public class Remove_outermostParanthesis{
    public static void main(String[] args) {
        String s = "(()())(())";
        String result = Remove(s);
        System.out.println(result);
    }

    private static String Remove(String s){
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == ')') cnt--;
            if(cnt!=0) ans.append(s.charAt(i));
            if(s.charAt(i) == '(') cnt++;
        }

        return ans.toString();
    }
}