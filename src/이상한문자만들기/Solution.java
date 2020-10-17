package 이상한문자만들기;

import java.util.ArrayList;

public class Solution {
    public String solution(String s) {  //안되는 거 이유 파악하기
        ArrayList<String> list = new ArrayList<>();
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String answer = "";
            String[] index = arr[i].split("");

            for (int j = 0; j < index.length; j++) {
                if (j % 2 == 0) {
                    answer += index[j].toUpperCase();
                } else {
                    answer += index[j].toLowerCase();
                }
            }
            list.add(answer);
        }

        return String.join(" ", list);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String answer = s.solution("try hello world"); //TrY HeLlO WoRlD  이게 나와야함
        System.out.println(answer);
    }
}
