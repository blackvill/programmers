import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        // people 오름차순 정렬
        Arrays.sort(people);
        
        // 왼쪽과 오른쪽
        int left = 0;
        int right = people.length - 1;
        
        // 서로 만날때까지 반복
        while (left <= right) {
            // 가장 작은 사람 + 가장 큰 사람이 제한보다 작으면
            if (people[left] + people[right] <= limit)
                // 작은사람이 탄 것으로 간주
                left++;
            // 큰사람은 항상 보트에 탐
            right--;
            // 보트 횟수 증가
            answer++;
        }
        
        return answer;
    }
}