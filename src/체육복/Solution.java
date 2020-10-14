package 체육복;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n- lost.length;
        int lp = 0;
        for(int i =0;i<lost.length;i++){
            for(int j =0;j<reserve.length;j++){
                if(lost[i] == reserve[j]){
                    lp++;
                    System.out.println("lost["+lost[i]+"]  "+"reserve["+reserve[j]+"]  11111");
                    lost[i] = -1;
                    reserve[j] =-1;
                    break; //자신이 포함된 가장가까운 반복문을 벗어난다.
                }
            }
        }
        for(int i =0;i< reserve.length;i++){
            for(int j=0;j<lost.length;j++){
                if(reserve[i]+1 == lost[j] ||reserve[i]-1 ==lost[j]){

                    System.out.println("lost["+lost[j]+"]  "+"reserve["+reserve[i]+"]  2222222");
                    lost[j] = -1;
                    reserve[i]=-1;
                    answer++;
                    break; //의 차이로 정확성 하락
                }
            }
        }
        return answer+lp;
    }
}

class Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        int answer = s.solution(5,new int[]{1,2,4},new int[]{2,5});
        System.out.println(answer);
    }
}