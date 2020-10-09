package 문자열내마음대로정렬하기;


import java.util.*;

class Solution { //다른사람풀이임
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                // n번째 문자가 같을 경우에 원본 스트링을 사전순으로
                if(c1 == c2){
                    return s1.compareTo(s2);
                } else return c1 - c2;
            }
        });

        return strings;
    }
}

class Solution2 { //내가하려던거랑비슷한거
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
}

class Solution3{
    public String[] solution(String[] strings, int n){
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0; i<strings.length; i++){
            arr.add(""+strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for(int i = 0; i<arr.size();i++){
            answer[i] = arr.get(i).substring(1);
        }
        return  answer;
    }
}

class Main{
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        String[] answer = s.solution(new String[]{"sun","bed","car"},1);
        System.out.println(Arrays.toString(answer));
    }
}