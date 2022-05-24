class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for (long i = 0; i * i <= n; i++) {
            // 제곱이 n이라면
            if (i * i == n)
                // i + 1의 제곱을 넣어줌
                answer = (i + 1) * (i + 1);
        }
        
        // 값이 들어가있지 않으면 -1을 리턴, 있다면 answer 리턴
        return answer == 0 ? -1 : answer;
    }
}