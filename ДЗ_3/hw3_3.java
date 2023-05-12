import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class hw3_3 {
    public static void main(String[] args){
        String message = "Сатурн, Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун, Юпитер, Плутон";
        String [] words = message.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
 
        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if(!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }
 
        for(String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
}