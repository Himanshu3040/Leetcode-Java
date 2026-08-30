package leetcode;

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0) {
            return false;
        }
        int original = x;
        int reverse = 0;
        while( x !=0){
            int r = x%10;
            reverse = reverse*10 + r;
            x =x/10;
        }
        return original == reverse;
    }
}

