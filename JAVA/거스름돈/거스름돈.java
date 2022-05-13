class Solution {
    public int solution(int n, int[] money) {
        int[] answer = new int[100001];
        // 0원을 거슬러주는 방법은 1
        answer[0] = 1;
        
        // 모든 money에 대응해서 처리
        for(int i = 0; i < money.length ; i++) {
            // 현재 화폐 ~ 다음 화폐까지 가능한 수 체크
            for(int j = money[i]; j <= n; j++) {
                // 현재 화폐를 사용하지 않고 지금화폐를 사용할 때의 개수
                answer[j] += answer[j - money[i]];
                // 제한사항에 맞게 나눠주기
                answer[j] %= 1000000007;
            }
        }
        
        return answer[n];
    }
}