
//41
public class First_Missing_Possitive {
    public static void main(String[] args) {
        int [] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int currect = nums[i] - 1;
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[currect]) {
                swap(nums, i, currect);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        } return nums.length+1;
    }
    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
