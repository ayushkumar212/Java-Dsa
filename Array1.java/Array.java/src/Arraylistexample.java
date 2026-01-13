import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistexample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(67);
//        list.add(698);
//        list.add(6097);
//        list.add(697);
//        list.add(671);
//        list.set(0,99);
//        System.out.println( );
//
//        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));

        }
        System.out.println(list);
    }
}
