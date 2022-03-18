package HW1;

public class MyStack {
    int size = 10;
    int[] stack = new int[size];
    int element;

    MyStack() {
        element = -1;
    }

    void push(int i) {
        if (element == 9) {
            System.out.println("MyStack is full");
        } else
            System.out.println(i);
            stack[++element] = i;

    }
}
