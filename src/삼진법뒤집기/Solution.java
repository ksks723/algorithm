package 삼진법뒤집기;

import java.util.ArrayList;

class Solution {
    public int solution(int n) {// 내가짠거 정확성 70%
        ArrayList<Integer> mok = new ArrayList<>();
        ArrayList<Integer> nam = new ArrayList<>();
        int inx = 0;
        int answer = 0;
        while (n > 3) {
            mok.add(n / 3);
            nam.add(n % 3);
            n = mok.get(inx++);
        }

        int[] an = new int[nam.size()+1];
        for (int i = 0; i < nam.size(); i++) {
            an[i] = nam.get(i);
        }
        an[nam.size()] = mok.get(mok.size()-1);

        int tt = nam.size();
        for(int i = 0; i<an.length;i++){
            answer+=an[i]*Math.pow(3,tt--);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int answer = s.solution(45);
        System.out.println(answer);
    }
}