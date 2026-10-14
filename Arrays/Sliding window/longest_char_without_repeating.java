public class longest_char_without_repeating {
    public static int characterReplacement(String s, int k) {
         int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        int[] freq = new int[26];

        for (int right = 0; right < s.length(); right++) {

            int index = s.charAt(right) - 'A';
            freq[index]++;

 
            maxFreq = Math.max(maxFreq, freq[index]);

            while (right - left + 1 - maxFreq > k) {

                int leftIndex = s.charAt(left) - 'A';
                freq[leftIndex]--;

                left++;
            }

           
            maxLength = Math.max(
                maxLength,
                right - left + 1
            );
        }

        return maxLength;
    }
    public static void main(String[] args) {
        String s="AABBAAAA";
        int k=2;
        System.out.println(characterReplacement(s,k));
    }
}
