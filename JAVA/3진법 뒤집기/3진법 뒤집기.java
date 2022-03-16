class Solution {
    public int solution(int n) {
        // 3진수로 변환
        String s = Integer.toString(n, 3);
        String word = "";
        
        // 3진수 뒤집기
        for (int i = s.length() - 1; i >= 0; i--) {
            word += s.charAt(i);
        }
        
        // 10진수로 변환
        int answer = Integer.parseInt(word, 3);
        
        return answer;
    }
}