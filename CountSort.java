public class CountSort {
    public static void sort012(int[] a, int n) {
        int zero = 0, 
        one = 0, 
        two = 0;    

        for(int i = 0 ; i < n;i++){
            if (a[i] == 0 ) {
                zero++;
            }
            if (a[i] == 1) {
                one++;
            }
            if (a[i] == 2) {
                two++;
            }
        }

        int index = 0;
        
        while (zero > 0) {
            a[index] = 0;
            zero--;
            index++;
        }
        while (one > 0) {
            a[index] = 1;
            one--;
            index++;
        }
        while (two > 0) {
            a[index] = 2;
            two--;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] a = {0, 2, 1, 2, 0};
        int n = a.length;

        sort012(a,n);

        
    }
}
