import java.util.HashMap;
import java.util.Map;

public class String_freq {

    public static Map<String, Integer> countFrequency(String[] strings) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            String str = strings[i];
            String key = str.toLowerCase();
            if (freqMap.containsKey(key)) {
                freqMap.put(key, freqMap.get(key) + 1);
            } else {
                freqMap.put(key, 1);
            }
        }
        return freqMap;
    }

    public static void main(String[] args) {
        String[] strings = {"ab","AB","Ab","Cd","CD","eg"};
        Map<String, Integer> freqMap = countFrequency(strings);
        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

