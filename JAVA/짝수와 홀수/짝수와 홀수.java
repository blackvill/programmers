class Solution {
    public String solution(int num) {
        String answer = "";
        
        // 음수일때도 처리를 해줘야하는데
        // 그러기 위해 절대값으로 처리
        num = Math.abs(num);
        
        // 홀수일 때
        if (num % 2 == 1) {
            answer = "Odd";
        }
        // 짝수일 때
        else {
            answer = "Even";
        }
        
        return answer;
    }
}