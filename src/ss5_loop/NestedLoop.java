package ss5_loop;

public class NestedLoop {
    public static void main(String[] args) {
        // Vòng lặp lồng nhau là một cấu trúc lặp
        // trong đó một vòng lặp khác được đặt bên trong vòng lặp
        for (int i = 1; i <= 3; i++) { // Vòng lặp cha
            System.out.println("=> Vòng lặp ngoài: " + i);
            for (int j = 1; j <= 2; j++) { // Vòng lặp con
                System.out.println("Vòng lặp trong: " + j);
            }
        }

        //       In các hình * sau đây: (chiều dài các cạnh là không cố định)
        /*

         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *

         */
        int hang = 5;
        int cot = 6;

        System.out.println("=== Hình 1 ===");
        for(int i = 1; i <= hang; i++) {
            for(int j = 1; j <= cot; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /*

         * * * * * *
         *         *
         *         *
         *         *
         *         *
         * * * * * *

         */
        System.out.println("=== Hình 2 ===");
        for(int i = 1; i <= hang; i++) {
            for(int j = 1; j <= cot; j++) {
                if(i == 1 || i == hang || j == 1 || j == cot) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        /*

         * * * * * *
         *
         *
         *
         *
         * * * * * *

         */
        System.out.println("=== Hình 3 ===");
        for(int i = 1; i <= hang; i++) {
            for(int j = 1; j <= cot; j++) {
                if(i == 1 || i == hang || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        /*

         *
         * *
         * * *
         * * * *
         * * * * *

         */
        System.out.println("=== Hình 4 ===");
        for(int i = 1; i <= hang; i++) {
            for(int j = 1; j <= cot; j++) {
                if(j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
