package 정수내림차순으로배치하기;

import java.util.*;
public class NewSolution {
    public long solution(long n) {
        char[] input = Long.toString(n).toCharArray();
        Arrays.sort(input);
        long ans = 0;
        for (int i = input.length-1; i >= 0 ; i--) {
            ans += input[i] - '0';
            ans *= 10;
        }
        System.out.println(ans/10);
        return ans/10;
    }
}

