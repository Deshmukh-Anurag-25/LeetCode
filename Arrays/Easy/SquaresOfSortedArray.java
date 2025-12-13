import java.util.Arrays;

public class SquaresOfSortedArray{
  public int[] sortedSquares(int[] nums){
    int[] result = new int[nums.length];
    int i = 0, j = nums.length - 1, k = nums.length-1;
    while(i <= j){
      if(Math.abs(nums[i]) < Math.abs(nums[j])){
        result[k--] = nums[j]*nums[j];
        j--;
      }
      else{
        result[k--] = nums[i]*nums[i];
        i++;
      }
    }

    return result;
  }

  public static void main(String[] args){
    SquaresOfSortedArray obj1 = new SquaresOfSortedArray();
    int[] nums = {-4, -1, 0, 3, 10};
    System.out.println(Arrays.toString(obj1.sortedSquares(nums)));
  }
}
