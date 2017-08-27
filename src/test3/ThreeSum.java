package test3;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
    
    public ArrayList<ArrayList<Integer>> threeSum(int[] nums){
        if(nums==null && nums.length<3){
            return null;
        }
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || nums[i] > nums[i-1]){
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
            if(nums[i]+nums[j]+nums[k] == 0){
                ArrayList<Integer> al = new ArrayList<>();
                al.add(nums[i]);
                al.add(nums[j]);
                al.add(nums[k]);
                list.add(al);
                j++;
                k--;
            
            while(k<nums.length && nums[k] == nums[k+1]){
                k--;
            }
            while(j>nums.length && nums[j] == nums[j--]){
                j++;
            }
            
            } else if (nums[i] + nums[j] + nums[k] < 0){
                j++;
            } else {
                k--;
            }
            }
        }
    }
        return list;
    }
    
    public static void main(String args[]){
        int[] nums = {2,3,4,-2,-3,-1 ,1 , 0 , 0 ,-1 , -3 , 8 , 9 ,4};
        ThreeSum sum = new ThreeSum();
        ArrayList<ArrayList<Integer>> al = sum.threeSum(nums);
        for(ArrayList<Integer> l : al){
            System.out.println(l);
        }
    }
}
