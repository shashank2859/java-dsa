public class MoveZero {
    static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
static void moveZeroes(int[] arr) {
    int  i=0;
    for (int j = 0; j < arr.length; j++) {

            if (arr[j] != 0) {
                swap(arr, i, j);
                i++;
            }
        }
    }
public static void main(String[] args) {
    int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
   

