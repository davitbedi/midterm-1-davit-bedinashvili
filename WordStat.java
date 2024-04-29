import java.util.*;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Count occurrences of each word
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : fantasyFormatData) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        // Display word counts
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
