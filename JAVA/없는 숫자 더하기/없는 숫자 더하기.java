import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0; // 정답
        int index = 0; // 배열의 위치를 가리킬 인덱스
        
        // 오름차순으로 정렬
        Arrays.sort(numbers);
        
        // 0~9까지 포함된 숫자를 체크하기 위해
        // 0~9까지 반복
        for (int i = 0; i < 10; i++) {
            // 배열의 위치가 numbers의 길이보다 작고
            // 배열의 인덱스 위치 값이 i와 같다면
            if (index < numbers.length && numbers[index] == i) {
                index++; // 인덱스 값 증가
                continue;
            }
            // 아니라면 없다는 뜻이니까 answer에 값 더하기
            answer += i;
        }
        
        return answer;
    }
}
