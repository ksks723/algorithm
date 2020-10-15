package 문자열내림차순으로배치하기;

import java.util.Arrays;

public class Solution2 {
    public String Solution2(String str){
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Solution2 rs = new Solution2();
        System.out.println( rs.Solution2("Zbcdefg") );
    }
}
