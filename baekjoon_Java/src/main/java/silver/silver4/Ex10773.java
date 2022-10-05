package silver.silver4;

import java.util.Scanner;
import java.util.Stack;

public class Ex10773 {

    private static Stack<Integer> stack;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < K; i++) {
            int num = sc.nextInt();
            cal(num);

        }
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        System.out.println(sum);
    }

    public static void cal(int num) {
        if (num == 0) {
            stack.pop();
        } else {
            stack.push(num);
        }
    }
}
