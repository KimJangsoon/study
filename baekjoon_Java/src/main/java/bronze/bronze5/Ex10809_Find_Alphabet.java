package bronze.bronze5;

import java.util.Scanner;

public class Ex10809_Find_Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        String msg = sc.nextLine();

        for (int i = 0; i < msg.length(); i++) {
            char chr = msg.charAt(i);

            if (arr[chr - 'a'] == -1) {
                arr[chr - 'a'] = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
