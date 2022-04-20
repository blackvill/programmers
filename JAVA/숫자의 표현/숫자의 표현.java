class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1부터 n까지 탐색
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            
            // i부터 n까지 탐색
            for (int j = i; j <= n; j++) {
                // sum에 값을 계속 더하기
                sum += j;
                
                // 결과가 나오면 횟수를 증가시키고
                // 더 이상 나올 수 없으니까 break
                if (sum == n) {
                    answer++;
                    break;
                }
                // 값을 넘어서면 탐색 필요 없으니까 break
                else if (sum > n) {
                    break;
                }
            }
        }  
        return answer;
    }
}