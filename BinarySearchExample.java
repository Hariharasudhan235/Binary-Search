public class BinarySearchExample {

    // Method to perform binary search on a sorted array
    public static int binarySearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1; // Handle empty or null array
        }
        
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if target is present at mid
            if (array[mid] == target) {
                return mid;
            }
            
            // If target is greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        
        // Target is not present in array
        return -1;
    }
    
    // Main method to test the binarySearch method
    public static void main(String[] args) {
        // Test case 1: Element exists in the array
        int[] sortedArray1 = {1, 3, 5, 7, 9, 11};
        int target1 = 7;
        System.out.println("Index of " + target1 + ": " + binarySearch(sortedArray1, target1)); // Output should be 3
        
        // Test case 2: Element does not exist in the array
        int[] sortedArray2 = {2, 4, 6, 8, 10};
        int target2 = 5;
        System.out.println("Index of " + target2 + ": " + binarySearch(sortedArray2, target2)); // Output should be -1
        
        // Test case 3: Empty array
        int[] sortedArray3 = {};
        int target3 = 1;
        System.out.println("Index of " + target3 + ": " + binarySearch(sortedArray3, target3)); // Output should be -1
        
        // Test case 4: Target is the first element
        int[] sortedArray4 = {1, 2, 3, 4, 5};
        int target4 = 1;
        System.out.println("Index of " + target4 + ": " + binarySearch(sortedArray4, target4)); // Output should be 0
        
        // Test case 5: Target is the last element
        int[] sortedArray5 = {10, 20, 30, 40, 50};
        int target5 = 50;
        System.out.println("Index of " + target5 + ": " + binarySearch(sortedArray5, target5)); // Output should be 4
        
        // Test case 6: Null array
        int[] sortedArray6 = null;
        int target6 = 10;
        System.out.println("Index of " + target6 + ": " + binarySearch(sortedArray6, target6)); // Output should be -1
    }
}
