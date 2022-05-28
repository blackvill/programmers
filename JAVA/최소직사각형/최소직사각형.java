class Solution {
    public int solution(int[][] sizes) {
        int row = 0;
        int col = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            // 가로와 세로를 비교해 긴 것을 가로, 짧은 것을 세로로 지정
            int x = Math.max(sizes[i][0], sizes[i][1]);
            int y = Math.min(sizes[i][0], sizes[i][1]);
            
            // 가로 길이 중 더 큰 것을 사용
            row = Math.max(row, x);
            // 세로 길이 중 더 큰 것을 사용
            col = Math.max(col, y);
        }
        
        // 가장 긴 가로와 세로를 사용해 곱으로 넓이를 구해주기
        return row * col;
    }
}