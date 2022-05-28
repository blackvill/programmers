class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = lcm(n, m);
        int[] answer = {gcd, lcm};
        
        return answer;
    }
    
    // 최소공배수
    public static int lcm(int x, int y) {
	    //0이 아닌 두 수의 곱 / 두 수의 최대공약수
        return (x * y) / gcd(x, y);
    }

    // 최대공약수
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}