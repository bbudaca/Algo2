public class TP4_DnC {

    public static void main(String[] args) {
        int[] nums = {7, 2, 9, 4, 1, 5};
        int[] sortedNums = {1, 2, 4, 5, 7, 9};

//        mergeSort(nums);
//        quickSort(nums, 0, nums.length - 1);
//        System.out.println(Arrays.toString(nums));

        int searchIndex = binarySearch(sortedNums, 4, 0, sortedNums.length - 1);
        System.out.println(searchIndex);
    }

    private static int binarySearch(int[] nums, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            return binarySearch(nums, target, low, high);
        }
        return -1;
    }


    public static void quickSort(int[] nums, int begin, int end) {
        if (begin < end) {

            int partitionIndex = partition(nums, begin, end);

            quickSort(nums, begin, partitionIndex - 1);
            quickSort(nums, partitionIndex + 1, end);
        }
    }

    public static int partition(int[] nums, int begin, int end) {
        int pivot = nums[end];
        int i =  begin - 1;
        for (int j = begin; j < end; j++) {
            if (nums[j] <= pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i + 1];
        nums[i + 1] = nums[end];
        nums[end] = temp;

        return i + 1;
    }



    /**
     * mergeSort FUNCTION
     *
     * A classic Divide & Conquer sorting algorithm.
     *
     * Steps:
     * 1. Divide: Split the array into two halves.
     * 2. Conquer: Recursively sort both halves.
     * 3. Combine: Merge the two sorted halves into one sorted array.
     *
     * Time complexity: O(n log n)
     * Space complexity: O(n)
     */
    public static void mergeSort(int[] array) {

        // A single element is already sorted → base case
        if (array.length < 2) {
            return;
        }

        // --- DIVIDE ---

        int middle = array.length / 2;

        // Left part = first half of the array
        int[] leftHalf = new int[middle];
        // Right part = second half of the array
        int[] rightHalf = new int[array.length - middle];

        // Copy values to left half
        for (int i = 0; i < middle; i++) {
            leftHalf[i] = array[i];
        }

        // Copy values to right half
        for (int i = middle; i < array.length; i++) {
            rightHalf[i - middle] = array[i];
        }

        // --- CONQUER (Recursive calls) ---

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // --- COMBINE (Merge step) ---

        merge(array, leftHalf, rightHalf);
    }


    /**
     * merge FUNCTION
     *
     * Merges two sorted arrays (left and right) into the target array 'array'.
     * This function assumes leftHalf[] and rightHalf[] are already sorted.
     */
    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {

        int leftIndex = 0;   // Current index in leftHalf
        int rightIndex = 0;  // Current index in rightHalf
        int mainIndex = 0;   // Current index in the result array

        // Compare smallest values of left and right halves
        // Copy the smaller one into the main array
        while (leftIndex < leftHalf.length && rightIndex < rightHalf.length) {

            if (leftHalf[leftIndex] <= rightHalf[rightIndex]) {
                array[mainIndex] = leftHalf[leftIndex];
                leftIndex++;
            } else {
                array[mainIndex] = rightHalf[rightIndex];
                rightIndex++;
            }
            mainIndex++;
        }

        // If elements remain only in the left half → copy them
        while (leftIndex < leftHalf.length) {
            array[mainIndex] = leftHalf[leftIndex];
            leftIndex++;
            mainIndex++;
        }

        // If elements remain only in the right half → copy them
        while (rightIndex < rightHalf.length) {
            array[mainIndex] = rightHalf[rightIndex];
            rightIndex++;
            mainIndex++;
        }
    }
}
