package 예싼;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) { //[1,3,2,5,4]	9	3
        int answer = 0;
        int sum =0;
        Arrays.sort(d);
        for(int g : d){
           budget -= g;
           if(budget<0)break;
           answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        int answer = s.solution(new int[]{1,3,2,5,4},9);
        System.out.println(answer);
    }


    /*  내가하려던거 정확성 반타작

    class Solution {
  public int solution(int[] d, int budget) { //[1,3,2,5,4]	9	3
        int answer = 0;
        int sum =0;
        for(int g : d){
            if(sum+g == budget){
                ++answer;
                return answer;
            }else if(sum+g> budget){
                continue;
            }else if(sum+g <budget){
                ++answer;
                sum += g;
            }
        }
        return answer;
    }
}

    */
}
