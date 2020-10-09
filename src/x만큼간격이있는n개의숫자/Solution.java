package x만큼간격이있는n개의숫자;

import java.util.Arrays;

public class Solution {//x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴
    public long[] solution(int x, int n){
        long[] answer = new long[n];
        long y = x;
        for(int i=0; i < n;i++){
            answer[i] = (i == 0) ? y: y+y*i;
        }
        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        long[] answer = s.solution(0,7);
        System.out.println(Arrays.toString(answer));
    }
}
