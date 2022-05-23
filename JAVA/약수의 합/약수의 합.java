class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1부터 n까지
        for (int i = 1; i <= n; i++) {
            // 나머지가 0이면 약수
            if (n % i == 0)
                answer += i; // 값 더하기
        }
        
        return answer;
    }
}