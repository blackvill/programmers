class Solution {
    int solution(int[][] land) {
        int answer = 0;
        
        // 맨 아래까지 탐색
        for (int i = 1; i < land.length; i++) {
            // 열의 개수 4개
            for (int j = 0; j < 4; j++) {
                // 최고 값을 구하기 위한 변수
                int max = 0;
                
                for (int k = 0; k < 4; k++) {
                    // 이전 열과 현재열이 같으면 안됨
                    if (j == k)
                        continue;
                    // 가장 큰 수 구하기
                    max = Math.max(land[i - 1][k] , max);
                }
                // 가장 큰 수 더해주기
                land[i][j] += max;
            }
        }

        // 마지막 행의 가장 큰 값이 최고점
        answer = Math.max(land[land.length - 1][0], Math.max(land[land.length - 1][1], Math.max(land[land.length - 1][2], land[land.length - 1][3])));

        return answer;
    }
}