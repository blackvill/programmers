class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
 
        // 전체 격자 개수
        int area = brown + yellow;
 
        for (int i = 1; i <= area; i++) {
            int row = i; // 세로
            int col = area / row; // 가로
 
            // 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
            // 세로가 길면 돌아가기
            if (row > col)
                continue;
            
            // 가로와 세로 모두 노란색을 감싸기 위해서는
            // 상하좌우 각각 1개씩, 즉 세로 - 2, 가로 - 2가 노란색과 같아야한다.
            if ((row - 2) * (col - 2) == yellow) {
                answer[0] = col;
                answer[1] = row;
                return answer;
            }
        }
        
        return answer;
    }
}