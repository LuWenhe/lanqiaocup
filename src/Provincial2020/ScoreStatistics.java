package Provincial2020;

import java.util.Scanner;

public class ScoreStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passNum = 0, excellentNum = 0;
        double passRate, excellentRate;

        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            int score = scanner.nextInt();

            if (score >= 60) {
                passNum++;

                if (score >= 85) {
                    excellentNum++;
                }
            }
        }

        passRate =  (double) passNum / num * 100;
        excellentRate = (double) excellentNum / num * 100;

        System.out.println(Math.round(passRate) + "%");
        System.out.println(Math.round(excellentRate) + "%");
        scanner.close();
    }

}
