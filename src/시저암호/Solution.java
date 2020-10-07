package 시저암호;

public class Solution {
    public static void main(String[] args) {
        String s = "a Z z A";
        int n = 7;
        char[] cc = s.toCharArray();
        for (int i = 0; i < cc.length; i++) {
            int temp = (int) (cc[i]) ;
            if (temp == 32) {
                continue;
            }else if(65<=temp && temp <=90 ){
                if(temp+n<=90){
                    cc[i] = (char)(temp+n);
                }else{
                    cc[i] = (char)(temp+n-26);
                }
            } else if(97<=temp && temp <=122){
                if(temp+n<=122){
                    cc[i] = (char)(temp+n);
                }else{
                    cc[i] = (char)(temp+n-26);
                }
            }

        }
        String answer = new String(cc);
        System.out.println(cc);

    }
}
