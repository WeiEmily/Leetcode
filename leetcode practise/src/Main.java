import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2,3,4,3,1,2};
        HashSet<Integer> map = new HashSet<>();
        int count= 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.contains(nums[i])) {
                map.add(nums[i]);
                continue;
            } else {
                count++;
            }
        }
    }
}