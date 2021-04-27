import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        String[][] star = new String[size][size];

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                if (i == j) {
                    star[i][j] = "*";
                } else if (i == size - j - 1) {
                    star[i][j] = "*";
                } else if (i == size / 2) {
                    star[i][j] = "*";
                } else if (j == size / 2) {
                    star[i][j] = "*";
                } else {
                    star[i][j] = ".";
                }
            }
        }

        for (String[] strings : star) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}