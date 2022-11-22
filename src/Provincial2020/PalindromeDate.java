package Provincial2020;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PalindromeDate {

    // 0: 闰年 1: 平年
    static int[][] days = new int[][]{
            {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    // 判断是否是回文日期
    // 20211202
    // 01234567
    public static boolean isPalindromeData(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = str.length() - 1;

        // 1.判断是否是回文串
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }

            left++;
            right--;
        }

        // 2.判断日期是否合法
        int year = (charArray[0] - '0') * 1000 + (charArray[1] - '0') * 100
                + (charArray[2] - '0') * 10 + charArray[3] - '0';
        int month = (charArray[4] - '0') * 10 + charArray[5] - '0';
        int day = (charArray[6] - '0') * 10 + charArray[7] - '0';

        if (month > 12) {
            return false;
        }

        // 如果年份能被4整除但不能被100整除, 或者能被400整除, 则为1, 否则为0
        int leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 0 : 1;

        if (day > days[leapYear][month]) {
            return false;
        }

        return true;
    }

    // 判断是否是ABABBABA型的回文日期
    // 21211212
    public static boolean isPalindromeDataAB(String str) {
        char[] charArray = str.toCharArray();
        Set<Character> hashSet = new HashSet<>();

        for (int i = 0; i < charArray.length; i++) {
            hashSet.add(charArray[i]);
        }

        if (hashSet.size() > 2) {
            return false;
        }

        // AABBBBAA
        // ABABBABA
        // ABAAAABA
        // ABBBBBBA
        // 排除1、3、4, 得到2
        if (charArray[0] == charArray[1] || charArray[2] == charArray[3]) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        String palindromeDate = "", palindromeDateAB = "";
        boolean isPalindrome = false, isPalindromeAB = false;

        for (long i = date + 1; i <= 89991231; i++) {
            String dateStr = i + "";

            // 如果是回文日期并且没有存在过
            if (isPalindromeData(dateStr) && !isPalindrome) {
                palindromeDate = dateStr;
                isPalindrome = true;
            }

            // 如果是AB型的
            if (isPalindromeData(dateStr) && isPalindromeDataAB(dateStr) && !isPalindromeAB) {
                palindromeDateAB = dateStr;
                isPalindromeAB = true;
            }

            if (isPalindrome && isPalindromeAB) {
                break;
            }
        }

        System.out.println(palindromeDate);
        System.out.println(palindromeDateAB);

        sc.close();
    }

}
