import java.util.HashMap;
import java.util.Map;

public class All {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hash = new HashMap<>();
        for (String arg : participant) hash.put(arg, hash.getOrDefault(arg, 0) + 1);
        for (String arg : completion) hash.put(arg, hash.get(arg) - 1);

        for (String key : hash.keySet()) {
            if (hash.get(key) != 0) return key;
        }

        return null;
    }

    public static void main(String[] args) {
        String[] people = {"Mike","Anna","Mike","Harry","Herry"};
        Map<String, Integer> map = new HashMap<>();
        for(String a : people) {
            map.put(a, map.getOrDefault(a, 0)+1);
            System.out.println("뭐가나올까나" + map);
        }
    }
}
