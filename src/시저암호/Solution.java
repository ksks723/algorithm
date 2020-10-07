package 시저암호;

public class Solution {
    public static void main(String[] args) {
        String s = "a Z z";
        int n = 7;
        char[] cc = s.toCharArray();
        for (int i = 0; i < cc.length; i++) {
            if ((int) (cc[i]) == 32) {
                continue;
            } else {
                int temp = (int) (cc[i]) + n;
                if(temp>90 && temp<97 || temp>122){
                    temp-=26;
                }//이쯤에서 뭘 어떻게 바꾸면 될거같은디
                cc[i] = (char) temp;
            }
        }
        String answer = new String(cc);
        System.out.println(cc);

    }
}
