import java.util.*;

class Solution {
    public int[] solution(long n) {
        // long의 크기를 배열로 만들기 힘드니 str로 변환
        String str = n + "";
        // str의 길이만큼으로 배열 생성
        int[] answer = new int[str.length()];
        
        // 인덱스값
        int idx = 0;

        while (n > 0) {
            // 인덱스값을 늘리면서 각 자릿수의 값을 넣기
            answer[idx++] = (int)(n % 10);
            // 이미 넣은 자릿수는 없애주기위해 10으로 나누기
            n /= 10;
        }
        
        return answer;
    }
}