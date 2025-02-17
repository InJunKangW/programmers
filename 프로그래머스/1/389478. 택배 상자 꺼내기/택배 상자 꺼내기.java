class Solution {
    public int solution(int n, int w, int num) {
        int rows = (n + w - 1) / w; // 필요한 행 개수 계산
        int[][] warehouse = new int[rows][w];

        int box = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // 왼쪽 → 오른쪽
                for (int j = 0; j < w && box <= n; j++) {
                    warehouse[i][j] = box++;
                }
            } else {
                // 오른쪽 → 왼쪽
                for (int j = w - 1; j >= 0 && box <= n; j--) {
                    warehouse[i][j] = box++;
                }
            }
        }

        // num의 위치 찾기
        int targetRow = -1, targetCol = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < w; j++) {
                if (warehouse[i][j] == num) {
                    targetRow = i;
                    targetCol = j;
                    break;
                }
            }
            if (targetRow != -1) break;
        }

        // 꺼내야 하는 상자 개수 계산
        int count = 0;
        for (int i = targetRow; i < rows; i++) {
            if (warehouse[i][targetCol] != 0) count++;
        }

        return count;
    }
}