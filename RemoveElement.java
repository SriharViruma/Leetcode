class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 2 };
        int val = 3;
        int count = removeElement(nums, val);

        System.out.println(count);

        for (int i = 0; i < count; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}