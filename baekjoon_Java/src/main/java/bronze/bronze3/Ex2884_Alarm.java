package bronze.bronze3;

import java.util.Scanner;

public class Ex2884_Alarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int fullMinutes = 60;

        if (hour == 0 && minute < 45) {
            hour = 23;
            minute = fullMinutes + minute - 45;
        } else if (minute < 45) {

            hour--;
            minute = fullMinutes + minute - 45;
        } else {

            minute -= 45;
        }
        System.out.println(hour + " " + minute);

    }
}

/*
원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다.
어차피 알람 소리를 들으면,
알람을 끄고 조금 더 잘 것이기 때문이다.
이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
*/
