/*
  This program finds the sum of a sub matrix (a rectangle) with the given coordinates: (Row1, Col1) & (Row2, Col2)
*/


public class matrixRectangleSum{
    public static void main(String[]args){

        int[][] matrix = {{3,0,1,4,2}, {5,6,3,2,1}, {1,2,0,1,5}, {4,1,0,1,7}, {1,0,3,0,5} };
        int sum = sumRegion(matrix,2,1,4,3);

        System.out.println(sum);
        update(matrix, 3,2,2);

        sum = sumRegion(matrix,2,1,4,3);
        System.out.println(sum);

    }

     static void update(int[][] mat, int row, int col, int val){
        mat[row][col] = val;
    }

    static int sumRegion(int[][] mat, int row1, int col1, int row2, int col2){
        int sum = 0;                //Value to keep sum
        int row_dist = row2 - row1;      //Value to keep row distance
        int col_dist = col2 - col1;      //Value to keep column distance
        int count1 = 0;             //Counter for Rows


        while(count1 <= row_dist){

            int count2 = 0;         //Counter for each column distance
            int column = col1;

            while(count2 <= col_dist){

                sum = sum + mat[row1][column++];
                count2++;

            }
            row1++;
            count1++;
        }
        //System.out.print(sum);
        return sum;
    }
}