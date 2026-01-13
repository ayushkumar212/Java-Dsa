import java.util.Scanner;

public class getConcatanation {
//    public static void main(String[] args) {
//        Scanner nums = new Scanner(System.in);
//        System.out.println("enter :" + nums);
//
//    }

    public static int[] Concatanation(int[] nums ){
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}
