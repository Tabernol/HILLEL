package hw2;

import java.util.Scanner;

public class Monobank2 {
    String name;
    String surname;
    int deposit;

    private static int interest() {
        int interest = ((int) (Math.random() * 10 + 1));
        return interest;
    }

    private void showInfoDeposit(int deposit, int year) {
        int income = 0;
        int incomeYear;
        int interest = interest();
        for (int i = 1; i <= year; i++) {
            incomeYear = deposit * interest / 100;
            deposit += incomeYear;
            income += incomeYear;
        }
        System.out.println("You interest rate for " + year + " will be " + interest);
        System.out.println("You profit will be " + income);
        System.out.println("Deposit amount and profit " + deposit + "\n");
    }

    public static void main(String[] args) {
        Monobank2 client = new Monobank2();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, enter you name?");
        client.name = scanner.nextLine().trim();
        System.out.println("Enter you surname");
        client.surname = scanner.nextLine().trim();
        System.out.println("How much do you want to deposit?");
        client.deposit = scanner.nextInt();
        client.showInfoDeposit(client.deposit, 1);
        client.showInfoDeposit(client.deposit, 5);
        client.showInfoDeposit(client.deposit, 10);
    }
}

