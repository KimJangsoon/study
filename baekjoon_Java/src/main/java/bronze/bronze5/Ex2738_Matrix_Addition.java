package bronze.bronze5;

import java.util.Scanner;

public class Ex2738_Matrix_Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    arr[j][k] += sc.nextInt();
                    if (i == 1) {
                        sb.append(arr[j][k] + " ");
                    }
                }
                if (i == 1) {
                    sb.append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
