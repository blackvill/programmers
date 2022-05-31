import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 중복이 없는 상태에 최대로 데려갈 수 있는 경우는 N/2마리
        int max = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();

        // set은 중복허용x
        for (int num : nums) {
            set.add(num);
        }

        // 중복을 제거했을 때 max보다 크면 max, 작으면 size를 리턴
        return set.size() > max ? max : set.size();
    }
}