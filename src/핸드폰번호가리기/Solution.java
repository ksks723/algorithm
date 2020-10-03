package 핸드폰번호가리기;

public class Solution {
    public static void main(String[] args) {
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
    }
}
