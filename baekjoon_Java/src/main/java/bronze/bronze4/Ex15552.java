package bronze.bronze4;

import java.io.*;

public class Ex15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bf.readLine());

        final int cnt = 2;

        int[] intArr = new int[cnt];
        int[] result = new int[T];
        int sum;

        for (int i = 0; i < T; i++) {
            sum = 0;
            for (int j = 0; j < cnt; j++) {
                intArr[j] = Integer.parseInt(bf.readLine());
                sum += intArr[j];
            }
            result[i] = sum;
        }
       bw.flush();




    }
}
