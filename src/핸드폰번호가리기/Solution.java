package 핸드폰번호가리기;

public class Solution {
    public static void main(String[] args) {
        //내가 푼거
        String phone_number= "123456789";
        String answer = "";
        String ss = "";
        String dd = "";
        ss = phone_number.substring(0, phone_number.length()-4) ;
        answer = phone_number.substring(phone_number.length()-4,phone_number.length());
        for(int i = 0; i<ss.length()-1;i++){
           dd+="*";
        }
        dd+=answer;
        System.out.println("최종적으로 찍어보기"+dd);





        //남이푼거

        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
         String.valueOf(ch);
    }

}
