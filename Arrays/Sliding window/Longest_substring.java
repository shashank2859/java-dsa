import java.util.HashSet;

public class Longest_substring {
    static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int right=0;
        int maxlength=0;
        while(right <s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            right++;
            maxlength=Math.max(maxlength,set.size());
            
        }
        
return maxlength;
}
public static void main(String[] args) {
    String s="bbbbb";
    System.out.println( lengthOfLongestSubstring(s));

}
}