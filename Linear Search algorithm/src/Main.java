import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static int linearSearch(int nums[],int key){

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int key = 19;

        int index = linearSearch(nums,key);
        if(index==-1){
            System.out.println("NOT FOUND");
        }
        System.out.println("target is at index" + index);


    }
}
