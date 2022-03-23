package hw2;

import java.util.Scanner;

public class Monobank2 {
    String name;
    String surname;
    double deposit;
    static double interest = 5.5;

    public double income(int year){
        double income = deposit * interest/100 * year;
        return income;
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
        System.out.println("You profit will be for 1 yaer " + client.income(1));
        System.out.println("Deposit amount and profit " + (client.deposit + client.income(1)) + "\n");
        System.out.println("You profit will be for 5 yaer " + client.income(5));
        System.out.println("Deposit amount and profit " + (client.deposit + client.income(5)) + "\n");
        System.out.println("You profit will be for 10 yaer " + client.income(10));
        System.out.println("Deposit amount and profit " + (client.deposit + client.income(10)) + "\n");
    }
}

