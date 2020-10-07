package 문자열을정수로바꾸기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int answer = 0;
        answer = Integer.parseInt(s);
        System.out.println(answer);
    }
}
