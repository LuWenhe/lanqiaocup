package Provincial2020;

import java.util.Scanner;

public class ArrangeLetters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int[] letters = new int[26];
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            letters[c - 'A']++;
        }

        for (int i = 0; i < letters.length; i++) {
            int count = letters[i];

            for (int j = 0; j < count; j++) {
                stringBuilder.append((char) (i + 'A'));
            }
        }

        System.out.println(stringBuilder);
        scanner.close();
    }

}
