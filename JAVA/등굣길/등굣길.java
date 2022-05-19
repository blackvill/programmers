class Solution {
    static int dev = 1000000007;
    
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[m][n];

        // 웅덩이가 있는 곳이라면 -1로 초기화해준다.
        for (int i = 0; i < puddles.length; i++) {
            dp[puddles[i][0] - 1][puddles[i][1] - 1] = -1;
        }

        // 시작 위치는 무조건 1번
        dp[0][0] = 1;

        for (int i = 0; i < m; i++) { // 시작점은 1로 저장
            for (int j = 0; j < n; j++) {
                // 웅덩이면 0으로 바꾸고 continue
                if (dp[i][j] == -1) {
                    dp[i][j] = 0;
                    continue;
                }

                // 맨 위와 맨 왼쪽의 경우는 웅덩이가 없는 이상 1이므로
                // 해당하는 경우를 제외하고는 합을 구한다
                if (i != 0)
                    dp[i][j] += dp[i - 1][j] % dev; 
                if (j != 0)
                    dp[i][j] += dp[i][j - 1] % dev;
            }
        }

        return dp[m - 1][n - 1] % dev;
    }
}