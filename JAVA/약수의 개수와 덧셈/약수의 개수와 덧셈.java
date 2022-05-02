class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // left부터 right까지
        for (int i = left; i <= right; i++) {
            // 홀수인지 체크
            boolean odd = false;
            
            // 제곱근이 약수가 되면 홀수            
            // 1부터 제곱이 i 까지 체크
            for (int j = 1; j * j <= i; j++) {
                // 제곱이 i라면
                if (j * j == i) {
                    // 홀수
                    odd = true;
                    break;
                }
            }
            
            // 홀수가 아니면 +, 홀수면 -
            if (!odd)
                answer += i;
            else
                answer -= i;
        }
        
        return answer;
    }
}