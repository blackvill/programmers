class Solution {
    public int[] solution(int n) {
        int num = 1;
        int a = -1;
        int b = 0;
        int[][] map = new int[n][n];

        // n의 갯수 == 꺾는 횟수
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // 아래
                if (i % 3 == 0) {
                    a++;
                }
                // 왼쪽
                else if (i % 3 == 1) {
                    b++;
                }
                // 위
                else if (i % 3 == 2) {
                    a--;
                    b--;
                }
                
                map[a][b] = num;
                num += 1;
            }
        }
        
        int k = 0;
        // n * (n + 1) / 2가 제일 마지막 숫자
        int[] answer = new int[(n * (n + 1)) / 2];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                // 0이면 삼각형의 모양을 벗어난 곳
                if(map[i][j] == 0)
                	break;
                
                answer[k++] = map[i][j];
            }
        }

        return answer;
    }
}