package 수박수박수;

import java.util.Scanner;

public class Subak{
    public String solution(int n) {
        String answer = "";
        for(int i = 1; i<=n; i++) {
            answer += (i%2==1) ? "수":"박";
        }

        return answer;
    }



}
