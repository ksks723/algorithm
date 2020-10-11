package 콜라츠추측;

class Solution {
    int answer=0;
    public int solution(int num) {
        if(num == 1){
            return answer;
        }
        if(answer==500){
            return -1;
        }
        answer++;
        if (num % 2 == 1) {
            // 홀수
            return solution(num * 3 + 1);
        } else{
            // 짝수
            return solution(num / 2);
        }
    }
}


class Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        int answer = s.solution(723);
        System.out.println(answer);
    }
}
