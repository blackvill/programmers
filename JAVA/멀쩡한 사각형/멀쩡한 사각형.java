class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        
        // 가로 * 세로 - (가로 + 세로 - 최대공약수)
        answer = (long)w * (long)h - ((long)w + (long)h - gcd((long)w, (long)h));
        
        return answer;
    }
    
    // 최대 공약수 구하는 함수
    long gcd(long width, long height) {
        long small = height > width ? width : height;
        long big = width > height ? width : height;
        long temp = 0;
        
        while (small > 0) {
            temp = big % small;
            
            big = small;
            small = temp;
        }
        
        return (big);
    }
}