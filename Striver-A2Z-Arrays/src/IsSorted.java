public class IsSorted {
    public static void main(String[] args) {
        int arr [] = { 1 , 2 , 1 , 3 , 4};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[i-1]){

            }
            else {
                System.out.println("false");;
            }
            System.out.println("true");
        }
    }
}
