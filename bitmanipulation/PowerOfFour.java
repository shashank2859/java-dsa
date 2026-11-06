package bitmanipulation;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if( (n > 0 &&(n&(n-1))==0)&& (n & 0x55555555) != 0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=677;
        System.out.println(isPowerOfFour(n));
    }
}
