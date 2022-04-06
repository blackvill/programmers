class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        
        // 소문자로 변경
        s = s.toLowerCase();
        
        // 문자열의 길이가 4 or 6인지 체크
        if (len != 4 && len != 6)
            answer = false;
        
        // 위에서 안맞으면 체크할 필요없으니까 조건으로 줌
        if (answer) {
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                
                // 알파벳이 있는지 체크
                if (c >= 'a' && c <= 'z') {
                    // 있으면 false로 변경 후 탈출
                    answer = false;
                    break;
                }
            }
        }
        
        return answer;
    }
}