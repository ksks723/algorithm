package 체육복;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n- lost.length;

        for(int i =0;i< reserve.length;i++){
            for(int j=0;j<lost.length;j++){
                if(reserve[i]+1 == lost[j] ){
                    answer++;
                    lost[j] = 0;
                    reserve[i]=0;
                }else if(reserve[i]-1 ==lost[j]){
                    answer++;
                }
            }
        }

        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        int answer = s.solution(5,new int[]{2,4},new int[]{1,3,5});
        System.out.println(answer);
    }
}