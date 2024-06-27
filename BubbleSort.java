public class BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {0, 2, 1, 2, 0 };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++)

                if (arr1[j] < arr1[i]) {

                    int temp = arr1[j];

                    arr1[j] = arr1[i];
                    arr1[i] = temp;

                }
        }

        for (int i : arr1) {
            System.out.print(i + " ");
        }

    }
}
