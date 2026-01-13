public class LinearSearch {
    public static int findsmallestindex(int[] arr , int target ){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {6 , 7 , 8 , 4 , 1};
        int target = 4;
        int result = findsmallestindex(arr, target);
        System.out.println(result);
    }
}
