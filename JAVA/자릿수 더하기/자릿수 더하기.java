import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 0보다 작을때까지
        while (n > 0) {
            // 10을 나눴을 때 나머지 더하기
            answer += n % 10;
            // 10으로 나누기
            n /= 10;
        }
        
        return answer;
    }
}