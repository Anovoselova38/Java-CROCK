import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Main {

    public static void main(String[] args) {
        String inputFile = "src//file//input.txt";  // Путь к входному файлу.
        String outputFile = "src//file//output.txt";  // Путь к выходному файлу.
        Map<Character, Integer> frequencyMap = new HashMap<>();  // Карта частоты символов.

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        int currentChar;
        while ((currentChar = reader.read()) != -1) {
            char character = (char) currentChar;
            if (character != ' ' && character != '\n') {
                frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
            }
        }

        Map<Character, Integer> sortedFrequencyMap = new TreeMap<>(frequencyMap);

        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        for (Map.Entry<Character, Integer> entry : sortedFrequencyMap.entrySet()) {
            writer.write("\"" + entry.getKey() + "\"=" + entry.getValue() + ", ");
        }

    }
}

