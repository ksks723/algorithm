package 크레인인형뽑기게임;

import java.util.Stack;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> ss = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int index = moves[i] - 1;

                int k = board[j][index];
                if(k == 0) continue;
                if(!ss.empty() && ss.peek() == k){
                    ss.pop();
                    answer++;
                }else{
                    ss.push(k);
                }
                System.out.println("k찍어보기 "+k); //k 와 board[j][index] 의 차이점이뭐지
                System.out.println("board[j][index]찍어보기 "+board[j][index]);
                board[j][index] = 0;
                break;

            }
        }
        System.out.println(ss);

        return answer*2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arrs = {{0, 0, 0, 0, 0},
                        {0, 0, 1, 0, 3},
                        {0, 2, 5, 0, 1},
                        {4, 2, 4, 4, 2},
                        {3, 5, 1, 3, 1}};
        int answer = s.solution(arrs, new int[]{1, 5, 3, 5, 1, 2, 1, 4});
        System.out.println(answer);
    }
}
