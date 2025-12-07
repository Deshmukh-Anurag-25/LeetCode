import java.util.Arrays;

public class FirstAndLastPos{

  public int searchRight(int[] nums, int target){
    int idx = -1;
    int left = 0, right = nums.length-1, mid = 0;
    while(left <= right){
      mid = (left+right)/2;
      if(nums[mid] == target){
        idx = mid;
        left = mid+1;
      }
      else if(nums[mid] > target){
        right = mid-1;
      }
      else left = mid+1;
    }

    return idx;
  }

  public int searchLeft(int[] nums, int target){
    int idx = -1;
    int left = 0, right = nums.length-1, mid = 0;
    while(left <= right){
      mid = (left+right)/2;
      if(nums[mid] == target){
        idx = mid;
        right = mid - 1;
      }
      else if(nums[mid] > target){
        right = mid-1;
      }
      else left = mid+1;
    }

    return idx;
  }

  public int[] searchRange(int[] nums, int target){
    int leftIdx = searchLeft(nums, target);
    int rightIdx = searchRight(nums, target);

    return new int[] {leftIdx, rightIdx};
  }

  public static void main(String[] args){
    FirstAndLastPos obj1 = new FirstAndLastPos();
    int[] nums = {5, 7, 7, 8, 8, 10};
    int target = 8;
    int[] result = obj1.searchRange(nums, target);
    System.out.println(Arrays.toString(result));
  }
}
