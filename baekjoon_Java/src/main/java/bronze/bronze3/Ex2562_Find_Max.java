package bronze.bronze3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex2562_Find_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            intArr.add(sc.nextInt());
        }
        int max = Collections.max(intArr);
        int maxIdx = intArr.indexOf(max) + 1;

        System.out.println(max);
        System.out.println(maxIdx);

    }

}
/*
9개의 서로 다른 자연수가 주어질 때,
이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.

예를 들어, 서로 다른 9개의 자연수
3, 29, 38, 12, 57, 74, 40, 85, 61이 주어지면,
이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
*/
