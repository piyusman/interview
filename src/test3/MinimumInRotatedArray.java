package test3;

import java.util.ArrayList;

public class MinimumInRotatedArray {

    
    public static int findMinimuim(ArrayList<Integer> nums){
        int i =0;
        int j = nums.size()-1;
        while(i<=j){
            if(nums.get(i)<=nums.get(j)){
                return nums.get(i);
            }
            int m = (i+j)/2;
            if(nums.get(m)>=nums.get(i)){
                i=m+1;
            } else {
                j=m;
            }
            
        }
        return -1;
    }
    
    public static int searchInRotatedArray(int[] n, int target){
        int left= 0;
        int right = n.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(target == n[mid]){
                return mid;
            }
            if(n[left]<=n[right]){
                if(n[left]<=target && target<n[mid]){
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            } else {
                if(n[mid]<target && n[right]>=target){
                    left = mid+1;
                } else {
                    right = mid -1;
                }
                
            }
        }
        return -1;
    }
    public static void main(String[] args){
        
        int[] n1 = {5,6,7,8,1,2,3,4};
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(6);
        n.add(7);
        n.add(8);
        n.add(9);
        n.add(10);
        n.add(12);
        n.add(13);
        n.add(14);
        n.add(5);
        System.out.println(findMinimuim(n));
       
    }
}
