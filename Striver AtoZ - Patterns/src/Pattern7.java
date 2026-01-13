public class Pattern7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // for space
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 0; j <= 2*5 -(2*i + 1) + 1; j++) {
                System.out.print("*");
            }
            // for space
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
