import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[][] numbers = new int[size][size];


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = Math.abs(j - i);
            }
        }

        for (int[] number : numbers) {
            for (int i : number) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}