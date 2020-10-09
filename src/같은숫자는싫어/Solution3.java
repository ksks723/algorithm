package 같은숫자는싫어;

import java.util.ArrayList;

import java.util.*;

public class Solution3{
    public int[] solution(int []arr) {
        int[] answer = {};

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i =0; i<arr.length-1; i++) {
            if(arr[i]==arr[i+1]) {
                if(i==arr.length-2) {
                    //마지막 i라면
                    temp.add(arr[i+1]);
                }
                continue;
            }else{
                temp.add(arr[i]);
                if(i==arr.length-2) {
                    //마지막 i라면
                    temp.add(arr[i+1]);
                }
            }
        }
        answer = new int[temp.size()];
        for(int i =0; i<temp.size();i++) {
            answer[i] = temp.get(i);
        }
        return answer;
    }
}


class Main3 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = s.solution(new int[]{1, 2, 2, 5, 5, 2, 6});
        System.out.println(answer);
    }
}