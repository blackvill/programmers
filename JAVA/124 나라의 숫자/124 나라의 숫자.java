class Solution {
    public String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";

        int num = n;

        while (num > 0) {
            int nb = num % 3;
            num /= 3;

            if (nb == 0)
                num--;

            answer = numbers[nb] + answer;
        }

        return answer;
    }
}