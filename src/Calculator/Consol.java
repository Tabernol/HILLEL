package Calculator;

import java.util.Scanner;

public class Consol {
    double numberF;
    double numberS;
    char operand;
    double myresult;

    public void startMyCalculator() {
        int a = 0;
        while (a < 5) {
            first();
            second();
            third();
            result();
            System.out.println("Результат: " + myresult);
            a++;
        }
    }

    public double first() {
        System.out.println("Вас приветсвует МОЙ калькулятор)");
        System.out.println();
        Scanner firstObj = new Scanner(System.in);
        System.out.println("Введите первое число:");
        numberF = firstObj.nextDouble();
        return numberF;
    }

    public double second() {
        Scanner secondObj = new Scanner(System.in);
        System.out.println("Введите второе число:");
        numberS = secondObj.nextDouble();
        return numberS;
    }

    public char third() {
        Scanner thirdObj = new Scanner(System.in);
        System.out.println("Введите символ оперци: + , - , * , / ");
        operand = thirdObj.next().charAt(0);
        return operand;
    }

    public double result() {
        switch (operand) {
            case '+':
                myresult = numberF + numberS;
                break;
            case '-':
                myresult = numberF - numberS;
                break;
            case '*':
                myresult = numberF * numberS;
                break;
            case '/':
                myresult = numberF / numberS;
                break;
            default:
                System.out.println("Такой операции калькулятор сделать не может((");
        }
        return myresult;
    }
}


