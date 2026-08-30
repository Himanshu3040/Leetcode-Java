package leetcode;

public class Reverse_Integer { public int reverse(int x) {
    int n = x;
    int r;
    int rev =0;
    while(n!=0){
        r=n%10;
        n=n/10;
        if( rev>Integer.MAX_VALUE /10 || rev == Integer.MAX_VALUE /10 && r >7){
            return 0;
        }
        if(rev <Integer.MIN_VALUE/10 || rev ==Integer.MIN_VALUE /10 && r < -8){
            return 0;
        }
        rev = rev*10  + r;
    }
    return rev;
}
}
