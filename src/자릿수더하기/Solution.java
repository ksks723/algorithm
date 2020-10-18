package 자릿수더하기;

import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String d = String.valueOf(n);
        System.out.println(d);
        for(int i = 0; i<d.length();i++){
            answer += Integer.parseInt(String.valueOf(d.charAt(i)));
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int answer = s.solution(123);
        System.out.println(answer);
    }
}
