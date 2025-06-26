import java.io.*;
import java.util.*;

public class Generator {

    static Random random = new Random();

    public static String generateValidParentheses(int length) {
        if (length % 2 != 0) length++;

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char[] opening = {'(', '{', '['};

        Map<Character, Character> pairMap = new HashMap<>();
        pairMap.put('(', ')');
        pairMap.put('{', '}');
        pairMap.put('[', ']');

        for (int i = 0; i < length / 2; i++) {
            char open = opening[random.nextInt(3)];
            sb.append(open);
            stack.push(pairMap.get(open));
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

    public static String generateInvalidParentheses(int length) {
        char[] brackets = {'(', ')', '{', '}', '[', ']'};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(brackets[random.nextInt(6)]);
        }
        if (!sb.toString().contains(")")) {
            int pos = random.nextInt(length);
            sb.insert(pos, ')');
        }
        return sb.toString();
    }

    public static void generateTestFiles(int numCases, int maxLength, String inputFile, String outputFile) throws IOException {
        try (
            BufferedWriter inputWriter = new BufferedWriter(new FileWriter(inputFile));
            BufferedWriter outputWriter = new BufferedWriter(new FileWriter(outputFile))
        ) {
            for (int i = 0; i < numCases; i++) {
                boolean isValid = random.nextBoolean();
                int length = 2 + random.nextInt(maxLength - 1);
                String testCase = isValid ? generateValidParentheses(length) : generateInvalidParentheses(length);
                inputWriter.write(testCase);
                inputWriter.newLine();
                outputWriter.write(Boolean.toString(isValid));
                outputWriter.newLine();
            }
        }
    }

    public static void main(String[] args) {
        int numberOfTestCases = 100;
        int maxLength = 10*10*10*10;
        String inputFile = "input05.txt";
        String outputFile = "output05.txt";

        try {
            generateTestFiles(numberOfTestCases, maxLength, inputFile, outputFile);
            System.out.println("✅ Test cases generated in 'input.txt' and 'output.txt'.");
        } catch (IOException e) {
            System.err.println("❌ Error generating test files: " + e.getMessage());
        }
    }
}
