import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeArray = scanner.nextInt();
        int[] numbers = new int[sizeArray];
        int longCount = 1;
        int tempCount = 1;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                longCount++;
                if (longCount > tempCount) {
                    tempCount = longCount;
                }
            } else {
                longCount = 1;
            }
        }
        System.out.println(tempCount);
    }
}