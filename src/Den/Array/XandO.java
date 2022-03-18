package Den.Array;

import java.util.Scanner;

public class XandO {
    String player1;
    String player2;
    boolean play = true;
    String simbol;
    String[][] field = new String[4][4];

    public void whatName() {
        Scanner p1 = new Scanner(System.in);
        System.out.println("First name player");
        player1 = p1.next();
        Scanner p2 = new Scanner(System.in);
        System.out.println("Second name player");
        player2 = p2.next();
    }

    void makeFieldForPlay() {//Создание массива с бокой разметкой
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (i == 0) {
                    field[i][j] = String.valueOf(j);
                } else if (j == 0 & i >= 1) {
                    field[i][j] = String.valueOf(i);
                } else {
                    field[i][j] = String.valueOf(" ");
                }
            }
        }
    }

    public void checkTakeCoordinats(String whoPlay, String simbol) {//Прроверка правильности ввода ккординат
        System.out.println("Ход игрока: " + whoPlay + " делай ход в формате: 'Х пробел У' где Х - горизонт, У - вертикаль.");
        Scanner sc = new Scanner(System.in);
        String coordinats = sc.nextLine().trim();
        if (coordinats.length() != 3) {
            System.out.println("Ввод не коректний");
            checkTakeCoordinats(whoPlay, simbol);
        }
        int x = Character.getNumericValue(coordinats.charAt(0));
        char z = coordinats.charAt(1);
        int y = Character.getNumericValue(coordinats.charAt(2));
        if ((x < 1 | x > 3) | (y < 1 | y > 3) | z != ' ') {
            System.out.println("Ввод не коректний");
            checkTakeCoordinats(whoPlay, simbol);
        }
        if (whoPlay == player1) {
            simbol = "X";
            if (field[x][y] == simbol | field[x][y] == "0") {
                System.out.println("Координата уже заполнена");
                checkTakeCoordinats(player1, simbol);
            } else {
                field[x][y] = simbol;
            }

        } else if (whoPlay == player2) {
            simbol = "0";
            if (field[x][y] == "X" | field[x][y] == simbol) {
                System.out.println("Координата уже заполнена");
                checkTakeCoordinats(player2, simbol);
            }
            field[x][y] = simbol;
        }
    }

    void showField() {//метод которий показівает поле для игрі с изменениями
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    public boolean whoWinner(String player) {
        if (player == player1) {
            simbol = "X";
        } else {
            simbol = "0";
        }
        for (int i = 1; i < field.length; i++) {//Горизонтальная проверка віграша
            if (field[i][1] == simbol & field[i][2] == simbol & field[i][3] == simbol) {
                if (simbol == "0") {
                    System.out.println("Победа игрока :" + player2);
                    play = false;
                }
                if (simbol == "X") {
                    System.out.println("Победа игрока :" + player1);
                    play = false;
                }
            }
        }
        for (int i = 1; i < field.length; i++) {//Вертикальная проверка віграша
            if (field[1][i] == simbol & field[2][i] == simbol & field[3][i] == simbol) {
                if (simbol == "0") {
                    System.out.println("Победа игрока :" + player2);
                    play = false;
                }
                if (simbol == "X") {
                    System.out.println("Победа игрока :" + player1);
                    play = false;
                }
            }
        }
        if (field[1][1] == simbol & field[2][2] == simbol & field[3][3] == simbol) {//проверка диагональ с Л-П Up-Down
            if (simbol == "0") {
                System.out.println("Победа игрока :" + player2);
                play = false;
            }
            if (simbol == "X") {
                System.out.println("Победа игрока :" + player1);
                play = false;
            }
        }
        if (field[3][1] == simbol & field[2][2] == simbol & field[1][3] == simbol) {//проверка диагональ с Л-П Down-Up
            if (simbol == "0") {
                System.out.println("Победа игрока :" + player2);
                play = false;
            }
            if (simbol == "X") {
                System.out.println("Победа игрока :" + player1);
                play = false;
            }
        }
        return play;
    }

    public boolean drawIf() {
        int count = 0;
        OUTER:
        for (int i = 1; i < field.length; i++) {
            INNER:
            for (int j = 1; j < field[i].length; j++) {
                if (field[i][j] == " ") {
                    count++;
                    break OUTER;
                }
            }
        }
        if (count == 0) {
            System.out.println("Ничия, игра закончена");
        }
        return play;
    }

    public static void main(String[] args) {
        int round = 1;
        XandO ob1 = new XandO();//Создание обєкта
        ob1.whatName();// считівание имен играков
        ob1.makeFieldForPlay();//создание поля для игрі
        ob1.showField();// вівод на екран поля
        while (ob1.play) {//цікл игрі
            System.out.println("Раунд " + round);
            ob1.checkTakeCoordinats(ob1.player1, ob1.simbol);//проверка кооректности ввода координат игрока 1
            ob1.showField();//показания игрового поля с изменениями
            ob1.whoWinner(ob1.player1);//проверка на победителя 1
            if (ob1.play == false) {//прерівание цікла если єто так
                break;
            }
            ob1.drawIf();
            ob1.checkTakeCoordinats(ob1.player2, ob1.simbol);//проверка кооректности ввода координат игрока 2
            ob1.showField();//показания игрового поля с изменениями
            ob1.whoWinner(ob1.player2);//проверка на победителя 2
            ob1.drawIf();
            round++;//следующий раунд
        }
    }
}
