import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n + 1];
        
        // 에라토스테네스 체 사용
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
		
	for (int i = 2; i * i < prime.length; i++) {
		if (prime[i]) {
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = false;
			}
		}
	}
        
        // 소수의 개수 세기
        for (int i = 1; i < prime.length; i++) {
			if (prime[i]) {
				answer++;
			}
		}
        
        return answer;
    }
}