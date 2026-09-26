public class StringReverse {
    static String reverse(String s) {
    char[] arr = s.toCharArray();

    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        int temp= arr[left];
        arr[left]=arr[right];
        arr[right]= (char) temp;


        left++;
        right--;
    }

    return new String(arr);
}
public static void main(String[] args) {
    String s = "shashank";
    System.out.println(reverse(s));
}
}
