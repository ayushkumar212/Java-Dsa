public class LeftRotateArrayByDPlace {

    // Method to reverse array from start to end index
    static void reverse(int[] arr , int start , int end ){
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // method to left rotate array by d place
    static void leftrotate(int[] arr , int d ){
        int n = arr.length;
        // Handle cases whn  d>n
        d = d % n ;

        // step1: reversee first d elements
        reverse(arr, 0,d-1);

        // step2: reverse remaining elements
        reverse(arr, d , n-1);

        // step3 : reverse whole array
        reverse(arr, 0 , n-1);
    }
    public static void main(String[] args) {
        int arr [] = {1 , 2 , 3 , 4 , 5 , 6 , 7};
        int d = 3;
        leftrotate(arr,d);

        // print result
        System.out.println("left rotated array:");
        for (int num : arr){
            System.out.println(num + " ");
        }
    }
}
