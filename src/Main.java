import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please pick the triangle you want (from the presentation) between 1 and 6: ");
        int triangle = sc.nextInt();

        if (triangle < 1 || triangle > 6) {
            while (triangle < 1 || triangle > 6) {
                System.out.print("Please enter a number between 1 and 6: ");
                triangle = sc.nextInt();
            }
        }

        System.out.print("Please pick the number of rows you want (an odd number of rows): ");
        int rows = sc.nextInt();

        if (rows % 2 != 1) {
            while (rows % 2 != 1) {
                System.out.print("Please enter a positive odd number, not even or negative: ");
                rows = sc.nextInt();
            }
        }
        
        if (triangle == 1) {
            triangle_one(rows);
        } else if (triangle == 2) {
            triangle_two(rows);
        } else if (triangle == 3) {
            triangle_three(rows);
        } else if (triangle == 4) {
            triangle_four(rows);
        } else if (triangle == 5) {
            triangle_five(rows);
        } else if (triangle == 6) {
            triangle_six(rows);
        }
    }

    public static void triangle_one (int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public static void triangle_two (int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = rows; j >= i + 1; j--) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public static void triangle_three (int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = rows; j >= i + 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public static void triangle_four (int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = rows; j >= i + 1; j--) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public static void triangle_five (int rows) {
        for (int i = rows; i >= 1; i -= 2) {
            for (int j = rows; j >= i; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    public static void triangle_six (int rows) {
        for (int i = 1; i <= rows; i += 2) {

            for (int j = rows; j >= i; j -= 2) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }

            System.out.println();
        }

        for (int i = rows - 2; i >= 1; i -= 2) {

            for (int j = rows; j >= i; j -= 2) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("X");
            }

            System.out.println();
        }
    }
}
