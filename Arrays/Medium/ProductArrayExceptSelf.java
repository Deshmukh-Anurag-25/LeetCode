import java.util.Arrays;

public class ProductArrayExceptSelf{
  public int[] productExceptSelf(int[] nums){
    int[] prefix = new int[nums.length];
    prefix[0] = 1;
    for(int i = 1; i < nums.length; i++){
      prefix[i] = prefix[i-1]*nums[i-1];
    }
    int suffix = 1;
    for(int i = nums.length - 2; i >= 0; i--){
      suffix *= nums[i+1];
      prefix[i] *= suffix;
    }

    return prefix;
  }

  public static void main(String[] args){
    ProductArrayExceptSelf obj1 = new ProductArrayExceptSelf();
    int[] nums = {1, 2, 3, 4};
    int[] result = obj1.productExceptSelf(nums);
    System.out.println(Arrays.toString(result));
  }
}
