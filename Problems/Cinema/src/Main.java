import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int result = 0;
        int row = scanner.nextInt();
        int seats = scanner.nextInt();
        int[][] cinema = new int[row][seats];

        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                cinema[i][j] = scanner.nextInt();
            }
        }

        int tickets = scanner.nextInt();

        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if (cinema[i][j] == 0) {
                    count++;
                    if (count >= tickets) {
                        result = count;
                    }
                } else {
                    count = 0;
                }
            }
            if (result >= tickets) {
                result = i + 1;
                break;
            } else {
                count = 0;
            }
        }
        System.out.println(result);
    }
}