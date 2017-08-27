package test3;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    
    public boolean isomorphic(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<>();
        for(int i= 0;i<a.length();i++){
            char ac = a.charAt(i);
            char bc = a.charAt(i);
            if(map.containsKey(ac)){
            if(map.get(ac) != bc){
                return false;
            }
            }
            else {
                if(map.containsValue(bc)){
                    return false;
                }
                map.put(ac, bc);
            }
        }
        return true;
    }
}
