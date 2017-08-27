package test3;

public class ReverseWords {

    public void reverseStrings(String a){
        String[] split = a.split(" ");
        StringBuilder sb =new StringBuilder();
        for(int i= split.length-1;i>=0;i--){
            sb.append(split[i] + " ");
        }
    }
}
