package test3;

public class MergeSort {
    
    static int[] array;
    static int temp[];
    
    public void sort(int values[]){
        array = values;
        int len = array.length;
        temp = new int[len];
        mergeSort(0,len-1);
    }
    
    public void mergeSort(int low,int high){
        if(low<high){
            int mid = low + (high-low)/2;
            mergeSort(low,mid);
            mergeSort(mid+1,high);
            merge(low,mid,high);
        }
    }
        

        private void merge(int low, int mid, int high) {
        for(int i = low;i<=high;i++){
            temp[i] = array[i]; 
        }
        int i = low;
        int k = low;
        int j = mid+1;
        while(i<=mid && j<=high){
            if(temp[i] <temp[j]){
                array[k] = temp[i];
                i++;
             }
            else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        while(i<=mid){     
                array[k]= temp[i];
                k++;
                i++;
        }
    }

  
        
    
}
