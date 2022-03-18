package HW1;

import java.util.Scanner;

public class Stack1 {
    int size = 3;
    int[] myStack = new int[size];
    int elem;
    Stack1 obj1 = new Stack1();

    Stack1() {
        elem = -1;
    }

    void push(int nameNumber) {
        for (int i = 0; i <= size; i++) {
            Scanner ob1 = new Scanner(System.in);
            System.out.println("Введите число");
            nameNumber = ob1.nextInt();
            if (elem == size - 1) {
                System.out.println("Stack is full");
            } else {
                myStack[++elem] = nameNumber;
            }

        }
    }

    int pop() {
        for (int i = 0; i <= size; i++) {
            System.out.println(obj1.pop());
        }
        return 0;
    }
}
