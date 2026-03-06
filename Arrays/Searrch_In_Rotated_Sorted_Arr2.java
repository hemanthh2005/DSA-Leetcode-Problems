package Hemanth;

//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
//81

public class Searrch_In_Rotated_Sorted_Arr2 {
    public static void main(String[] args) {
        int [] arr={1,0,1,1};
        System.out.println(search(arr,0));
    }
    public static boolean search(int[] nums, int target) {
        int piovot=findpivot(nums);

        if(piovot==-1){
          return binary_Search(nums,target,0,nums.length-1)==-1;
        }
        if(nums[piovot]==target){
            return true;
        }
        if(nums[0]<=target){
            return binary_Search(nums,target,0,piovot-1)!=-1;
        }
        else {
           return binary_Search(nums,target,piovot+1,nums.length-1)!=-1;
        }

    }

    static int binary_Search(int[] nums, int target, int start, int end) {
        while (start<=end){
            int mid=start+(end-start)/2;

            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
               start=mid+1;
            } else if (nums[mid]>target) {
                end=mid-1;
            }
            else {return mid;}

        }
        return -1;
    }

    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }


            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
