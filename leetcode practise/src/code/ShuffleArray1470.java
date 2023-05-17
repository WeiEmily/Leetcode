package code;

public class ShuffleArray1470 {
    public static void main(String[] args) {
        int[] a = {2,5,1,3,4,7};
        shuffle(a,3 );
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] num = new int[nums.length];
        
        int p1 = 0;
        int p2 = n;
        for(int i = 0; i < num.length ; i++){
            if(i % 2 == 0){
                num[i] = nums[p1];
                p1++;
            }
            if(i % 2 != 0){
                num[i] = nums[p2];
                p2++;
            }
        }
        return num;
    }
}
