import java.util.SortedSet;
import java.util.TreeSet;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {-3,-1,0,0,0,3,3};
            SortedSet<Integer> list = new TreeSet<>();

            for(int index : arr){
                list.add(index); 
            }

            System.out.println(list);


            int i = 0;
            for(int index : list){
                arr[i] = index;
                i++; 
            }

            for(int jk : arr){
                System.out.print(jk+" ");
            }
    }
    
}
