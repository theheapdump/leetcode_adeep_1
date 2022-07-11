package medium.arrays;

import java.util.Arrays;

/*
 * Algorithm - Use Markers in row 0 and  col 0 to mark presence of  a 0
 * Loop through the matrix - if an element is 0 mark row0 that colum as 0 and
 * column0 that row as 0. If row == 0 , take a separate variable
 *
 * Iterate  over the sub matrix barring the marker row and  column
 * if marker row is 0 or marker column is 0 - mark the visited  element as 0
 *
 * Lastly , if [0][0] is 0 - make the entire 0th column 0
 *
 * If row marker is 0 , make the entire row 0 as 0
 */
public class SetMatrixZeroes {

  public void setZeroes(int[][] matrix) {
    int row0 = 1;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          matrix[0][j] = 0;
          if (i == 0) {
            row0 = 0;
          } else {
            matrix[i][0] = 0;
          }
        }
      }
    }
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[0].length; j++) {
        if (matrix[0][j] == 0 || matrix[i][0] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    if (matrix[0][0] == 0) {
      for (int i = 0; i < matrix.length; i++) {
        matrix[i][0] = 0;
      }
    }
    if (row0 == 0) {
      Arrays.fill(matrix[0], 0);
    }
  }
}
