package Provincial2021;

import java.util.HashMap;
import java.util.Map;

//https://www.lanqiao.cn/problems/1443/learning/
public class Card {

    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int num = 1, flag = 0;

        for (int i = 0; i < 10; i++) {
            hashMap.put(i, 2021);
        }

        while (true) {
            int temp = num;

            while (temp > 0) {
                int t = temp % 10;
                int count = hashMap.get(t);
                int countMin = count - 1;

                if (countMin > 0) {
                    hashMap.put(t, countMin);
                } else {
                    flag = 1;
                    break;
                }

                temp = temp / 10;
            }

            if (flag == 1) {
                break;
            }

            num++;
        }

        System.out.println(num);
    }

}
