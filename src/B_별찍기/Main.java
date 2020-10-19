package B_별찍기;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int i = 1; i<=num ; i++) {
            for(int j=num;j>0;j--){

                if(j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
