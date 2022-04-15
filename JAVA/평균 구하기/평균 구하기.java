class Solution {
    public double solution(int[] arr) {
        int num = 0;
        double answer = 0;
        
        // 배열의 모든 원소값 더하기
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        
        // double형으로 형변환해주기
        answer = (double)num / arr.length;
        
        return answer;
    }
}