package bronze.bronze3;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10818_min_and_max {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] intArr = new int[N];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
        }

        Arrays.sort(intArr);
        System.out.print(intArr[0] + " " + intArr[N - 1]);


    }

}

   /*
   N개의 정수가 주어진다.
   이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
   */