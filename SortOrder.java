import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortOrder {
    public static void sortIt(long[] arr, long n){
        List<Long> even = new ArrayList<>();
        List<Long> odd = new ArrayList<>();
        for (Long index : arr) {
            if (index % 2 == 0) {
                even.add(index);
            }
            else
                odd.add(index);
        }

        Collections.sort(even);
        odd.sort(Collections.reverseOrder());

        int index = 0;
        for (Long long1 : odd) {
            arr[index] = long1;
            index++;
        }
        for (Long long1 : even) {
            arr[index] = long1;
            index++;
        }

        for (Long long1 : arr) {
            System.out.print(long1+" ");
        }

    }
    public static void main(String[] args) {
        long[] arr = {20,21,18,29,7};
        long n = arr.length;

        sortIt(arr, n);
    }
}
