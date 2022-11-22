package Provincial2020;

import java.util.Scanner;

public class DoorplateMaking {

    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 2020; i++) {
            String str = String.valueOf(i);
            char[] charArray = str.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == '2') {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

}
