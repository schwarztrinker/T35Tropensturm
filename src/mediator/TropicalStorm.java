package mediator;

import java.util.Random;

public class TropicalStorm {

    int[][] tropicalStormMatrix = new int[20][20];




    public static int getN() {
        return N;
    }

    public int[][] getTropicalStormMatrix() {
        return tropicalStormMatrix;
    }

    public int[] getTropicalStormMatrixRow(int x) {
        return tropicalStormMatrix[x];
    }





    public TropicalStorm() {

        Random random = new Random();

        //fill matrix with
        for(int i = 0; i < 20; i++){
            for(int j =0; j< 20; j++){
                int x = random.nextInt(99);
                if(x < 65){
                    tropicalStormMatrix[i][j] = 1;
                }
                else tropicalStormMatrix[i][j] = 0;
            }
        }


    }


    static int N = 20;
    // Function to rotate the matrix 90 degree clockwise
    public void rotateClockwise() {
        final int M = tropicalStormMatrix.length;
        final int N = tropicalStormMatrix[0].length;
        int[][] ret = new int[N][M];
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                ret[c][M-1-r] = tropicalStormMatrix[r][c];
            }
        }
        tropicalStormMatrix = ret;
    }
}
