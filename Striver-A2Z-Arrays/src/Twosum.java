import java.lang.reflect.Array;
import java.util.Arrays;

public class Twosum {
    public static void main(String[] args) {
        int arr[] = { 2 , 6 , 5 , 8 , 11};
        int target = 14 ;
        int left = 0;
        int right = arr.length -1 ;
        Arrays.sort(arr);
        while (left < right){
            int sum = left + right;
            if (sum == target){
                return;
            } else if (sum<target) {
                left++;

            }
            else {
                right--;
            }


        }
           return new int[]  {};
    }
}

/*   import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a 2D array to store {value, original_index}
        int[][] indexedNums = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            indexedNums[i][0] = nums[i];
            indexedNums[i][1] = i;
        }

        // Sort the array based on the values (the first element of each sub-array)
        Arrays.sort(indexedNums, Comparator.comparingInt(a -> a[0]));

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = indexedNums[left][0] + indexedNums[right][0];

            if (sum == target) {
                // Get original indices and return them in increasing order
                int idx1 = indexedNums[left][1];
                int idx2 = indexedNums[right][1];
                return new int[] { Math.min(idx1, idx2), Math.max(idx1, idx2) };
            } else if (sum < target) {
                left++; // Need a larger sum
            } else {
                right--; // Need a smaller sum
            }
        }

        return new int[] {};
    }
}

 */
