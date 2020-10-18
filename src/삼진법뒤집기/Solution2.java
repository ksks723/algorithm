package 삼진법뒤집기;

import java.util.Stack;

public class Solution2 {  //통과하는 코드
    public int solution(int n) {
        int answer =0;
        int division;
        int lastValue;

        Stack<Integer> s = new Stack<>();

        while (true){
            division = n/3;
            lastValue = n%3;
            s.push(lastValue);
            n = division;
            if(division ==0)break;
        }
        int s_length = s.size();
        for(int i=0; i<s_length;i++){
            answer += (int)(s.pop()*Math.pow(3,i));
        }

        return answer;
    }
}
