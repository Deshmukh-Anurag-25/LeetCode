import java.util.Arrays;

public class TwoSumII{
  public int[] twoSum(int[] nums, int target){
    int i = 0, j = nums.length - 1;
    int sum = 0;
    while(i < j){
      sum = nums[i] + nums[j];
      if(sum == target) return new int[] {i+1, j+1};
      else if(sum > target) j--;
      else if(sum < target) i++;
    }

    return new int[] {-1, -1};
  }

  public static void main(String[] args){
    TwoSumII obj1 = new TwoSumII();
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] result = obj1.twoSum(nums, target);
    System.out.println(Arrays.toString(result));
  }
}
