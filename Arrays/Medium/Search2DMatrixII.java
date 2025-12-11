public class Search2DMatrixII{
  public boolean searchMatrixII(int[][] matrix, int target){
    int rows = matrix.length, cols = matrix[0].length;
    int row = 0, col = cols-1;
    while(row < rows && col >= 0){
      int num = matrix[row][col];
      if(num == target) return true;
      else if(num < target) row++;
      else col--;
    }

    return false;
  }

  public static void main(String[] args){
    Search2DMatrixII obj1 = new Search2DMatrixII();
    int[][] matrix = {
      {1, 4, 7, 11, 15},
      {2, 5, 8, 12, 19},
      {3, 6, 9, 16, 22},
      {10, 13, 14, 17, 24},
      {18, 21, 23, 26, 30}
  };
    int target = 5;
    int target2 = 20;

    System.out.println(obj1.searchMatrixII(matrix, target));
    System.out.println(obj1.searchMatrixII(matrix, target2));
  }
}
