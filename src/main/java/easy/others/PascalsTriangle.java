package easy.others;

import java.util.ArrayList;
import java.util.List;

/*
 * Algorithm:
 * Make a table of (n) rows * (n+1) cols
 * first column is  unused for all rows
 * first row second  column is tip of triangle as 1
 * every element in the  triangle is sum  of element above and element above + left
 * the Last row's last element will land up in column n+1, hence 1 extra column
 */
public class PascalsTriangle {

  public List<List<Integer>> generate(int numRows) {
    int[][] res = new int[numRows][numRows + 1];
    res[0][1] = 1;
    for (int i = 1; i < res.length; i++) {
      for (int j = 1; j <= i + 1; j++) {
        res[i][j] = res[i - 1][j] + res[i - 1][j - 1];
      }
    }
    List<List<Integer>> resList = new ArrayList<>();
    resList.add(List.of(1));
    List<Integer> row;
    for (int i = 1; i < res.length; i++) {
      row = new ArrayList<>();
      for (int j = 1; j <= i + 1; j++) {
        row.add(res[i][j]);
      }
      resList.add(row);
    }
    return resList;
  }
}
