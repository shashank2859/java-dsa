import java.util.ArrayList;

public class arraylist_even_numbers {
    public static void main(String[]args)
{
    ArrayList <Integer> list = new ArrayList<>();
    list.add(1);
    list.add(4);
    list.add(7);
    list.add(8);
    list.add(10);
    list.add(13);
    for(int x:list)
    {
        if(x % 2 == 0)
        {
            System.out.println(x);
        }
    }

}    
}
    