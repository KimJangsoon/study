package silver.silver3;

import java.util.Scanner;
import java.util.Stack;

public class Ex1874_clear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int N = sc.nextInt();

        int stanNum = 0;

        while (N -- > 0) {
            int inputNum = sc.nextInt();

            if (inputNum > stanNum) {
                for (int i = stanNum + 1; i <= inputNum; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                stanNum = inputNum;
            }
            else if (stack.peek() != inputNum) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');

        }
        System.out.println(sb);
    }
}
