package Hashing;

import java.util.HashSet;

public class Intersection {

    static HashSet<Integer> intersection(int[] arr1, int[] arr2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int x:arr1){
               set1.add(x);
            }
        for(int x:arr2){
            if(set1.contains(x)){
                result.add(x);
            }

        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 5};

        System.out.println(intersection(arr1, arr2));
    }
}
