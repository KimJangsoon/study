package silver.silver4;

import java.util.Scanner;


public class Ex10828 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] stack = new int[N];
        int idx = 0;


        for (int i = 0; i < N; i++) {
            String msg = sc.next();

            switch (msg) {
                case "push":
                    stack[idx] = sc.nextInt();
                    idx++;
                    break;
                case "top":
                    if (idx == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack[idx - 1]);
                    }
                    break;
                case "size":
                    System.out.println(idx);
                    break;
                case "empty":
                    if (idx == 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "pop":
                    if (idx == 0) {
                        System.out.println(-1);
                    } else {
                        System.out.println(stack[idx - 1]);
                        idx--;
                    }
                    break;

            }
        }
    }

}
