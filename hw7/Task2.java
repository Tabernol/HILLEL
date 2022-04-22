package hw7;

public class Task2 {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (symbol == '(') {
                depth++;
            } else if (symbol == ')') {
                depth--;
            }
            maxDepth = Math.max(maxDepth, depth);
        }
        return maxDepth;
    }
}
