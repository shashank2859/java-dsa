package Stack;
import java.util.*;
public class GreaterElement {
static int[] findNGE(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {6, 3, 5, 2, 8};

        System.out.println(Arrays.toString(findNGE(arr)));
    }
}