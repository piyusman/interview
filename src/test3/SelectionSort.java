package test3;

public class SelectionSort {
    
    public static void sort(int[] a){
        for(int i=0;i<a.length;i++){
            int index =i;
            for(int j = i+1; j<a.length;j++){
                if(a[index]>a[j]){
                    index = j;
                }
            }
            int temp = a[i];
             a[i] = a[index];
             a[index] = temp;
        }
    }
}
