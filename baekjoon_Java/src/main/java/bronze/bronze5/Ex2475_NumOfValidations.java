package bronze.bronze5;

import java.util.Scanner;

public class Ex2475_NumOfValidations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        int valNum = ((n1 * n1) + (n2 * n2) + (n3 * n3) + (n4 * n4) + (n5 * n5)) % 10;

        System.out.println(valNum);
    }
}
