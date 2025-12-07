import java.util.HashSet;

public class ContainsDuplicates{
  public boolean containsDuplicates(int[] nums){
    HashSet<Integer> set = new HashSet<>();
    for(int num : nums){
      if(set.contains(num)) return true;
      set.add(num);
    }

    return false;
  }

  public static void main(String[] args){
    ContainsDuplicates obj1 = new ContainsDuplicates();
    int[] nums = {1, 2, 3, 1};
    int[] nums1 = {1, 2, 3, 4};
    System.out.println(obj1.containsDuplicates(nums));
    System.out.println(obj1.containsDuplicates(nums1));

  }
}
