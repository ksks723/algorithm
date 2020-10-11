package 실패율;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Solution { //이거 이해하고 함수사용하는 코드로 넘어가던가 말던가
    public int[] solution(int N, int[] stages) {
        int stagesCount= stages.length;
        ArrayList<Integer> copySta = new ArrayList<>();

        //fail부분은 index 1부터 사용할래
        int[] failCount = new int[N+1];
        double[] failP = new double[N+1];

        for(int i= 0; i< failCount.length; i++){
            failCount[i] = 0;
        }
        for(int i = 0; i< failP.length;i++){
            failP[i] =0.0;
        }
        for(Integer integer : stages){
            copySta.add(integer);
        }
        for(int i = 1;i<=N;i++){
            for(Integer integer : copySta){
                if(integer == i){
                    failCount[i]++;
                }
            }
        }
        for(int i = 1;i<failCount.length;i++){
            System.out.println("failCount : "+failCount[i] + "stagesCount : "+stagesCount+
                    "p : "+(double)failCount[i]/stagesCount);
            failP[i]=(double)failCount[i]/stagesCount;
            stagesCount -= failCount[i];
        }

        HashMap<Integer, Double> pair = new HashMap<>();
        for(int i =1;i<=N;i++){
            pair.put(i,failP[i]);
        }
        int[] sortTemp = new int[pair.size()+1];
        Iterator<Integer> keys = pair.keySet().iterator();
        int index = 1;
        while (keys.hasNext()){
            sortTemp[index] = keys.next();
            index++;
        }
        for(int i = 1; i<=sortTemp.length;i++){
            for(int j =1; j <= sortTemp.length -i-1; j++){
                if(pair.get(sortTemp[j]) < pair.get(sortTemp[j+1])) {
                    int temp = sortTemp[j+1];
                    sortTemp[j+1] = sortTemp[j];
                    sortTemp[j] = temp;
                }
            }
        }
        int[] answer = new int[sortTemp.length-1];
        for(int i = 1;i<sortTemp.length;i++){
            answer[i-1] = sortTemp[i];
        }

        return answer;
    }
}

class Main{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] answer = s.solution(4,new int[]{4,4,4,4});
        System.out.println(Arrays.toString(answer));
    }
}