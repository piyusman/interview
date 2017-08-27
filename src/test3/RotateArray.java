package test3;

public class RotateArray {
     
    public void rotate(int[] a, int target){
        if(a==null || a.length<1){
            return;
        }
        int order = a.length - target;
        reverse(0,order-1,a);
        reverse(order,a.length-1,a);
        reverse(0,a.length-1,a);
    }
    
    public void reverse(int low,int high,int[] a){
        while(low<high){
            int temp = a[low];
            a[low] = a[high];
                    a[high] = temp;
                    low++;
                    high++;
        }
    }
}
