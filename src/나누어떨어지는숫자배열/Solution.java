package 나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<arr.length;i++){
            if(arr[i]%divisor==0 ){
                list.add(arr[i]);
            }
        }

        if (list.isEmpty()){
            return new int[]{-1};
        }else{
            int[] answer = new int[list.size()];
            for(int i =0;i<list.size();i++){
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
            return  answer;
        }



    }
}

class Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = s.solution(new int[]{5,9,7,10},10);
        System.out.println(Arrays.toString(answer));
    }
}
