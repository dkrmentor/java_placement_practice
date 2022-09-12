package imp_codes;

public class sumOfRowCol {

    public static void main(String[] args) {
        int matrix[][] = {
                {1, 3, 4},
                {2, 4, 3},
                {3, 4, 5},
        };

        System.out.println("print matrix");
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j <3 ; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("SUM OF ROWS");
        for(int i = 0 ; i<3 ;i++){
            int sum = 0;
            for(int j =0 ; j<3 ; j++){
                sum = sum + matrix[i][j];
            }
            System.out.println("sum of row " + (i+1) + " = " +sum);
        }

        System.out.println("SUM OF COLUMN");
        for(int i =0 ; i<3 ; i++){
            int sum =0;
            for (int j =0; j<3 ; j++){
                sum = sum + matrix[j][i];
            }
            System.out.println("sum of col "+ (i+1) + " = " +sum);
        }


}



}
