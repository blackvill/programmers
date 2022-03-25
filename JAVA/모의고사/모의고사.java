import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] check = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] score = new int[3];
        
        // 문제를 맞출때마다 score 증가
        for (int i = 0; i < answers.length; i++) {
            // i % check[0].length 를 통해 문제 수가 더 많을 경우도 반복 처리 가능
            if (answers[i] == check[0][i % check[0].length]) {
                score[0]++;
            }
            if (answers[i] == check[1][i % check[1].length]) {
                score[1]++;
            }
            if (answers[i] == check[2][i % check[2].length]) {
                score[2]++;
            }
        }
        
        // 최고값을 구하기
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        // 최고값이 몇개가 될 지 몰라서 리스트를 만들어 넣어준 후 처리
        ArrayList<Integer> list = new ArrayList<>();
        
        // 3명이므로 3번 반복
        for (int i = 0; i < 3; i++) {
            // 최고점과 같은 경우에 리스트에 추가
            if (score[i] == max)
                list.add(i);
        }
        
        // 정답 출력
        int[] answer = new int[list.size()];
        int idx = 0;
        
        for (int a : list) {
            // 0,1,2로 들어가기 때문에 1증가
            answer[idx++] = a + 1;
        }
        
        return answer;
    }
}