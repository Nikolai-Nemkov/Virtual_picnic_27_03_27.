
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Нахождение самого длинного слова

public class LongestWordFinder {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            String longestWord = "";

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }

            }

            System.out.println("Longest word in file: " + longestWord);
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        }
    }
}





















