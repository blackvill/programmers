class Solution {
    public String solution(int n) {
        // 수박이 반복이므로 넣어두기
        String[] subak = {"수", "박"};
        String answer = "";
        
        // n 만큼 반복
        for (int i = 0; i < n; i++) {
            // 2로 나눠서 0이면 수, 1이면 박을 answer에 추가해주기
            answer += subak[i % 2];
        }
        
        return answer;
    }
}