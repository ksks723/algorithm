package 이상한문자만들기;

class Solution2 {
    public String solution(String s) { //참고하면 좋은 코드
        char[] chars = s.toCharArray();
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ')
                idx = 0;
            else
                chars[i] = (idx++ % 2 == 0 ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]));
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String answer = s.solution("try hello world");
        System.out.println(answer);
    }
}
