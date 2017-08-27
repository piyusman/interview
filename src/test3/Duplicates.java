package test3;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    
    public boolean duplicates(String s){
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.add(s.charAt(i))){
                return false;
            }
                
    }
        return true;
}
}

