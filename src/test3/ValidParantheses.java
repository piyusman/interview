package test3;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {
    
    public boolean isValid(String a){
    HashMap<Character,Character> map = new HashMap<Character,Character>();
    map.put( '(', ')' );
    map.put('[',']');
    map.put('{', '}');
    
    Stack<Character> stack = new Stack<Character>();
    for(int i =0; i<a.length();i++){
        char c= a.charAt(i);
        if(map.keySet().contains(c)){
            stack.push(c);
        }
        else if(map.values().contains(c)){
            if((stack.peek()==c) && !stack.empty()){
                stack.pop();
            }
        }
        else {
            return false;
        }
    }
    return true;
    }
}
