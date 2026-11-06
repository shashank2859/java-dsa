
package bitmanipulation;

public class Poweroftwo {

    public boolean isPowerOfTwo(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Poweroftwo obj = new Poweroftwo();

        int n = 24;
        System.out.println(obj.isPowerOfTwo(n));
    }
}
