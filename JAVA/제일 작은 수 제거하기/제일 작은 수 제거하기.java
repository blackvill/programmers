import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // arr 복사본
        int[] copy = arr.clone();

        // 크기가 1이라면 빈 배열이 될 것이니까 -1을 넣어줘야하므로 따로 처리
        if (arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        else {
            // 1개의 숫자를 제거한 배열이므로 사이즈는 -1
            int[] answer = new int[arr.length - 1];
            // 복사한 배열을 오름차순으로 정렬
            Arrays.sort(copy);
            
            // answer의 인덱스
            int idx = 0;

            for (int i = 0; i < arr.length; i++) {
                // 제일 작은 숫자라면 생략
                if (arr[i] == copy[0]) {
                    continue;
                }
                // answer에 arr의 값을 넣기
                answer[idx++] = arr[i];
            }
            return answer;
        }
    }
}