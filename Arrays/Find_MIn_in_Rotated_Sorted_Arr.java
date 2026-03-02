

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
//153

public class Find_MIn_in_Rotated_Sorted_Arr {
    public static void main(String[] args) {
        int [] nums={4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int pivot=findpivot(nums);
        return nums[pivot];
    }

    private static int findpivot(int[] nums) {
        int start=0;
        int end=nums.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return mid+1;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid;
            }
            else if(nums[start] < nums[mid]   && nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }return -1;
    }
}
