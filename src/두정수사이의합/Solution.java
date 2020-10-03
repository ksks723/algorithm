package 두정수사이의합;

class Solution {  //생각보다 어렵..

    int numberOfPrime(int n, int g) {
        int result = 0;
        if(n==g){
            return g;
        }else if(n<g){
            for(int i = n; i<=g; i++){
                result += i;
            }
        }else{
            for(int i = g; i<=n; i++){
                result += i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numberOfPrime(3, 5));
    }

}