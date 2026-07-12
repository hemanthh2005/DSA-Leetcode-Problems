package StackAndQueue;

import java.util.Stack;

public class Next_Greater_Element_I {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack s=new Stack();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if(nums1[i]==nums2[j]){
                    break;
                    if(nums2[j]<nums2[j+1]){
                        s.push(nums2[j]);
                    }
                    else {
                        s.push(-1);
                    }
                }

            }
        }

    }
}
