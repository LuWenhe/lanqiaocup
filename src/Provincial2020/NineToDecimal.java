package Provincial2020;

import java.util.Scanner;

public class NineToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = 0;
        double res = 0;

        while (number > 0) {
            int num = number % 10;
            res = res + num * Math.pow(9, a);
            number /= 10;
            a++;
        }
        System.out.println(res);
        scanner.close();
    }

}
