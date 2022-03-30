package src.HILLEL.hw4;

public class Task2 {
    String[] word1 = {"i", "know", "you", "know", "what", "i", "know"};
    String[] word2 = {"i", "know", "you", "know", "what", "i", "know"};

    public boolean comparisonArrays() {
        StringBuilder sentence1 = new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            sentence1.append(word1[i]);
        }

        StringBuilder sentence2 = new StringBuilder();
        for (int i = 0; i < word2.length; i++) {
            sentence2.append(word2[i]);
        }
        boolean comparisonSentence;
        comparisonSentence = sentence1.toString().equals(sentence2.toString());
        System.out.println(comparisonSentence);
        return comparisonSentence;
    }
}
