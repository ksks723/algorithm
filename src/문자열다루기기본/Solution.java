package 문자열다루기기본;

class Solution {
    public boolean solution(String s) {
        if(!(s.length() == 4 || s.length() == 6)) return false;

        for(int i=0; i<s.length(); i++) {

            if(!((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57))
                return false;
        }

        return true;
    }
}

class C{
    public static void main(String[] args) {
        Solution s = new Solution();
       s.solution("ddfsdf");

    }
}