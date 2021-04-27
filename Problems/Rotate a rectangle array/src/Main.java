import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m]; //создание массива
        int[][] rotateArray = new int[m][n]; //создание повернутого массива

        //Заполнение массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        //поворот массива на 90 градусов
        for (int i = 0; i < rotateArray.length; i++) {
            for (int j = 0; j < rotateArray[i].length; j++) {
                rotateArray[i][j] = array[Math.abs(j - array.length + 1)][i];

            }
        }

        //вывод
        for (int[] ints : rotateArray) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}