package 문자열내림차순으로배치하기;

public class Solution {
    public String solution(String s){
        String answer = "";
        char[] ch = s.toCharArray();
        int tt = (int)ch[0];

        for(int i =1;i <= ch.length-1;i++){   //bcdefgZ 왜 이렇게 나오니
            if(tt<(int)ch[i]){
                tt =(int)ch[i];
                char c = ch[i-1];
                ch[i-1] = ch[i];
                ch[i] = c;
            }
        }
        for(int i =0;i<ch.length;i++){
            answer += ""+ch[i];
        }

        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        String answer = s.solution("Zbcdefg");
        System.out.println(answer);
    }
}
