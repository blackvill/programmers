import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        ArrayList<String> list = new ArrayList<>();
        int[] answer = {0, 0};
        
        for (int i = 0; i < words.length; i++) {
            // 이미 나왔던 단어
            if (list.contains(words[i])) {
                // 사람
                answer[0] = (i % n) + 1;
                // 차례
                answer[1] = (i / n) + 1;
                break;
            }
            
            // 리스트에 넣기
            list.add(words[i]);
            
            // 끝말잇기가 잘못된 경우
            if (i > 0 && words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1) ) {
                // 사람
                answer[0] = (i % n) + 1;
                // 차례
                answer[1] = (i / n) + 1;
                break;
            }
        }
        return answer;
    }
}