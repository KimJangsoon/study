package bronze.bronze1;

import java.util.Scanner;

public class Ex4344_Over_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArr;
        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {

            int num = sc.nextInt();
            intArr = new int[num];

            double sum = 0;

            for (int j = 0; j < num; j++) {
                int score = sc.nextInt();
                intArr[j] = score;
                sum += score;
            }

            double avg = (sum / num);
            float cnt = 0;

            for (int j = 0; j < num; j++) {
                if (intArr[j] > avg) {
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n", (cnt / num) * 100);


        }
    }
}

/*
 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
이어서 N명의 점수가 주어진다.

각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여
소수점 셋째 자리까지 출력한다.
*/
