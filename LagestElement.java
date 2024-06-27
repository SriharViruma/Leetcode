public class LagestElement {

    public static int largest(int[] arr,int n){
        int left = 0, right = n-1;
        int max = arr[right];
        while (left < right)
        {

            if(arr[left] <= arr[right])
            {
                if (arr[right] >= max) {
                    max = arr[right];
                }
                left++;
            }
            else {
                if (arr[left] >= max) {
                    max = arr[left];
                }
                right--;
            }
        }
return max;
    }

    public static void main(
            String[] args) {
        int[] arr = {1, 2, 10, 6, 2, 4, 5};
        int n = arr.length;
        int result = largest(arr, n);
        System.out.println(result);
    }
}
