package gold.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Ex2493_clear {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = sc.nextInt();
        int[] top = new int[N]; // 타워 높이 저장, 타워 번호는 0-1, 1-2 , ...
        int[] signals = new int[N]; // 자신의 신호를 받은 탑의 번호를 저장할 배열

        String[] input = br.readLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            top[i] = Integer.parseInt(input[i]);
        }

        Stack<Integer> stack = new Stack<Integer>();
        int j = N - 1;
        while (j >= 0) {

            if (stack.isEmpty() || top[j] < top[stack.peek()]) {
                stack.push(j);
                // System.out.println(top[j]);
                j--;
            } else if (top[j] >= top[stack.peek()]) {
                signals[stack.peek()] = j + 1;
                stack.pop();
            }
        }

        for (int i : signals) {
            System.out.print(i + " ");
        }
    }
}