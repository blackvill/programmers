import java.util.*;

class Solution { 
    static int min = Integer.MAX_VALUE;
    // dfs를 사용하면서 값을 최대한 조금만 들고가도록
    // 전역 처리
    static int num;
    static int n;
    
    public int solution(int N, int number) {
        num = number;
        n = N;
        
        dfs(0, 0);
        
        // 8보다 크면 바로 리턴되므로
        // 최고값인 상태
        if (min == Integer.MAX_VALUE)
            return -1;
        return min;
    }
    
    public void dfs(int depth, int current) {
        // 최소값이 8보다 크면 종료
        if (depth > 8) {
            return;
        }
        
        // 표현해야 하는 숫자와 현재 값이 같으면
        if (num == current) {
            // 현재까지의 깊이와 최소값을 비교해서 갱신
            min = Math.min(depth, min);
            return;
        }
        
        int temp = 0;
            
        for (int i = 0; i < 8; i++) {
            // 깊이 + 자릿수가 8보다 작아야함
            if (depth + i < 8) {
                // 자릿수 늘리기 (2, 22, 222, 2222 이런식으로)
                temp = temp * 10 + n;
                
                // 값을 통해 사칙연산하기
                dfs(depth + i + 1, current + temp);
                dfs(depth + i + 1, current - temp);
                dfs(depth + i + 1, current / temp);
                dfs(depth + i + 1, current * temp);     
            }      
        }
    }
}