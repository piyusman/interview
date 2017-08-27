package test3;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    
    public static String largest(int[] nums){
        String[] arr = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr,new Comparator<String>(){

            @Override
            public int compare(String a, String b) {
                // TODO Auto-generated method stub
                return (b).compareTo(a);
            }
            
        });
        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }
     
        while(sb.charAt(0)=='0'&&sb.length()>1)
            sb.deleteCharAt(0);
     
        return sb.toString();
    }
    
    public static void main(String args[]){
        int[] nums = {319, 899, 584, 57, 9};
        ;
    }
}
