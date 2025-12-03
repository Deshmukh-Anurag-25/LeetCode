import java.util.HashMap;
import java.util.Arrays;

public class TwoSum{
  public int[] twoSum(int[] nums, int target){
    int moreNeeded = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
      moreNeeded = target - nums[i];
      if(map.containsKey(moreNeeded)){
        return new int[] {map.get(moreNeeded), i};
      }
      map.put(nums[i], i);
    }

    return new int[] {-1, -1};
  }

  //Time Complexity = O(n) - single pass through array
  //Space Complexity = O(n) - Hashmap stores upto n elements

  public static void main(String[] args){
    TwoSum obj1 = new TwoSum();
    int[] nums = {2, 7, 9, 11};
    int target = 9;
    int[] result = obj1.twoSum(nums, target);
    System.out.println(Arrays.toString(result));
  }
}
