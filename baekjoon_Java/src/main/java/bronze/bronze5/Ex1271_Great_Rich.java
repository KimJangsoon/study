package bronze.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex1271_Great_Rich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = sc.nextBigInteger();
        BigInteger num2 = sc.nextBigInteger();


        System.out.println(num1.divide(num2));
        System.out.println(num1.remainder(num2));
    }
}
