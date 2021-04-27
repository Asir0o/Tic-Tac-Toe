import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeArray = scanner.nextInt();
        int[] numbers = new int[sizeArray];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int num = scanner.nextInt();

        for (int n : numbers) {
            if (n == num) {
                count++;
            }
        }
        System.out.println(count);
    }
}