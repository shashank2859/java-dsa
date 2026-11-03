import java.util.HashMap;
public class Fruits_in_basket {
    public static int totalFruit(int[] fruits) {

        int left = 0;
        int maxFruits = 0;
        int freq=0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
                map.put(right,map.getOrDefault(right, 0)+1);
                freq++;
                   
            
            while (map.size() > 2) {
                
                freq--;
                if(freq==0){
                    map.remove(right);
                }
                left++;
            }

            

        }
    
        return maxFruits;
    }
    public static void main(String [],args){
        int [] fruits={1,1,1,2,2,3,1,1,1,1,1,1,};
        System.out.println(totalFruit(fruits));
}

}