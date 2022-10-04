import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;

        System.out.println(twoSum(nums,target) );
    }
    public static int twoSum(int[] nums, int target) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(target);
        for (int i = 0; i < nums.length; i++) {
            treeSet.add(nums[i]);
        }
        ArrayList<Integer> arrayList = new ArrayList<>(treeSet);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == target) {
                return i;
            }
        }
        return 0;
    }
}