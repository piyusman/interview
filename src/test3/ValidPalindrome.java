package test3;

public class ValidPalindrome {
     
    public boolean isValidPalindrome(String s){
         s= s.replaceAll("[^a-z0-9A-Z","").toLowerCase();
         for(int i =0; i<s.length()/2;i++){
             if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                 return false;
             }
         }
         return true;
     }
}
