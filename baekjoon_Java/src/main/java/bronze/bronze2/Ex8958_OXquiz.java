package bronze.bronze2;

import java.util.Scanner;

public class Ex8958_OXquiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[sc.nextInt()];


        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < strArr.length; i++) {
            int sum = 0;
            int oCnt = 0;
            for (int j = 0; j < strArr[i].length(); j++) {
                if (strArr[i].charAt(j) == 'O') {
                    oCnt++;
                } else {
                    oCnt = 0;
                }
                sum += oCnt;
            }
            System.out.println(sum);

        }

    }
}
