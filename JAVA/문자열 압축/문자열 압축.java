class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        int len = s.length();
        
        // 입력받는 문자열의 길이 == 1일 때 예외처리
        if (s.length() == 1)
            return 1;
        
        // 압축을 시키기 위해선 앞의 길이와 뒤의 길이가 적어도 동일해야하므로
        // len / 2까지만 반복
        for (int i = 1; i <= len / 2; i++) {
            // substring을 사용해서 압축시킬 문자열의 길이를 늘려나가기
            // pattern == 압축시킬 문자열 패턴
        	String pattern = s.substring(0, i);
        	int cnt = 1; // pattern을 몇 번 사용했는지
        	String str = "";
            
        	for(int j = i; j <= s.length() - i; j += i) {
                // 문자열과 다음에 오는 문자열이 일치하는지 체크
        		if (pattern.equals(s.substring(j, j + i))) {
    				cnt++; // pattern을 사용해서 압축시켰으니까 횟수 증가
    			} else {
                    // 압축을 했으면
    				if(cnt > 1) {
                        // 압축된 횟수를 적어주기 ex) abab > 2ab
    					str += cnt + "";
    				}
                    // 압축시킨 패턴을 붙이기
   				    str += pattern;
                    // 다른 문자열이 왔으니까 새로운 패턴을 압축시킬 패턴으로 갱신
    				pattern = s.substring(j, j + i);
                    // 처음 사용하는 것이니 1로 초기화
    				cnt = 1;
    			}
        	}
        	
            // 마지막에 압축시키지 않은 문자열 패턴을 압축시키기
        	if (cnt > 1) {
    			str += cnt + "";
    		}
    		str += pattern;
    		
            // i개 단위로 자르고 남은 문자열 길이
    		int remain = s.length() % i;
            // 최솟값 갱신
    		answer = Math.min(answer, str.length() + remain);
        }
        
        return answer;
    }
}