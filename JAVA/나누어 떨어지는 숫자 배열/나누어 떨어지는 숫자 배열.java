import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        // Arrays.stream(array).filter(요소 -> 조건)
        // Arrays.stream() == 배열의 요소를 가져오기
        // + Arrays.stream(arr, int a, int b) == arr[a]~arr[b-1]의 요소들을 들고옴
        // 조건에 해당하는 요소 == filter
        // toArray() 배열로 만들기
        // 즉, arr의 요소를 들고와 조건을 만족하는 것을 배열로 만들기
        int[] answer = Arrays.stream(arr).filter(i -> i % divisor == 0).toArray();
        
        // 배열이 비어있으면 -1을 출력해야 하므로
        if(answer.length == 0)
            answer = new int[] {-1};
        // 오름차순으로 출력해야 하므로 정렬하기
        Arrays.sort(answer);
        
        return answer;
    }
}