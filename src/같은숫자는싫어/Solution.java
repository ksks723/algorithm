package 같은숫자는싫어;

import java.util.ArrayList;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length-1; i++){

            if(arr[i]!=arr[i+1]  ){
                list.add(arr[i]);
            }

        }
        System.out.println(list.toString());
        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = s.solution(new int[]{1,2,2, 5,5, 2, 6});
        System.out.println(answer);
    }
}
