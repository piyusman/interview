package test3;

import java.util.ArrayList;

public class Sampletest {

    
    public static void myMethod(int in, ArrayList<Integer> list){
        in +=5;
        list.add(3);
    }
    
    public static void main(String args[]){
        String a= new String("abc");
        String b = new String("abc");
        String c = "abc";
        String d = "abc";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(c==d);
        /*
        int i =10;
        ArrayList<Integer> myList = new ArrayList<Integer>();
        myList.add(1);
        myList.add(2);
        myMethod(i,myList);
        System.out.println(i);
        System.out.println(myList);
        */
    }
}
