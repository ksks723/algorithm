package 같은숫자는싫어;

import java.util.ArrayList;
import java.util.Arrays;

class Solution { //내가 풀고있는거
    public int[] solution(int[] arr) {
       ArrayList<Integer> list = new ArrayList<>();
       int preNum = 10;
       for(int num: arr){
           if(preNum != num)
               list.add(num);
           preNum = num;
       }
       int[] answer = new int[list.size()];
       for(int i =0; i<answer.length; i++){
           answer[i] = list.get(i).intValue();
       }

        return answer;
    }
}

class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = s.solution(new int[]{1, 2, 2, 5, 5, 2, 6});
        for(int j : answer){
            System.out.println(j);
        }
        System.out.println(Arrays.toString(answer)); //배열값 한번에 뽑기
    }
}
