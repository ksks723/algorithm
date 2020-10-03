package 정수내림차순으로배치하기;

public class Solution {
    public static void main(String[] args) {
        long anwer = 0;
        long n = 118637;

        String nn = Long.toString(n);
        int[] arr = new int[nn.length()];
        for(int i = 0; i<nn.length();i++){
            arr[i] = nn.charAt(i);

        }


        //버블정렬 sort안쓰고 해보기
        for(int i = 0 ; i< arr.length ; i++){
            for(int j = 0; j<arr.length; j++ ){
                if(arr[i]>arr[j]){

                }

            }
        }


    }
}
