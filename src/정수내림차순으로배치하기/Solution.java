package 정수내림차순으로배치하기;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{25,65,33,27,85,33,1,3};
        int size = arr.length;

        //버블정렬 sort안쓰고 해보기
        for(int i=0; i < size-1; i++) {
            System.out.printf("\n버블 정렬 %d 단계 : ", i + 1);
            for(int j=0; j < size -1 -i; j++) {
                if(arr[j] > arr[j+1])
                    swap(arr, j, j+1);
                System.out.printf("\n");
                for(int k=0; k < size; k++) {
                    System.out.printf("%4d", arr[k]);
                }
            }

        }







    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
