

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Вычисление частоты слов.
public class WordFreguencyCounter {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            Map<String, Integer> wordFreguency = new HashMap<>();

            while (scanner.hasNext()) {
                String word = scanner.next();
                wordFreguency.put(word, wordFreguency.getOrDefault(word,0) + 1);
            }
            wordFreguency.forEach((word, freguency) -> System.out.println(word + " - " + freguency + "times"));

        } catch (FileNotFoundException e) {

            System.err.println("File not found.");
        }
    }
}















