import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeArray = scanner.nextInt();
        int[] numbers = new int[sizeArray];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] copyNums = Arrays.copyOf(numbers, numbers.length);

        for (int g = 1; g < numbers.length; g++) {
            copyNums[0] = numbers[numbers.length - 1];
            copyNums[g] = numbers[g - 1];
        }

        numbers = Arrays.copyOf(copyNums, copyNums.length);

        for (int n :
                numbers) {
            System.out.print(n + " ");
        }
    }
}