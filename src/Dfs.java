public class Dfs {
    public static boolean explore(int[][] matrix, boolean[][] explored, int row, int col) {
        if(row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length) {
            return false;
        }

        if(matrix[row][col] == 0) {
            explored[row][col] = true;
            return false;
        }

        boolean found = matrix[row][col] == 1 && !explored[row][col] ? true : false;
        if(!explored[row][col]) {
            explored[row][col] = true;
            explore(matrix, explored, row + 1, col);
            explore(matrix, explored, row, col + 1);
            explore(matrix, explored, row - 1, col);
            explore(matrix, explored, row, col - 1);
        }

        
        
        return found;

    }
}
