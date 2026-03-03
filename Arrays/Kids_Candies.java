package Hemanth;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
//1431

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Kids_Candies {

    public static void main(String[] args) {
        int [] arr={2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List <Boolean> result=new ArrayList<>();

        int maxcandies=0;
        for( int candy:candies){
            if(candy>maxcandies){
                maxcandies=candy;
            }
        }

        for (int candy : candies) {
            if (candy + extraCandies >= maxcandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
