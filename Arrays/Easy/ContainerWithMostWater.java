import java.util.Arrays;
public class ContainerWithMostWater{
  public int mostWater(int[] height){
    int i = 0, j = height.length-1;
    int maxArea = 0, area = 0;
    while(i < j){
      area = (j-i)*Math.min(height[i], height[j]);
      maxArea = Math.max(maxArea, area);

      if(height[i] < height[j]) i++;
      else j--;
    }

    return maxArea;
  }

  public static void main(String[] args){
    int[] nums = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    ContainerWithMostWater obj1 = new ContainerWithMostWater();
    int result = obj1.mostWater(nums);
    System.out.println(result);
  }
}
