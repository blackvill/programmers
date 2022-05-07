class Solution {
    public int solution(int[][] triangle) {
        // 맨 아래부터 시작
        for (int i = triangle.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++)
				// 본인과 그  왼쪽에 값을 비교해서 더 큰값을 선택
				// 그 후 위에 값과 합치기
				triangle[i - 1][j] += Math.max(triangle[i][j], triangle[i][j + 1]);
		}
        
        return triangle[0][0];
    }
}