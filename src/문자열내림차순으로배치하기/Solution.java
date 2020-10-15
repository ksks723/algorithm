package 문자열내림차순으로배치하기;

public class Solution {
    public String solution(String s){
        String answer = "";
        char[] ch = s.toCharArray();
        int tt = (int)ch[0];

        for(int i =ch.length-1;i>0;i--){   //bcdefgZ 왜 이렇게 나오니 //버블정렬제대로 안해서 이렇게나옴
            for(int j=0; j<i; j++){
                if((int)ch[j]<(int)ch[j+1]){
                    tt=(int)ch[j];
                    char c = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = c;
                }
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
