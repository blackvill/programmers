class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        
        for (int i = 0; i < count + 1; i++) {
            sum += price * i;
        }

        return sum > money ? sum - money : answer;
    }
}