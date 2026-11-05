package Hashing;

import java.util.HashSet;

public class ContainsDuplicate {

    static boolean containsDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {

            if (set.contains(x)) {
                return true;
            }

            set.add(x);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1};

        System.out.println(containsDuplicate(arr));
    }
}