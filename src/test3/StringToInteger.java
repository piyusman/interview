package test3;

public class StringToInteger {
        
    public int aToi(String s){
        if(s==null || s.length()<1){
            return 0;
        }
        s = s.trim();
        char flag = '+';
        int i=0;
        if(s.charAt(0) == '-'){
            i++;
        }
        else if(s.charAt(0)=='+'){
            i++;
        }
        double result = 0;
        
        while(s.length()>i && s.charAt(i)>='0' && s.charAt(i)<='9'){
            result = result * 10 + (s.charAt(i)-'0');
            i++;
        }
        if(flag == '-'){
            result = -result;
        }
        return (int)result;
    }
}
