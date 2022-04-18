class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int idx = 0; // 인덱스값 체크
        
        // n개까지 반복
        for (int i = 1; i <= n; i++) {
            // long형으로 캐스팅해서 값 넣어주기
            answer[idx++] = (long)x * i;
        }
        
        return answer;
    }
}