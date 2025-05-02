public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String result = ReversString(s);
        System.out.println(result);
    }

    private static String ReversString(String s){
        s = s.trim();
        int i = s.length()-1;
        StringBuilder ans  = new StringBuilder();
        while(i>=0){

            while(i>=0 && s.charAt(i) == ' ') i--;
            int j = i;

            while(i>=0 && s.charAt(i) != ' ') i--;

            if(ans.length() > 0) ans.append(' ');
            ans.append(s.substring(i+1, j+1));
        }

        return ans.toString();
    }
}
