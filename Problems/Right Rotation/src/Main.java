import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        String[] copyNums = Arrays.copyOf(numbers, numbers.length);
        int rotate = scanner.nextInt();
        int optRotate = rotate % numbers.length == 0 ? numbers.length : rotate % numbers.length;

        if (rotate != 0) {
            for (int i = 0; i < optRotate; i++) {
                for (int g = 1; g < numbers.length; g++) {
                    copyNums[0] = numbers[numbers.length - 1];
                    copyNums[g] = numbers[g - 1];
                }
                numbers = Arrays.copyOf(copyNums, copyNums.length);
            }
        }
        for (String n:
             numbers) {
            System.out.print(n + " ");
        }
    }
}