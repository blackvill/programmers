class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            for (int j = 0; j < n; j++) {
                // 'z'면 'a'로 변경
                // 변경하면서 +1이 진행된 것이니까 continue 해줌
                if (c == 'z') {
                    c = 'a';
                    continue;
                }
                // 'Z'면 'A'로 변경
                // 변경하면서 +1이 진행된 것이니까 continue 해줌
                else if (c == 'Z') {
                    c = 'A';
                    continue;
                }
                // 공백이면 그냥 넘어가기
                else if (c == ' ')
                    break;
                c += 1;
            }
            
            answer += c; // 정답에 더하기
        }
        
        return answer;
    }
}