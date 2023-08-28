public int[][] updateMatrix(int[][] mat) {
        // Given m * n binary matrix, return distance of the nearest 0
        // distance between two adjacent cell is 1 - Left/ Right / Up / Down
        // there is at least one 0 in the matrix
        int rows = mat.length; 
        int cols = mat[0].length;
        int[][] dist = new int[rows][cols];
        Queue<int[]> qu = new LinkedList<>();
        // intialize dist output matrix, with 0s and put all 0s into a queue.
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {
                if (mat[row][col] == 0) {
                    qu.offer(new int[] { row, col});
                } 
                else mat[row][col] = Integer.MAX_VALUE;
            }
        }

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // expand out from all 0s, keep the min dist.
        while(!qu.isEmpty()) {
            int[] cell = qu.poll();
            for (int[] dir: directions) {
                int r = cell[0] + dir[0], c = cell[1] + dir[1];
                if (r >= 0 && r < rows && c < cols && c >= 0
                && mat[r][c] > mat[cell[0]][cell[1]] + 1) {
                    qu.offer(new int[]{r, c});
                    mat[r][c] = mat[cell[0]][cell[1]] + 1;
                }
            }
        }
        return mat;
    }
