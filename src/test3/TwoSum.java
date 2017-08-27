package test3;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    Map<Integer,Integer> map = new HashMap<>();
    public void add(int n){
        if(map.containsKey(n)){
            map.put(n, map.get(n)+1);
        }
        else{
        map.put(n,1);
        }
    }
    
    public void find(int[]nums , int target){
        
        for(int i=0;i<nums.length;i++){
            int k = target - nums[i];
            if(map.containsKey(k)){
                if(map.get(k) < 2 && k==nums[i]){
                    continue;
                }
            }
        }
    }
}
