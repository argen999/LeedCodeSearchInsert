import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(twoSum(nums,target) );
        /**
         *Жанар агай жардам чыгарып берди жакшысын
         */
        System.out.println(twoSum2(nums,target) );
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
    public static int twoSum2(int[] nums, int target) {
        int low = 0 ,
                high = nums.length - 1 ,
                ans = -1;
        while(low <= high) {
            int mid = (low+high) / 2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target) {
                low = mid + 1;
                ans = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}