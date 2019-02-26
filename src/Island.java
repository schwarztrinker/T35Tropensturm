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

    }

    public char getFieldType(int length, int width){
        return matrix[length][width];
    }

    public void setFieldType(int length, int width, char type){
        this.matrix[length][width] = type;
    }


}
