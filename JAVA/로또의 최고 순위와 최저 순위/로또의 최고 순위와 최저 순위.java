class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int count = 0;
        int[] answer = new int[2];
        
        for (int i = 0; i < lottos.length; i++) {
            // 모르는 번호 개수 구하기
            if (lottos[i] == 0) {
                zero++;
                continue;
            }
            
            // 맞는 숫자 개수 구하기
            for (int j = 0; j < win_nums.length; j++) {
                if (win_nums[j] == lottos[i])
                    count++;
            }
        }
        
        // 1 -> 6개
        // 2 -> 5개
        // 3 -> 4개
        // 4 -> 3개
        // 5 -> 2개
        // 6 -> 1이하
        // 7 - 갯수 == 등수
        // 단, 7로 계산을 하면 

        // 모르는 번호가 다 맞다고 가정
        answer[0] = 7 - (count + zero) >= 6 ? 6 : 7 - (count + zero);
            // <= 1 ? 1 : 7 - (count + zero);
        // 모르는 번호가 다 틀렸다고 가정
        answer[1] = 7 - count >= 6 ? 6 : 7 - count;
        
        return answer;
    }
}