package 가운데글자가져오기;

public class Solution {
    public String solution(String s){
        String answer = "";
        char[] arr = s.toCharArray();
        if(arr.length%2==1){
            answer = String.valueOf(arr[arr.length/2]);
        }else{
                answer += String.valueOf(arr[arr.length/2-1]);
                answer += String.valueOf(arr[arr.length/2]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String answer = s.solution("abcde");
        System.out.println(answer);
        answer = s.solution("qwer");
        System.out.println(answer);
    }
}
