public class FindMissingNumber {

    public static void main(String[] args) {
        /* Sum approach
        int arr []  = {1 , 2 , 4 , 5 };
        int nums = 5;
        int sum = nums * (nums + 1 )/ 2;
        int s2 = 0;
        for (int i = 0; i < nums; i++) {
            s2 += arr[i];
        }
        int missingnumber = sum - s2 ;
        System.out.println(missingnumber);

         */

        // XOR Approach

        int arr []  = {1 , 2 , 4 , 5 };
        int nums = 5;

        int xor1 = 0;
        int xor2 = 0;

        for (int i = 1; i <= nums; i++) {
            xor1 ^= i;
        }

        for (int i = 0; i < arr.length; i++) {
            xor2 ^= arr[i];
        }

        int missingnumber = xor1 ^ xor2;

        System.out.println("Missing Number is : " + missingnumber);
    }
}
