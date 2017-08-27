package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// TreeMap , Equals, HashCode , Comparator
// HashMap iteration

public class JavaFunctions {
    String name;
    int rollNo;
    
    public JavaFunctions(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    public static void main(String[] args){
        JavaFunctions jf2 = new JavaFunctions("Abby", 20);
        JavaFunctions jf3 = new JavaFunctions("Tabby", 12);
        JavaFunctions jf4 = new JavaFunctions("Cabby", 13);
        JavaFunctions jf5 = new JavaFunctions("Rabby", 17);
        JavaFunctions jf6 = new JavaFunctions("Cabby", 18);
        List<JavaFunctions> ljf = new ArrayList<>();
        ljf.add(jf2);
        ljf.add(jf3);
        ljf.add(jf4);
        ljf.add(jf5);
        ljf.add(jf6);
                Collections.sort(ljf,new Comparator<JavaFunctions>(){

                    @Override
                    public int compare(JavaFunctions o1, JavaFunctions o2) {
                        if(o1.name.equals(o2.name)){
                            return o2.rollNo - o1.rollNo;
                        }
                        return o1.name.compareTo(o2.name);
                    }
                    
                });
                for(JavaFunctions jfk : ljf){
                    System.out.println("Name: "+ jfk.name + " Roll No: " + jfk.rollNo);
                }
    }
@Override 
public boolean equals(Object o){
    if(o == this){
        return true;
    }
    if(o instanceof JavaFunctions){
        JavaFunctions jf = (JavaFunctions)o;
        return  name.equals(jf.name) && rollNo == jf.rollNo;
                
    }
    return false;
}    

@Override 
public int hashCode(){
    int result = 17;
    result = result *31 + name.hashCode();
    result = result*31 + rollNo;
    return result;
}

}
