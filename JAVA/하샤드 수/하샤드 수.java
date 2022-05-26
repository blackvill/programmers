class Solution {
    public boolean solution(int x) {
        // 나눌 것이므로 입력값을 저장해둠
        int input = x;
        int sum = 0;
        
        // 계속 10으로 나눈 나머지를 더해준다.
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        // 자릿수의 합으로 입력값을 나눠서 0이면 true 아니면 false
        return input % sum == 0 ? true : false;
    }
}