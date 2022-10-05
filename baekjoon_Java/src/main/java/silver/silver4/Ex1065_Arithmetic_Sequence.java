package silver.silver4;

import java.util.Scanner;

public class Ex1065_Arithmetic_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int cnt = 0;
        if (inputNum <= 99) {
            cnt = inputNum;
        } else {
            cnt = 99;
            for (int i = 100; i <= inputNum; i++) {
                if (checkNum(i)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static boolean checkNum(int num) {
        int num3 = num % 10;
        int num2 = (num / 10) % 10;
        int num1 = num / 100;

        if ((num1 - num2) == (num2 - num3)) {
            return true;
        } else {
            return false;
        }
    }
}
