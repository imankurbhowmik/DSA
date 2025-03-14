public class Six_floodFillAlgorithm {
    public static void main(String[] args) {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        int sr = 1;
        int sc = 0;
        int color = 2;
        int[][] ans = floodFill(image, sr, sc, color);
        for(int i=0 ; i<image.length; i++) {
            for(int j=0; j<image[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] modifiedImage = image;
        int initialColor = modifiedImage[sr][sc];
        dfs(modifiedImage, sr, sc, color, initialColor);
        return modifiedImage;
    }

    private static void dfs(int[][] modified, int sr, int sc, int color, int initialColor) {
        modified[sr][sc] = color;

        int[] delRow = {-1, 0, 1, 0};
        int[] delColumn = {0, 1, 0, -1};

        for(int i=0; i<4; i++) {
            int nRow = sr + delRow[i];
            int nCol = sc + delColumn[i];
            if(nRow>=0 && nRow<modified.length && nCol>=0 && nCol<modified[nRow].length && modified[nRow][nCol] != color && modified[nRow][nCol] == initialColor) {
                dfs(modified, nRow, nCol, color, initialColor);
            }
        }
    }
}