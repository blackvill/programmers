import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 전체를 소문자로 변환
        s = s.toLowerCase();
        
        // 문자열을 공백으로 잘라서 담기
        String[] str = s.split(" ", -1);
        
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                // 짝수번째는 대문자, 홀수번째는 소문자
                if (j % 2 == 0)
                    answer += Character.toUpperCase(str[i].charAt(j));
                else
                    answer += str[i].charAt(j);
            }
            
            answer += " ";
        }
        
        // 마지막에 공백 1개 있는것을 지워주기
        return answer.substring(0, answer.length() - 1);
    }
}