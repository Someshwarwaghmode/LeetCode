package String;

public class RemoveOutermostParentheses1021 {
    public static void main(String[] args) {
        String str = "()()";
        String ans = RemoveOutermostParentheses(str);
        System.out.println(ans);
    }

    public static String RemoveOutermostParentheses(String s){
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == ')') count--;

            if(count != 0) ans.append(ch);

            if(ch == '(') count++;
        }
        return ans.toString();
    }
}
