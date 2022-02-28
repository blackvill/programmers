import java.util.*;
import java.io.*;

class Solution {
    static HashMap<String, Integer> set;
    
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        set = new HashMap<>();
        
        for (int i = 0; i < participant.length; i++) {
            if (set.containsKey(participant[i]))
                set.put(participant[i], set.get(participant[i]) + 1);
            else
                set.put(participant[i], 1);
        }
        for (int i = 0; i < completion.length; i++) {
            set.put(completion[i], set.get(completion[i]) - 1);
        }
        
        for (int i = 0; i < participant.length; i++) {
            if (set.get(participant[i]) == 1) {
                answer = participant[i];
                break;
            }
        }
        
        return answer;
    }
}