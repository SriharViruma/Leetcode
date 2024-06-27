public class SecondLargestWithoutSort {

    /**
     * This function finds the second largest element in an integer array without using
     * the built-in sort method.
     * 
     * @param arr the array of integers to be checked
     * @return the second largest element in the array
     */
    public static int find2Largest(int[] arr){
        // Initialize the largest and second largest variables with the first element of the array
        int Largest = arr[0];
        int secondLargest = -1;

        // Iterate through each element in the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is greater than the largest element, swap them
            if (arr[i] > Largest) {
                secondLargest = Largest; // Set the second largest element to the current largest element
                Largest = arr[i]; // Set the largest element to the current element
            }
            // If the current element is between the largest and second largest elements, set it as the second largest
            if (arr[i]<Largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        // Return the second largest element
        return secondLargest;
    }

    /**
     * This function finds the second largest element in an integer array without using
     * the built-in sort method.
     * 
     * @param arr the array of integers to be checked
     * @return the second largest element in the array
     */
    public static int better(int[] arr) {
        // Initialize the largest and second largest variables with the first element of the array
        int Largest = arr[0]; // The largest element found so far
        int secondLargest = 0; // The second largest element found so far

        // Iterate through each element in the array
        for(int i : arr){
            // If the current element is greater than the largest element,
            // update the largest element
            if (i > Largest) {
                Largest = i;
            }
        }

        // Iterate through each element in the array again, to find the second largest element
        for(int index : arr){
            // If the current element is greater than the second largest element and
            // less than the largest element, update the second largest element
            if (index > secondLargest && index < Largest) {
                secondLargest = index;
            }
        }

        // Return the second largest element
        return secondLargest;
    }

    public static void main(String[] args) {
       int[] arr = {12, 35, 1, 10, 34, 1};
        int result = find2Largest(arr);
        int result2 = better(arr);
        System.out.println(result);
        System.out.println(result2);
    }
}
