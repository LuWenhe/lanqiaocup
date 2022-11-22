package Provincial2020;

import java.util.Scanner;

public class WordAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();

        int[] words = new int[26];
        int maxCount = 0, index = 0;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            words[c - 'a']++;
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i] > maxCount) {
                maxCount = words[i];
                index = i;
            }
        }

        System.out.println((char) (97 + index));
        System.out.print(maxCount);
        scanner.close();
    }

}
