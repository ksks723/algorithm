package 문자열내림차순으로배치하기;

import java.util.Arrays;

public class Solution2 { //런타임 초과
    public String solution(String s){  //StringBuilder 을 사용

        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        return new StringBuilder(new String(ch)).reverse().toString();
    }
}

class Main2{
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String answer = s.solution("Zbcdefg");
        System.out.println(answer);
    }
}
