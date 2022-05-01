import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 각 문자를 잘라서 배열에 담아주기
        char[] str = s.toCharArray();
        
        // 오름차순으로 정렬
        Arrays.sort(str);
        
        // 오름차순으로 정렬되어있으므로 역순으로 answer에 넣어주기
        for (int i = str.length - 1; i >= 0; i--) {
            answer += str[i];
        }
        
        return answer;
    }
}