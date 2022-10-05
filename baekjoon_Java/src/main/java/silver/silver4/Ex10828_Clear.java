package silver.silver4;

import java.util.Scanner;
import java.util.Stack;

public class Ex10828_Clear {

    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String s = sc.next();

            switch (s) {
                case "push":
                    int x = sc.nextInt();
                    stack.push(x);
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static int pop() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            int tmp = stack.peek();
            stack.pop();
            return tmp;
        }
    }

    public static int size() {
        return stack.size();
    }

    public static int empty() {
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int top() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.peek();
        }
    }
}



/*
package silver.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex10828_Clear {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        stack = new int[N];

        for (int i = 0; i < N; i++) {

            String str = sc.next();
            switch (str) {

                case "push":
                    int x = sc.nextInt();
                    push(x);
                    break;

                case "pop":
                    sb.append(pop()).append("\n");
                    break;

                case "size":
                    sb.append(size()).append("\n");
                    break;

                case "empty":
                    sb.append(empty()).append("\n");
                    break;

                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }

    public static void push(int idxNum) {
        stack[size] = idxNum;
        size++;
    }
    public static int pop(){
        if(size == 0){
            return -1;
        } else {
            int popNum = stack[size-1];
            size--;
            return popNum;
        }
    }
    public static int size(){
        return size;
    }
    public static int empty(){
        if (size == 0){
            return 1;
        } else {
            return 0;
        }
    }
    public static int top(){
        if (size == 0){
            return -1;
        } else {
            return stack[size-1];
        }
    }
}
*/
