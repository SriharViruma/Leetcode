class Main {
    public static void main(String[] args) {
        int[] arr = {2, -3, -4, 5, 9, 7, 8};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
