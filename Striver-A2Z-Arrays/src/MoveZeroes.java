import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int arr [] = { 1 , 0 , 2 , 3 , 2 , 0 , 0 , 4 , 5 , 1};
        int j = -1;
        for (int i = 0; i < arr.length ; i++) { 
            if (arr[i] == 0){
                arr[j] = arr[i];

            }
        }
        while (j< arr.length){
            arr[j] = 0;
            j++;
            }
        System.out.println(Arrays.toString(arr));
        }
    }

