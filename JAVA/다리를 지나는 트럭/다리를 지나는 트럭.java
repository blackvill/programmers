import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new LinkedList<>();
		int weights = 0;
		int time = 0; 

		for(int i = 0; i < truck_weights.length; i++) {
            // 현재 트럭
			int now = truck_weights[i];

            while(true) {
                // 큐가 비어있으면 트럭이 지나갈 수 있음
                if (queue.isEmpty()) { 
                    queue.add(now);
                    // 다리위에 있는 트럭의 무게
                    weights += now;
                    // 다리에 올라가는 시간
                    time++;
                    break;
                }
                // 큐의 길이가 다리의 길이와 같으면
                else if (queue.size() == bridge_length) {
                    weights -= queue.poll();
                }
                // 다리 길이만큼 큐가 차지 않은 경우
                else {
                    // 큐에 들어있는 트럭들의 무게와 현재 트럭의 무게가 다리가 견디는 무게보다 작거나 같으면
                    if (weights + now <= weight) {
                        // 현재 트럭을 큐에 넣어줌
                        queue.add(now);
                        weights += now;
                        time++;
                        break;
                    }
                    // 아니라면 큐에 0을 넣어줌
                    else {
                        queue.add(0);
                        time++;
                    }
                }
            }
        }
        // 걸린 시간 + 다리길이 (마지막 트럭도 다리 길이만큼 지나가야하기에)
		return time + bridge_length;
    }
}