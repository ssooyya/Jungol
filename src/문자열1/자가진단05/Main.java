package 문자열1.자가진단05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String str = str1 + str2;
        System.out.println(str.length());
        sc.close();
    }
}
