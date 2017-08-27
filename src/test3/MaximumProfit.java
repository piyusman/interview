package test3;

public class MaximumProfit {
 
    
    public int maxProfit(int[] a){
        int min =a[0];
        int max = 0;
        for(int i = 1;i<a.length;i++){
            max = Math.max(max, a[i]-min);
            min = Math.min(min, a[i]);
        }
        return max;
    }
}
