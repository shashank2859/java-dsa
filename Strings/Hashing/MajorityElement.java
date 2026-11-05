package Hashing;
import java.util.HashMap;

public class MajorityElement {

    static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int k = nums.length / 2;

        for (int x : nums) {

            map.put(x, map.getOrDefault(x, 0) + 1);

            if (map.get(x) > k) {
                return x;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement(nums));
    }
}