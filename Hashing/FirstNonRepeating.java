package Hashing;
import java.util.HashMap;

public class FirstNonRepeating {

    static char firstNonRepeating(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c :s.toCharArray()){
            map.put(c,map.getOrDefault(c,0 )+1);
        }

        for (char c : s.toCharArray()) {
           if(map.get(c)==1){
            return c;
           }
}

        return '\0';
    }

    public static void main(String[] args) {

        String s = "aabbcdde";

        System.out.println(firstNonRepeating(s));
    }
}