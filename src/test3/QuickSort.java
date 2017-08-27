package test3;

public class QuickSort {
    
    public void sort(int[] a, int low, int high){
        if(low<high){
            int pivot = a[low+(high-low)/2];
            int i = low;
            int j= high;
            while(i<j){
                while(pivot>a[i]){
                    i++;
                }
                
                while(pivot<a[j]){
                    j--;
                }
                if(i<=j){
                int temp = a[i];
                a[i]=a[j];
                a[j] = temp;
                i++;
                j--;
                }
            }
            if(i<high){
                sort(a,i,high);
            }
            if(j>low){
                sort(a,low,j);
            }
        }
    }
}
