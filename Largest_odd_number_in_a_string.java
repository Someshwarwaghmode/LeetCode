public class Largest_odd_number_in_a_string {
    public static void main(String[] args) {
        String s = "52";
        String result = Find_largest_odd(s);
        System.out.println(result);   
    }

    private static String Find_largest_odd(String s){
        int i = s.length() - 1;
        if (s.charAt(i) % 2 != 0) return s;

        int ind = -1; // default to -1 to handle no odd digit
        StringBuffer ans = new StringBuffer();

        while (i >= 0) {
            if (s.charAt(i) % 2 != 0) {
                ind = i;
                break; // found the rightmost odd digit
            }
            i--;
        }

        if (ind != -1) {
            ans.append(s.substring(0, ind + 1));
            return ans.toString();
        }

        return ""; // no odd digit found
    }
}
