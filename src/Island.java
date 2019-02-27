import java.util.Random;

public class Island {

    //matrix with length 500 and width
    char[][] matrix = new char[500][200];

    public Island(){


        //set every field type 'f' by default
        for(int i = 0; i < 500; i++ ){
            for (int j = 0; j < 200; j++){
                matrix[i][j] = 'f';
            }
        }

        //500 buildings, 1000 cars, 50 energySupply, 500 houses
        // energySupplies and houses set

        Random random = new Random();
        //set 500 Buildings
        int buildingsSet = 0;

        while(buildingsSet < 500) {
            int x = random.nextInt(500);
            int y = random.nextInt(200);
            if (matrix[x][y] == 'f') {
                        matrix[x][y] = 'b';
                        buildingsSet++;
                    }
        }

        //set 1000 cars
        int carsSet = 0;
        while(carsSet < 1000) {
            int x = random.nextInt(500);
            int y = random.nextInt(200);
            if (matrix[x][y] == 'f') {
                matrix[x][y] = 'c';
                carsSet++;
            }
        }


        //set 50 enerySupplies (not in specification!)

        int energySuppliesSet = 0;
        while(energySuppliesSet < 50) {
            int x = random.nextInt(500);
            int y = random.nextInt(200);
            if (matrix[x][y] == 'f') {
                matrix[x][y] = 'e';
                energySuppliesSet++;
            }
        }

        //set 500 houses (not in specification!)

        int housesSet = 0;
        while(housesSet < 500) {
            int x = random.nextInt(500);
            int y = random.nextInt(200);
            if (matrix[x][y] == 'f') {
                matrix[x][y] = 'h';
                housesSet++;
            }
        }
    }

    public char getFieldType(int length, int width){
        return matrix[length][width];
    }

    public void setFieldType(int length, int width, char type){
        this.matrix[length][width] = type;
    }

    public boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }


}
