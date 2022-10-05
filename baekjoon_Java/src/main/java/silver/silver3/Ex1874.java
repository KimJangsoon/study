package silver.silver3;

import java.util.*;

public class Ex1874 {
    private static Stack<Integer> stack;
    private static int[] intArr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        intArr = new int[n];

        /*for (int i = 1; i <= intArr.length; i++) {
            intArr[i-1] = i;
        }*/
        stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            intArr[i] = num;
            if (i == 0) {
                for (int j = 0; j < num; j++) {
                    sb.append(push());
                }
            } else {
                if (i == 1 && intArr[i] == intArr[i - 1] - 1) {
                    sb.append(pop());
                    sb.append(pop());
                } else if (i > 0 && intArr[i] == intArr[i - 1] - 1) {
                    sb.append(pop());
                } else if (num > Max()) {
                    for (int j = 0; j < num - Max(); j++) {
                        sb.append(push());
                    }
                    sb.append(pop());
                } else if (i > 0 && intArr[i] < intArr[i - 1] - 1) {
                    sb.append(pop());
                }
            }
        }
        for (int i = 0; i < intArr.length; i++) {
            int half = intArr.length / 2;
            int length = intArr.length;
            for (int j = half; j < length; j++) {
                if (j == half + 1 && intArr[j] > intArr[j - 1]) {
                    System.out.println("NO");
                    break;
                }
            }
        }
        System.out.println(sb);
    }

    public static String push() {
        return "+"+"\n";
    }

    public static String pop() {
        return "-"+"\n";
    }

    public static int Max() {
        int max = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }
        return max;
    }
}
