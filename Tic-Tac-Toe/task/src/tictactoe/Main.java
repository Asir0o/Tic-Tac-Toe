package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dash = new String("---------");

        char[][] newArray = new char[3][3];
        int k = 0;
        int sumX = 0;
        int sumO = 0;
        int countX = 0;
        int countO = 0;
        int x = 0;
        int y = 0;
        int turn = 1;
        boolean winX = false;
        boolean winO = false;
        boolean draw;
        boolean notImpossible;
        boolean end = false;

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = ' ';
                k++;
            }
        }
        //Выводит игровое поле на экран и считает количество X и O;
        System.out.println(dash);
        for (char[] chars : newArray) {
            System.out.print("| ");
            for (char aChar : chars) {
                if (aChar == 'X') {
                    countX++;
                } else if (aChar == 'O') {
                    countO++;
                }
                System.out.print(aChar + " ");
            }
            System.out.println("|");
        }
        System.out.println(dash);

        do {
            switch (turn) {
                case 1:
                    do {
                        System.out.print("Enter the coordinates: ");

                        while (!scanner.hasNextInt()) {
                            System.out.println("You should enter numbers!");
                            System.out.print("Enter the coordinates: ");
                            scanner.nextLine();
                        }

                        x = scanner.nextInt();
                        y = scanner.nextInt();

                        if (x > 3 || y > 3) {
                            System.out.println("Coordinates should be from 1 to 3!");
                        } else if (newArray[x - 1][y - 1] != ' ' || newArray[x - 1][y - 1] == 'O') {
                            System.out.println("This cell is occupied! Choose another one!");
                        } else {
                            break;
                        }
                    } while (true);

                    newArray[x - 1][y - 1] = 'X';
                    turn = 2;
                    break;
                case 2:
                    do {
                        System.out.print("Enter the coordinates: ");

                        while (!scanner.hasNextInt()) {
                            System.out.println("You should enter numbers!");
                            System.out.print("Enter the coordinates: ");
                            scanner.nextLine();
                        }

                        x = scanner.nextInt();
                        y = scanner.nextInt();

                        if (x > 3 || y > 3) {
                            System.out.println("Coordinates should be from 1 to 3!");
                        } else if (newArray[x - 1][y - 1] != ' ' || newArray[x - 1][y - 1] == 'X') {
                            System.out.println("This cell is occupied! Choose another one!");
                        } else {
                            break;
                        }
                    } while (true);

                    newArray[x - 1][y - 1] = 'O';
                    turn = 1;
                    break;

            }

            //Выводит игровое поле на экран и считает количество X и O;
            System.out.println(dash);
            for (char[] chars : newArray) {
                System.out.print("| ");
                for (char aChar : chars) {
                    if (aChar == 'X') {
                        countX++;
                    } else if (aChar == 'O') {
                        countO++;
                    }
                    System.out.print(aChar + " ");
                }
                System.out.println("|");
            }
            System.out.println(dash);


            draw = countX + countO == 9;
            notImpossible = Math.abs(countX - countO) > 1;

            for (int i = 0; i < newArray.length; i++) {
                for (int j = 0; j < newArray[i].length; j++) {
                    if (i == j) {                                  //считает количество X и O по главной диагонали
                        if (newArray[i][j] == 'X') {               //если сумма Х будет равна 264 победили Х
                            sumX += 88;                            //если сумма О будет равна 237 победили О
                        } else if (newArray[i][j] == 'O') {
                            sumO += 79;
                        }
                    }
                    //ищет победителя по вертикали
                    if (newArray[0][j] + newArray[1][j] + newArray[2][j] == 264) {
                        winX = true;
                        end = true;
                    }
                    if (newArray[0][j] + newArray[1][j] + newArray[2][j] == 237) {
                        winO = true;
                        end = true;
                    }
                }
                //ищет победителя по горизонтали
                if (newArray[i][0] + newArray[i][1] + newArray[i][2] == 264 || sumX == 264) {
                    winX = true;
                    end = true;
                } else if (newArray[i][0] + newArray[i][1] + newArray[i][2] == 237 || sumO == 237) {
                    winO = true;
                    end = true;
                }
            }
            //ищет победителя по обратной диагонали
            if (newArray[2][0] + newArray[1][1] + newArray[0][2] == 264) {
                winX = true;
                end = true;
            } else if (newArray[2][0] + newArray[1][1] + newArray[0][2] == 237) {
                winO = true;
                end = true;
            }

            if (notImpossible || (winX && winO)) {
                end = true;
            } else if (draw) {
                end = true;
            }

            countO = 0;
            countX = 0;
            sumO = 0;
            sumX = 0;
        } while (!end);




        if (winX && !winO) {
            System.out.println("X wins");
        } else if (winO && !winX) {
            System.out.println("O wins");
        } else if (notImpossible || (winX && winO)) {
            System.out.println("Impossible");
        } else if (draw) {
            System.out.println("Draw");
        } else {
            System.out.println("Game not finished");
        }
    }
}
