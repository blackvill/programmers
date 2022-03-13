import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            
            // 0부터 돌면 똑같은 값을 계속 중복적으로 구하게 됨
            // 따라서 기준숫자 이후로 계산
			for (int j = i + 1; j < numbers.length; j++) {
				sum = numbers[i] + numbers[j];
                
                // 있는 지 체크
				if (!list.contains(sum)) {
					list.add(sum);
				}
			}
		}

		int[] answer = new int[list.size()];
        
        // 리스트에 있는 값들을 넣어주기
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

        // 오름차순 정렬
		Arrays.sort(answer);
        
        return answer;
    }
}