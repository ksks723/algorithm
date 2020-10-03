package 소수찾기;

class Solution{  //생각보다 어렵..

    int numberOfPrime(int n) {
        int result = 0;
        for(int i=2; i<=n; i++){
            for(int j=2; j<=i; j++){
                if(j == i){
                    ++result;
                } else if(i%j == 0){
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution prime = new Solution();
        System.out.println( prime.numberOfPrime(10) );
    }

}
