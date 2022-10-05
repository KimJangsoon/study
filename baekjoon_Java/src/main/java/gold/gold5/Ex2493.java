package gold.gold5;

import java.util.Scanner;

public class Ex2493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        int[] intArr = new int[N];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
        }
        int stanNum = 0;

        for (int i = N - 1; i >= 0 ; i--) {
            for (int j = N - 1; j >= 0 ; j--) {

                if (intArr[i] < intArr[j]){
                    stanNum = j + 1;
                    sb.append(stanNum).append(" ");
                    continue;
                } else {
                    sb.append(0).append(" ");
                }
            }
        }
        System.out.println(sb);
    }
}
