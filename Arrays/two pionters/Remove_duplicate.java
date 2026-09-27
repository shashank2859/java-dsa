public class Remove_duplicate {
    static int removeDuplicates(int[] arr){
        int i=0;
        int j=1;
        int n=arr.length;
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
                }
            else{
                i++;
                arr[i]=arr[j];
                j++;
            }
            }
            return i + 1;
        }
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,3,4};
        int k = removeDuplicates(arr);
        System.out.println(k);
        
        for (int x = 0; x < k; x++) {
        System.out.print(arr[x] + " ");
}
    }
    }  
    

