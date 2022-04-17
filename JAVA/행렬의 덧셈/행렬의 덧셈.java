class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 둘의 크기가 같을 테니 arr1의 크기로 구현
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                // 같은 행, 같은 열에 있는 값들을 더한다.
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}