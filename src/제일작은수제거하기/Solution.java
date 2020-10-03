package 제일작은수제거하기;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 1};

        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length <= 1) {
            arr[0] = -1;
        } else {
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            int min = Collections.min(list);
            int index = list.indexOf(min);

            list.remove(index);
            int[] array = new int[list.size()];

            for(int i = 0; i<list.size();i++){
                array[i] = list.get(i);
            }
            System.out.println(array.length);

        }

    }
}
