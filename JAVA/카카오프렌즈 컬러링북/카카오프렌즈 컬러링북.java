class Solution {
    static int numberOfArea;
    static int maxSizeOfOneArea;
    static int area = 0;
    static boolean[][] check;
    
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int[] solution(int m, int n, int[][] picture) {
        // 전역에서 초기화 해주면 틀림
        // 내부에서 초기화 해주면 통과
        numberOfArea = 0;
        maxSizeOfOneArea = 0;
        
        int[] answer = new int[2];
        check = new boolean[m][n];
        
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 0이 아니고, 방문한 적이 없다면
                if (picture[i][j] != 0 && !check[i][j]) {
                    // 영역의 수 1 증가
                    numberOfArea++;
                    // dfs 탐색
                    dfs(i, j, picture);
                }
                // 한 영역의 탐색이 모두 끝났다면, 조건에 따라 최대 영역의 수를 변경.
                maxSizeOfOneArea = area < maxSizeOfOneArea ? maxSizeOfOneArea : area;
                area = 0;
            }
        }
        
        // 15. 각 값을 answer 배열에 담아주고 끝.
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        return answer;
    }

    public static void dfs(int x,int y, int[][] picture) {
        if (check[x][y])
            return;
        
        check[x][y] = true;
        // 영역의 수 증가.
        area++;
        
        // 사방탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            // 범위를 벗어나는지 체크
            if (nx < 0 || nx >= picture.length || ny < 0 || ny >= picture[0].length)
                continue;
            
            // 현재 색 == 상,하,좌,우 색 && 방문한적 없다면.
            if (picture[x][y] == picture[nx][ny] && !check[nx][ny]) {                
                // DFS 탐색
                dfs(nx, ny, picture);
            }            
        }        
    }
}