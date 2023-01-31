import static java.lang.Character.toLowerCase;

public class Problem3 {

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1){
            return false;
        }
        boolean is_palindrome = true;
        int ind = 0;
        while (is_palindrome && ind < s.length()/2) {
            if (toLowerCase(s.charAt(ind)) != toLowerCase(s.charAt(s.length() - ind -1))){
                is_palindrome = false;
            }
            ind++;
        }
        return is_palindrome;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("zooz"));
        System.out.println(isPalindrome("zoom"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("sizes"));
    }
}