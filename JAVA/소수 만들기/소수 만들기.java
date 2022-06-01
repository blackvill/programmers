import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean[] prime = new boolean[3001];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // 에라토스테네스의 체를 사용해 소수 구하기
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = false;
                }
            }
        }
        
        // for문을 이용하여 배열의 합을 구한다.         
        for (int i = 0; i < nums.length; i++) {
        	for (int j = i + 1; j < nums.length; j++) {
        		for (int h = j + 1; h < nums.length; h++) {
                    // 3개의 숫자의 합을 구해서 리스트에 담기
        			list.add(nums[i] + nums[j] + nums[h]);
        		}
        	}
        }
        
        // 합들을 소수인지 판단
        for (int sum : list) {
            // 소수라면 answer 증가
            if (prime[sum])
                answer++;
        }

        return answer;
    }
}