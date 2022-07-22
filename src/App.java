public class App {
    public static void main(String[] args) throws Exception {
        int[][] matrix = {
            {0,1,0,0,1},
            {1,1,0,1,1},
            {1,1,0,0,1},
            {0,0,0,1,0},
            {1,1,0,1,0}
        };

        boolean[][] explored = new boolean[matrix.length][matrix[0].length];

        int count = traverseMatrix(matrix, explored);
        
        System.out.println(count);
    }

    public static int traverseMatrix(int[][] matrix, boolean[][] explored) {
        int count = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                boolean found = Dfs.explore(matrix, explored, row, col);
                if(found) {
                    count++;
                }
            }
        }

        return count;
    }
}
