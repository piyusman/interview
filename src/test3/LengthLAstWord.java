package test3;

public class LengthLAstWord {
    public int lengthOfLastWord(String s){
        String[] a = s.split(" ");
        if(a==null || a.length<1){
            return 0;
        }
        return a[a.length-1].length();
    }
}
