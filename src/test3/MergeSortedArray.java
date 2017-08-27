package test3;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArray {

    public ArrayList<Integer> mergeSorteArrays(ArrayList<Integer> a, ArrayList<Integer> b){
        if(a==null && b!=null){
            System.out.println("hello");
            System.out.println(b.size());
            return b;
        }
        if(b== null && a!=null){
            System.out.println("hello");
            return a;
        }
        if((a==null && b==null) || (a.size()<1 && b.size()<1) ){
            return null;
        }
        int alen = a.size();
        int blen = b.size();
        System.out.println(b.size());
        while(alen>0 && blen>0){
            if(a.get(alen-1)>b.get(blen-1)){
                a.add(alen+blen-1, a.get(alen-1));
                alen--;
            } else {
                a.add(alen+blen-1, b.get(blen-1));
                blen--;
            }
        }
        while(blen>0){
            a.add(alen+blen-1, b.get(blen-1));
            blen--;
        }
        return a;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(22);
        list.add(21);
        list.add(212);
        list.add(221);
        list.add(25);
        list.add(21);
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(222);
        list.add(211);
        list.add(27);
        list.add(29);
        list.add(20);
        list.add(25);
        MergeSortedArray m = new MergeSortedArray();
        Collections.sort(list);
        Collections.sort(list2);
        //ArrayList<Integer> d = m.mergeSorteArrays(null,list);
        //for(int i : d){
            //System.out.println(i); 
            
        //}
        System.out.println(m.countUnique(list));
        System.out.println(m.removeDuplicates(list));
    }
    
    public int countUnique(ArrayList<Integer> l){
        int count = 0;
        for(int i = 0;i<l.size()-1;i++){
            if(l.get(i) == l.get(i+1)){
                count++;
            }
        }
        return l.size()-count;
    }
    
    public ArrayList<Integer> removeDuplicates(ArrayList<Integer> l){
        int j=0;
        int i =1;
        while(i<l.size()){
            if(l.get(i) == l.get(j)){
                i++;
            } else {
                j++;
                l.add(j,l.get(i));
                        i++;
            }
        }
        return l;
    }
}
