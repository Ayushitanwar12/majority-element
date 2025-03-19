public class majorityelement {
    
    // Method to find the majority element
    public int majority(int[] nums) {
        int count = 0;
        int n = nums.length;

        // Traverse the array to find the majority element
        for (int i = 0; i < n; i++) {
            // Count the occurrences of nums[i]
            count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            // If count is greater than n/2, return the majority element
            if (count > n / 2) {
                return nums[i];
            }
        }
        // Return -1 if no majority element is found
        return -1;
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating an instance of the MajorityElement class
        majorityelement solution = new majorityelement();

        // Example input array (can be modified for different tests)
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        // Calling the majority method and printing the result
        int result = solution.majority(nums);
        System.out.println("The majority element is: " + result);
    }
}
