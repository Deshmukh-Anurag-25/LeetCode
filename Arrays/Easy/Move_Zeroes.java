
import java.util.Arrays;

public class Move_Zeroes{
  public void moveZeroes(int[] nums){
    int j = 0;
    for(int i = 0; i < nums.length; i++){
      if(nums[i] != 0){
        if(i != j){
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
        }
        j++;
      }
    }
  }

  public static void main(String[] args){
    Move_Zeroes obj1 = new Move_Zeroes();
    int[] nums = {1, 0, 2, 0, 3, 12};
    obj1.moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
  }
}
