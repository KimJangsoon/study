package bronze.bronze3;

import java.util.Scanner;

public class Ex2525_Oven_Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int takeTime = sc.nextInt();
        int fullMinutes = 60;
        int hourCount = 0;
        int sum = 0;

        if (minute + takeTime >= 120) {
            sum = minute + takeTime;
            for (int i = 1; i < sum / 60; i++) {
                hourCount++;
                minute -= fullMinutes;
            }
        }

        if ((hour == 23 && minute + takeTime >= 60)||
                (hour + hourCount >= 23 && minute + takeTime >= 60)) {
            hour = hour + hourCount - 23;
            minute = minute + takeTime - fullMinutes;

        } else if (minute + takeTime >= 60) {
            hour++;
            hour += hourCount;
            minute = minute + takeTime - fullMinutes;
        } else {
            minute += takeTime;
        }
        System.out.println(hour + " " + minute);


    }
}

/*
첫째 줄에는 현재 시각이 나온다.
현재 시각은 시 A (0 ≤ A ≤ 23) 와
분 B (0 ≤ B ≤ 59)가 정수로
빈칸을 사이에 두고 순서대로 주어진다.

두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가
분 단위로 주어진다.
*/