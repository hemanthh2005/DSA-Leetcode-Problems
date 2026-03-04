package Hemanth;

public class Median_of_two_sorted_arrays {
    public static void main(String[] args) {
        int [] num1={1,2};
        int [] num2={3,4};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median=0;
        int start1=0;
        int end1=nums1.length-1;
        int start2=0;
        int end2=nums2.length-1;
        int k=0;
        int [] result=new int[nums1.length+nums2.length];
        while (start1<=end1 && start2<=end2) {
            if (nums1[start1] < nums2[start2]) {
                result[k] = nums1[start1];
                start1++;
                k++;
            } else {
                result[k] = nums2[start2];
                start2++;
                k++;
            }
        }
            if(start1<=end1) {
            while (start1 <= end1) {
                result[k] = nums1[start1];
                start1++;
                k++;
            }
        }else{
            while (start2<=end2){
                result[k]=nums2[start2];
                start2++;
                k++;
            }

            }
            if(end1==-1){
                while (start2<=end2){
                result[k]=nums2[start2];
                start2++;
                k++;
            }
            }else{
                while (start1<=end1){
                    result[k]=nums1[start1];
                    start1++;
                    k++;
                }
            }


        int s3=0;
        int e3=result.length-1;

        int mid=s3+(e3-s3)/2;
        if(e3%2==0){
          median=result[mid];
        }
        else{
            median=((double) result[mid]+ (double) result[mid + 1]) /2;
        }return median;
        }

    }


