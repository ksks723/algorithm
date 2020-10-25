package 크레인인형뽑기게임;

import java.util.Stack;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int ii =0;
        Stack<Integer> ss = new Stack<>();
        for(int i = 0; i< moves.length;i++){
            for(int j = 0;j<board.length;j++){
                if(board[j][moves[i]-1] != 0){
                    ss.push(board[j][moves[i]-1]);
                    break;
                }
            }
        }
        System.out.println(ss);

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int answer = s.solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4});
        System.out.println(answer);
    }
}
