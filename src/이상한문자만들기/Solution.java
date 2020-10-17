package 이상한문자만들기;

public class Solution {
    public String solution(String s){
        String answer = "";
        String[] arr = s.split(" ");
        for(int i = 0; i<arr.length;i++){
            for(int j=0; j<arr[i].length();j++){
                if(arr[i].charAt(j)%2==0){
                    char c = Character.toUpperCase(arr[i].charAt(j));
                    System.out.println(c);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String answer = s.solution("try hello world"); //TrY HeLlO WoRlD  이게 나와야함
        System.out.println(answer);
    }
}
