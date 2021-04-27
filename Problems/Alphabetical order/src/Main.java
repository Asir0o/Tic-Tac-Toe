import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] letter = scanner.nextLine().split(" ");

        boolean alphabetical = false;

        for (int i = 1; i < letter.length; i++) {
            int result = letter[i].compareTo(letter[i - 1]);
            if (result > 0) {
                alphabetical = true;
            } else if (result == 0) {
                alphabetical = true;
            } else {
                alphabetical = false;
            }
        }
        System.out.print(alphabetical);
    }
}