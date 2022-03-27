import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌이 있는 학생이 도난당한 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                // 자기 자신이 포함되어있는지 체크
                if (lost[i] == reserve[j]) {
                    answer++; // 자신의 옷을 입으면 되니까 참여자 수 증가
                    lost[i] = -1;
                    reserve[j] = -1; 
                    break;
                }
            }
        }
        
        // 체육복 빌려주는 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                // 잃어버린 사람꺼보다 1 작거나 1 큰거 가능하니까
                if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
                    answer++;
                    reserve[j] = -1; 
                    break;
                }
            }
        }
        return answer;
    }
}