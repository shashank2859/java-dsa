import java.util.ArrayList;
public class arraylist_odd_numbers {
    static ArrayList<Integer> getoddnumber (int[] arr){
        ArrayList<Integer> result= new ArrayList<>();
            for(int x: arr){
                if(x%2!=0){
                    result.add(x);
                }
            }


        return result;
        

    }

public static void main(String[] args){
    int [] arr={1,4,7,8,10,13};
    ArrayList<Integer> result= getoddnumber(arr);
    System.out.println(result);
}
}